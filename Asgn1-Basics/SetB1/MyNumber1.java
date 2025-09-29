package SetB1;

public class MyNumber1 {
	    private int number;

	    public MyNumber1() {
	        this.number = 0;
	    }

	    public MyNumber1(int number) {
	        this.number = number;
	    }

	    public boolean isNegative() {
	        return number < 0;
	    }

	    public boolean isPositive() {
	        return number > 0;
	    }

	    public boolean isOdd() {
	        return number % 2 != 0;
	    }

	    public boolean isEven() {
	        return number % 2 == 0;
	    }

	    public static void main(String[] args) {
	        int value = Integer.parseInt(args[0]);
	        MyNumber1 obj = new MyNumber1(value);

	        System.out.println("Number: " + value);
	        System.out.println("Is Positive: " + obj.isPositive());
	        System.out.println("Is Negative: " + obj.isNegative());
	        System.out.println("Is Odd: " + obj.isOdd());
	        System.out.println("Is Even: " + obj.isEven());
	    }
	}


