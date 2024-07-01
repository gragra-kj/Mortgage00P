import java.text.NumberFormat;

public class MortgageReport {
    public static void printMortgage(int principal, float annualInterest, byte period) {
        double mortgage = Main.calculateMortgage(principal, annualInterest, period);
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("Mortgage: ");
        System.out.println("-----------");
        System.out.println("Monthly Payments: " + mortgageFormat);

    }

    public static void printPaymentSchedule(byte period, int principal, float annualInterest) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------------");
        for (short month = 1; month <= period * Main.MONTHINYEARS; month++) {
            double balance = Main.calculateBalance(principal, annualInterest, period, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
