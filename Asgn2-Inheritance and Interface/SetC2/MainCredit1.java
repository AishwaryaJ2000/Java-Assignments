package SetC2;

public class MainCredit1 {
    public static void main(String[] args) {
        SiverCardCustomer1 silver = new SiverCardCustomer1("Aishu", "1234567890123456");
        GoldCardCustomer1 gold = new GoldCardCustomer1("Ravi", "9876543210987654");

        System.out.println("\n--- Silver Card Operations ---");
        silver.useCard(20000);
        silver.viewCreditAmount();
        silver.payCredit(5000);
        silver.increaseLimit(3000); 

        System.out.println("\n--- Gold Card Operations ---");
        gold.useCard(40000);
        gold.viewCreditAmount();
        gold.payCredit(10000);
        gold.increaseLimit(5000); 
        gold.increaseLimit(6000); 
        gold.increaseLimit(5000); 
        gold.increaseLimit(5000); 
        gold.increaseLimit(5000); 
    }
}
