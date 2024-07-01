public class MortgageCalculator {
    public static double calculateMortgage(int principal, float annualInterest, byte period) {
        short numberOfPayment = (short) (period * Main.MONTHINYEARS);
        float monthlyRate = annualInterest / Main.PERCENT / Main.MONTHINYEARS;
        double mortgage = principal * ((monthlyRate * Math.pow(1 + monthlyRate, numberOfPayment)) / (Math.pow(1 + monthlyRate, numberOfPayment) - 1));
        return mortgage;
    }

    public static double calculateBalance(int principal, float annualInterest, byte period, short numberOfPaymentsMade) {

        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHINYEARS;
        float numberPayments = period * Main.MONTHINYEARS;
        double balance = principal *
                (Math.pow(1 + monthlyInterest, numberPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberPayments) - 1);
        return balance;

    }
}
