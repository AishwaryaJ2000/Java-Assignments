package SetA1;

public class MyDate4 {
	    private int dd, mm, yy;

	    // Default constructor
	    public MyDate4() {
	        this.dd = 1;
	        this.mm = 1;
	        this.yy = 2000;
	    }

	    // Parameterized constructor
	    public MyDate4(int dd, int mm, int yy) {
	        this.dd = dd;
	        this.mm = mm;
	        this.yy = yy;
	    }

	    public void displayDate() {
	        System.out.println("Date: " + this.dd + "-" + this.mm + "-" + this.yy);
	    }

	    public static void main(String[] args) {
	        MyDate4 date = new MyDate4();
	        date.displayDate();

	        MyDate4 Date = new MyDate4(28, 9, 2025);
	        Date.displayDate();
	    }
	}



