# Electricity Bill Generator Program

This Electricity Bill Generator Program is designed to calculate and generate electricity bills for users based on their power consumption. It takes into account consumption units, applies appropriate tariff rates, adds additional charges, and generates a summary of the electricity bill.


## Features

- **User Input**: Allows entry of customer information and units of electricity consumed.
- **Dynamic Tariff Calculation**: Calculates charges based on pre-defined slabs.
- **Additional Charges**: Adds extra fees, taxes, or service charges where applicable.
- **Bill Summary**: Displays a clear breakdown of the final bill amount.
- **Report Generation**: Option to export the generated bill as a PDF or other formats (optional).


## Tariff Structure

The billing program calculates the total cost based on the following sample tariff structure:

- **0 to 100 units**: $0.50 per unit
- **101 to 300 units**: $0.75 per unit
- **Above 300 units**: $1.00 per unit

> **Note**: These rates can be adjusted according to your region's policies.

## Program Flow

1. **Input**:
   - Collects customer details (e.g., name, address).
   - Accepts units of electricity consumed as input.

2. **Tariff Calculation**:
   - Checks which tariff slab the units fall under.
   - Multiplies units consumed with the applicable rate.

3. **Additional Charges**:
   - Optionally, adds fixed charges, service fees, or taxes to the total bill.

4. **Bill Summary**:
   - Generates a final bill with a breakdown of all charges.

5. **Output**:
   - Displays the final bill amount along with details of charges.
   - Option to save or print the bill (optional).


## Installation

Clone this repository to your local machine using:

 ```bash
git clone https://github.com/username/electricity-bill-generator.git
```

## Navigate to the project directory

After cloning the repository, move into the project directory using:

```bash
cd electricity-bill-generator
```

## Usage

To use the Electricity Bill Generator Program, follow these steps:

### 1. Run the Program
   - Open a terminal in the project directory.
   - Run the program file using the following command (for example, in Java):
     ```bash
     java ElectricityBillGenerator
     ```
   - Alternatively, open the main file in your preferred IDE and execute it.

### 2. Input Customer Details
   - Enter the customer’s information, including:
     - **Customer Name**
     - **Address**
     - **Unique Customer ID** (optional)
   - Enter the units of electricity consumed.

### 3. Tariff Calculation and Additional Charges
   - The program automatically calculates charges based on predefined tariff slabs.
   - Additional charges, if applicable, are added to the total bill.

### 4. View the Bill Summary
   - After calculation, the program displays a detailed summary including:
     - Customer details
     - Units consumed
     - Breakdown of charges by slab
     - Additional fees or taxes
     - **Total Amount Due**

### 5. Save or Print the Bill (Optional)
   - If enabled, you can save the bill as a PDF or print it for the customer.

## Example Usage

```bash
Enter Customer Name: John Doe
Enter Address: 123 Elm Street
Enter Customer ID: 4567
Enter Units Consumed: 250
--------------------------------------------------
Generating bill...
--------------------------------------------------
Customer Name: John Doe
Address: 123 Elm Street
Units Consumed: 250
--------------------------------------------------
Charge for first 100 units: $50.00
Charge for next 150 units: $112.50
Service Charge: $10.00
--------------------------------------------------
Total Amount Due: $172.50
--------------------------------------------------
Thank you! Your bill has been generated.
```

## Customization

You can modify the tariff structure and additional charges in the program’s `config` section to align with local utility billing standards.

---

## Contributing

Feel free to fork this repository, create a new branch, and contribute. Pull requests are welcome!

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contact

For questions or support, please contact [goswamiakshay777@gmail.com].

