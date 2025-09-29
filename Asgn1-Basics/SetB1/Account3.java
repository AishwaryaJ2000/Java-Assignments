package SetB1;
import java.util.Scanner;

class Account {
    int accno;
    String accname;
    double balance;

    public void acceptDetails(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accno = sc.nextInt();
        System.out.print("Enter Account Name: ");
        accname = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    public void displayDetails() {
        System.out.println("AccNo: " + accno + ", Name: " + accname + ", Balance: " + balance);
    }

    public static void sortAccount(Account[] accounts) {
        for (int i = 0; i < accounts.length - 1; i++) {
            for (int j = i + 1; j < accounts.length; j++) {
                if (accounts[i].balance > accounts[j].balance) {
                    Account temp = accounts[i];
                    accounts[i] = accounts[j];
                    accounts[j] = temp;
                }
            }
        }
    }
}

public class Account3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        Account[] accounts = new Account[n];
        for (int i = 0; i < n; i++) {
            accounts[i] = new Account();
            System.out.println("Enter details for Account " + (i + 1));
            accounts[i].acceptDetails(sc);
        }

        Account.sortAccount(accounts);

        System.out.println("\nAccounts sorted by balance:");
        for (Account acc : accounts) {
            acc.displayDetails();
        }

        sc.close();
    }
}
