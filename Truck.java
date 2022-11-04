/**
 * The Truck Class.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2020-10-4
 */

public class Truck extends Vehicle {
    /**
     * Plate field.
     *
     * @param plate - plate
     */
    private String plate;

    /**
     * The Constructor.
     *
     * @param color1 - color from user
     * @param plate1 - plate from user
     * @param maxspeed1 - maxspeed from user
     */
    public Truck(final String color1, final String plate1,
                    final int maxspeed1) {
        super(color1, maxspeed1);
        this.plate = plate1;
    }

    /**
     * The status() function.
     *
     */
    public void status() {
        System.out.println(" --> Speed: " + super.getSpeed());
        System.out.println(" --> MaxSpeed: " + super.getMaxSpeed());
        System.out.println(" --> License Plate: " + this.plate);
        System.out.println(" --> Color: " + super.getColor());
    }

    /**
     * The license plate getter.
     *
     * @return plate - plate
     */
    public String getLicensePlate() {
        return this.plate;
    }

    /**
     * The license plate setter.
     *
     * @param newLicensePlate - licensePlate from user
     */
    public void setLicensePlate(final String newLicensePlate) {
        this.plate = newLicensePlate;
    }

    /**
     * The provideAir() function.
     *
     * @param airPressure - airpressure from user
     */
    public void provideAir(final int airPressure) {
        super.setSpeed(super.getSpeed() - airPressure / 2);

        if (super.getSpeed() < 0) {
            super.setSpeed(0);
        }
    }
}
