/* 
 * Payroll.java
 * Shaun Hoadley
 * CPT-307 Data Structures and Algorithms
 * Professor Pete Limon
 * July 07, 2020 
 */

package calculatePay;

// Payroll class
public class Payroll {

	// Payroll variables for employees
	String employeeName = "";
	double grossPay = 0.0;
	double hoursWorked = 0.0;
	double hourlyPay = 0.0;
	double overtimeHours = 0.0;
	
	// Federal Taxes
	double federalTax = 0.15;
	double socialSecurityTax = 0.062;
	double mediCareTax = 0.0145;
	
	// State Taxes
	double stateTax = 0.0307;
	double unemploymentInsurance = 0.0007;
	
	// Variables for total deductions and net pay
	double totalDeductions = 0.0;
	double netPay = 0.0;
	
	// Constructor for Payroll class
	public Payroll(String name, double hours, double rate) {

			employeeName = name;
			hoursWorked = hours;
			hourlyPay = rate;
			
	}

	// Method to Calculate Gross Pay
	public void  calculateGrossPay() {
		
		if (hoursWorked>40) {
			overtimeHours = (hoursWorked - 40);
			grossPay = ((overtimeHours) * (hourlyPay * 1.5)) + (hourlyPay * 40);
			
		}
		else {
			grossPay = (hoursWorked * hourlyPay);
		}
	}
	// Method to Calculate Deductions
	public void calculateDeductions() {
		
		totalDeductions = ((grossPay * federalTax) + (grossPay * socialSecurityTax)
				+ (grossPay * mediCareTax) + (grossPay * stateTax) + (grossPay * 
				unemploymentInsurance));
	}
	
	// Method to Calculate Net Pay
	public void calculateNetPay() {
		
		netPay = (grossPay - totalDeductions);
	}
	
	// Main Method
	public static void main(String[] args) {

		// Create new Payroll
		Payroll emp1 = new Payroll("Betty Boop", 10, 11.00);
		emp1.calculateGrossPay();
		emp1.calculateDeductions();
		emp1.calculateNetPay();
		
		Payroll emp2 = new Payroll("Roger Rabbit", 40, 10.25);
		emp2.calculateGrossPay();
		emp2.calculateDeductions();
		emp2.calculateNetPay();
		
		Payroll emp3 = new Payroll("Mickey Mouse", 45, 15.55);
		emp3.calculateGrossPay();
		emp3.calculateDeductions();
		emp3.calculateNetPay();
		
		// Output to display
		System.out.println("Employee:              " + emp1.employeeName
				+ "     " + emp2.employeeName + "     " + emp3.employeeName);
		System.out.printf("Pay Rate:              $%.2f         $%.2f           $%.2f %n",
				emp1.hourlyPay,	emp2.hourlyPay, emp3.hourlyPay);
		System.out.printf("Total Hours Worked:    %.2f          %.2f            %.2f %n",
				emp1.hoursWorked, emp2.hoursWorked, emp3.hoursWorked);
		System.out.printf("Overtime Hours Worked: %.2f           %.2f             %.2f %n",
				emp1.overtimeHours, emp2.overtimeHours, emp3.overtimeHours);
		System.out.printf("Gross Pay:             $%.2f        $%.2f          $%.2f %n",
				emp1.grossPay, emp2.grossPay, emp3.grossPay);
		System.out.printf("totalDeductions:       $%.2f         $%.2f          $%.2f %n",
				emp1.totalDeductions, emp2.totalDeductions, emp3.totalDeductions);
		System.out.printf("Net Pay:               $%.2f         $%.2f          $%.2f %n",
				emp1.netPay, emp2.netPay, emp3.netPay);
 
	}

}
