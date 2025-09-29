package SetB3;
import java.io.*;
import java.util.*;

class Customer {
    int c_id;
    String cname, address, mobile_no;

    public void acceptDetails(Scanner sc) {
        System.out.print("Enter Customer ID: ");
        c_id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        cname = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Mobile No: ");
        mobile_no = sc.nextLine();
    }

    public void writeToFile(DataOutputStream dos) throws IOException {
        dos.writeInt(c_id);
        dos.writeUTF(cname);
        dos.writeUTF(address);
        dos.writeUTF(mobile_no);
    }

    public void readFromFile(DataInputStream dis) throws IOException {
        c_id = dis.readInt();
        cname = dis.readUTF();
        address = dis.readUTF();
        mobile_no = dis.readUTF();
    }

    public void displayDetails() {
        System.out.println("ID: " + c_id + ", Name: " + cname + ", Address: " + address + ", Mobile: " + mobile_no);
    }
}


public class CustomerDetails3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("customers.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        Customer[] customers = new Customer[n];
        for (int i = 0; i < n; i++) {
            customers[i] = new Customer();
            System.out.println("\nEnter details for Customer " + (i + 1));
            customers[i].acceptDetails(sc);
            customers[i].writeToFile(dos);
        }
        dos.close();

        System.out.println("\n--- Reading from File ---");
        FileInputStream fis = new FileInputStream("customers.dat");
        DataInputStream dis = new DataInputStream(fis);

        for (int i = 0; i < n; i++) {
            Customer c = new Customer();
            c.readFromFile(dis);
            c.displayDetails();
        }
        dis.close();
        sc.close();
    }
}
