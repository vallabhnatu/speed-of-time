package vallabhnatu.speedoftime.clock.multiplier;

import java.time.Instant;
import java.util.Date;

public interface MultiplierClock {

    long getTime();

    default Date getDate() {
        return new Date(getTime());
    }

    default Instant getInstant() {
        return Instant.ofEpochMilli(getTime());
    }

}
