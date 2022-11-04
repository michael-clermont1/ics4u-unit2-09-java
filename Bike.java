/**
 * The Bike Class.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2020-10-4
 */

public class Bike extends Vehicle {
    /**
     * Cadence field.
     *
     * @param cadence - cadence
     */
    private int cadence;

    /**
     * Bike Constructor.
     *
     * @param colour - colour from user
     * @param maxSpeed - maxspeed from user
     */
    public Bike(final String colour, final int maxSpeed) {
        super(colour, maxSpeed);
    }

    /**
     * The status() function.
     *
     */
    public void status() {
        System.out.println(" --> Speed: " + super.getSpeed());
        System.out.println(" --> MaxSpeed: " + super.getMaxSpeed());
        System.out.println(" --> Color: " + super.getColor());
        System.out.println(" --> Cadence:" + this.cadence);
    }

    /**
     * The cadence getter.
     *
     * @return cadence - cadence
     */
    public int getCadence() {
        return this.cadence;
    }

    /**
     * The provideAir() function.
     *
     * @param appliedPower - power from user
     */
    public void provideAir(final int appliedPower) {
        this.cadence = this.cadence + appliedPower;
        super.setSpeed(this.cadence * 2);
    }

    /**
     * The ringBell() function.
     */
    public void ringBell() {
        System.out.println("Ding ding!\n");
    }
}
