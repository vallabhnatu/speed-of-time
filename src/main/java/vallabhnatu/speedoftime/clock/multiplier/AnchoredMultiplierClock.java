package vallabhnatu.speedoftime.clock.multiplier;

import java.time.Instant;
import java.util.Date;

public class AnchoredMultiplierClock implements MultiplierClock {

    private final long timestamp;
    private final long anchor;
    private final double multiplier;

    public AnchoredMultiplierClock(long anchor) {
        this.timestamp = new Date().getTime();
        this.anchor = anchor;
        this.multiplier = 1D;
    }

    public AnchoredMultiplierClock(Date anchor) {
        this(anchor.getTime());
    }

    public AnchoredMultiplierClock(Instant anchor) {
        this(anchor.toEpochMilli());
    }

    public AnchoredMultiplierClock(double multiplier) {
        long now = new Date().getTime();
        this.timestamp = now;
        this.anchor = now;
        this.multiplier = multiplier;
    }

    public AnchoredMultiplierClock(long anchor, double multiplier) {
        this.timestamp = new Date().getTime();
        this.anchor = anchor;
        this.multiplier = multiplier;
    }

    public AnchoredMultiplierClock(Date anchor, double multiplier) {
        this(anchor.getTime(), multiplier);
    }

    public AnchoredMultiplierClock(Instant anchor, double multiplier) {
        this(anchor.toEpochMilli(), multiplier);
    }

    @Override
    public long getTime() {
        return anchor + Math.round((new Date().getTime() - timestamp) * multiplier);
    }

}
