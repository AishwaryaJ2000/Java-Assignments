package SetC2;

public class SiverCardCustomer1 implements CreditCardInterface1 {
    protected String name;
    protected String cardNumber;
    protected double creditAmount;
    protected double creditLimit;

    public SiverCardCustomer1 (String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.creditAmount = 0;
        this.creditLimit = 50000;
    }

    public void viewCreditAmount() {
        System.out.println(name + " - Current Credit Used: ₹" + creditAmount);
    }

    public void useCard(double amount) {
        if (creditAmount + amount <= creditLimit) {
            creditAmount += amount;
            System.out.println("Transaction Approved: ₹" + amount + " used.");
        } else {
            System.out.println("Transaction Failed: Credit limit exceeded.");
        }
    }

    public void payCredit(double amount) {
        if (amount <= creditAmount) {
            creditAmount -= amount;
            System.out.println("Payment Successful: ₹" + amount + " paid.");
        } else {
            System.out.println("Payment Failed: Amount exceeds current credit.");
        }
    }

    public void increaseLimit(double amount) {
        System.out.println("SilverCardCustomer cannot increase credit limit.");
    }
}

