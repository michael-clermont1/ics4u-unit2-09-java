/**
 * The Vehicle Class.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2020-10-4
 */

public class Vehicle {
    /**
     * Speed field.
     *
     * @param speed - speed
     */
    private int speed;
    /**
     * Color field.
     *
     * @param color - color
     */
    private String color;
    /**
     * MaxSpeed field.
     *
     * @param maxspeed - maxspeed
     */
    private int maxspeed;

    /**
     * The Constructor.
     *
     * @param color1 - color from user
     * @param maxspeed1 - maxspeed from user
     */
    public Vehicle(final String color1, final int maxspeed1) {
        this.color = color1;
        this.maxspeed = maxspeed1;
    }

    /**
     * The speed getter.
     *
     * @return speed - current speed value
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * The maxSpeed getter.
     *
     * @return maxspeed - current maxspeed value
     */
    public int getMaxSpeed() {
        return this.maxspeed;
    }

    /**
     * The color getter.
     *
     * @return color - current color value
     */
    public String getColor() {
        return this.color;
    }

    /**
     * The color setter.
     *
     * @param someColor - the color value from user
     */
    public void setColor(final String someColor) {
        this.color = someColor;
    }

    /**
     * The speed getter.
     *
     * @param newSpeed - the speed value from user
     */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * The accelerate() function.
     *
     * @param accelerationPower -  power
     * @param accelerationTime - time
     */
    public void accelerate(final int accelerationPower,
                    final int accelerationTime) {
        this.speed = accelerationPower * accelerationTime + this.speed;

        if (this.speed > this.maxspeed) {
            this.speed = this.maxspeed;
        }
    }

    /**
     * The breakF() function.
     *
     * @param breakPower -  power
     * @param breakTime - time
     */
    public void breakF(final int breakPower, final int breakTime) {
        this.speed = this.speed - breakPower * breakTime;

        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    /**
     * The status() function.
     *
     */
    public void status() {
        System.out.println(" --> Speed: " + this.speed);
        System.out.println(" --> MaxSpeed: " + this.maxspeed);
        System.out.println(" --> Color: " + this.color);
    }
}
