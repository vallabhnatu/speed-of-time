package vallabhnatu.speedoftime.clock.multiplier;

import java.util.Date;

public class DefaultMultiplierClock implements MultiplierClock {

    private final double multiplier;

    public DefaultMultiplierClock() {
        this.multiplier = 1D;
    }

    public DefaultMultiplierClock(double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public long getTime() {
        return Math.round((double) new Date().getTime() * multiplier);
    }

}
