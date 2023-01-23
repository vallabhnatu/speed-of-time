# Speed of Time
Java library to speed up, slow down or reverse time. Any pull requests are welcome!

## Usage

### Multipliers

Multipliers define the scale and direction of manipulated time.
- A value of `2` will make time twice as fast.
- A value of `0.5` will slow down the time to half.
- A value of `-1` will reverse the time.

### DefaultMultiplierClock
Default Multiplier Clock will start at `now * multiplier` timestamp and will continue at a scale of `multiplier`. This is handy in a scenario where starting time is not particularly important.

Example:
```
MultiplierClock multiplierClock = new DefaultMultiplierClock(.5D);
while (true) {
    System.out.println(multiplierClock.getDate());
    Thread.sleep(1000);
}
```

### AnchoredMultiplierClock
Working similar to the Default Multiplier Clock, an Anchored Multiplier Clock will start at an user provided `anchor` timestamp or current timestamp if no input is provided.

Example:
```
MultiplierClock multiplierClock = new AnchoredMultiplierClock(882041400000L, 4D);
while (true) {
    System.out.println(multiplierClock.getDate());
    Thread.sleep(1000);
}
```
