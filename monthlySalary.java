public class monthlySalary {
    
    public static void main(String[] args) {

        String name = "Paul Ashley P. Dela Cruz";
        final double ratePerHour = 325.00;
        int hoursWorked = 120;
        double grossPay;
        double deduction;
        double sss;
        double incomeTax;
        double monthlySalary;

        grossPay = (ratePerHour * hoursWorked);
        sss = (grossPay * 0.05); 
        incomeTax = (grossPay * 0.075);
        deduction = (sss + incomeTax);
        monthlySalary = (grossPay - deduction);

        System.out.println("\nHello! " + name + ".\n");
        System.out.println("Your Total Hours worked: " + hoursWorked + " Hours");
        System.out.println("Your SSS Deduction (5%): " + sss);
        System.out.println("Your Income Tax (7.5%): " + incomeTax);
        System.out.println("Your Total Deduction: " + deduction);
        System.out.println("Your Monthly Salary: " + monthlySalary);      
    }
}
