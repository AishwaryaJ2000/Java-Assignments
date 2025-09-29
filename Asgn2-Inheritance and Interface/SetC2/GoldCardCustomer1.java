package SetC2;

class GoldCardCustomer1 extends SiverCardCustomer1 {
    private int increaseCount;
	private int creditLimit;

    public GoldCardCustomer1(String name, String cardNumber) {
        super(name, cardNumber);
        this.creditLimit = 100000;
        this.increaseCount = 0;
    }

    
    public void increaseLimit(double amount) {
        if (increaseCount < 3 && amount <= 5000) {
            creditLimit += amount;
            increaseCount++;
            System.out.println("Credit limit increased by ₹" + amount + ". New limit: ₹" + creditLimit);
        } else {
            System.out.println("Limit Increase Failed: Either limit exceeded or max attempts reached.");
        }
    }

   
    public void useCard(double amount) {
        if (creditAmount + amount <= creditLimit) {
            creditAmount += amount;
            System.out.println("Gold Card Transaction Approved: ₹" + amount + " used.");
        } else {
            System.out.println("Gold Card Transaction Failed: Credit limit exceeded.");
        }
    }

   
    public void payCredit(double amount) {
        if (amount <= creditAmount) {
            creditAmount -= amount;
            System.out.println("Gold Card Payment Successful: ₹" + amount + " paid.");
        } else {
            System.out.println("Gold Card Payment Failed: Amount exceeds current credit.");
        }
    }
}
