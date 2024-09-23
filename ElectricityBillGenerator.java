import java.util.Scanner;

public class ElectricityBillGenerator {
    // Constants for different slabs
    private static final double SLAB1_RATE = 0.5; // Rate per unit for first 100 units
    private static final double SLAB2_RATE = 1.0; // Rate per unit for 101-200 units
    private static final double SLAB3_RATE = 1.5; // Rate per unit for 201-300 units
    private static final double SLAB4_RATE = 2.0; // Rate per unit for above 300 units
    private static final double FIXED_CHARGE = 50.0; // Fixed charge

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for units consumed
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        // Calculate the bill
        double totalBill = calculateBill(units);

        // Display the bill
        System.out.println("Electricity Bill Summary:");
        System.out.println("--------------------------");
        System.out.printf("Units Consumed: %d\n", units);
        System.out.printf("Total Bill: $%.2f\n", totalBill);
        
        scanner.close();
    }

    private static double calculateBill(int units) {
        double billAmount = 0.0;

        if (units <= 100) {
            billAmount = units * SLAB1_RATE;
        } else if (units <= 200) {
            billAmount = (100 * SLAB1_RATE) + ((units - 100) * SLAB2_RATE);
        } else if (units <= 300) {
            billAmount = (100 * SLAB1_RATE) + (100 * SLAB2_RATE) + ((units - 200) * SLAB3_RATE);
        } else {
            billAmount = (100 * SLAB1_RATE) + (100 * SLAB2_RATE) + (100 * SLAB3_RATE) + ((units - 300) * SLAB4_RATE);
        }

        // Add fixed charge
        billAmount += FIXED_CHARGE;
        return billAmount;
    }
}
