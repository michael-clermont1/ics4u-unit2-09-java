/**
 * This is the standard Main() class starting point.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2020-10-04
 */

final class Index {
    /**
     * Constant Variable Status.
     *
     */
    private static final String STATUS = "Status:";

    /**
     * Constant Variable MagicNumber10.
     *
     */
    private static final int MAGIC10 = 10;

    /**
     * Constant Variable MagicNumber15.
     *
     */
    private static final int MAGIC15 = 15;

    /**
     * Constant Variable MagicNumber1.
     *
     */
    private static final int MAGIC1 = 1;

    /**
     * Constant Variable MagicNumber4.
     *
     */
    private static final int MAGIC4 = 4;

    /**
     * Constant Variable MagicNumber20.
     *
     */
    private static final int MAGIC20 = 20;

    /**
     * Constant Variable Speed.
     *
     */
    private static final String NEWSPEED = "New Speed: ";

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Index() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // use Stack class
        System.out.println("Created Bmx bike.\nStatus:\n");
        final Bike bike = new Bike("Red", 40);
        System.out.println(STATUS);
        bike.status();

        System.out.println("Set the cadence to 10\n");
        bike.provideAir(MAGIC10);
        bike.status();

        System.out.println("\nAccelerate by 15");
        bike.provideAir(MAGIC15);
        bike.status();

        System.out.println("\nRinging bell.");
        bike.ringBell();

        // new Ferrari
        System.out.println("Created a Truck.\nStatus:\n");
        final Truck truck = new Truck("Grey", "HGC-3456F", 200);
        truck.status();

        System.out.println("Accelerating, 10 of power for ten seconds.");
        truck.accelerate(MAGIC20, MAGIC10);
        System.out.println(NEWSPEED + truck.getSpeed());

        System.out.println(
                        "\nBreaking, 1 power for 1 sec with 4 air pressure.");
        truck.airBreak(MAGIC1, MAGIC1, MAGIC4);
        System.out.println(NEWSPEED + truck.getSpeed());

        System.out.println("\nApplyed air pressure of 10: ");
        truck.provideAir(MAGIC10);
        System.out.println(NEWSPEED + truck.getSpeed());

        System.out.println("\nDone.");
    }
}
