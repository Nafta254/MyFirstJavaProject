public class FeeStatement {
    static final double SEMESTER_FEES = 60_000.00;

    public static void main(String[] args){
        String studentName = "Naftari Kamau";
        String regNo = "EB3/87918/25";
        int yearOfStudy = 2;
        double amountPaid = 42_750.00;

        double balance = SEMESTER_FEES - amountPaid;
        double percentPaid = amountPaid / SEMESTER_FEES * 100;
        boolean cleared = balance <= 0;

        System.out.println("FEE STATEMENT");
        System.out.println("Name: " + studentName);
        System.out.println("Reg. No: " + regNo);
        System.out.println("Year: " + yearOfStudy);
        System.out.println("Fees: " + SEMESTER_FEES);
        System.out.println("Paid: " + amountPaid);
        System.out.println("Balance: " + balance);
        System.out.println("Percent paid: " + percentPaid);
        System.out.println("Cleared: " + cleared);
    }
}