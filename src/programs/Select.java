package programs;

public class Select {
	public class Main {
	    public static void main(String[] args) {
	        // if statement
	        int x = 10;
	        if (x > 5) {
	            System.out.println("x is greater than 5");
	        }

	        // if-else statement
	        int y = 3;
	        if (y > 5) {
	            System.out.println("y is greater than 5");
	        } else {
	            System.out.println("y is 5 or less");
	        }

	        // if-else if-else statement
	        int z = 7;
	        if (z > 10) {
	            System.out.println("z is greater than 10");
	        } else if (z > 5) {
	            System.out.println("z is greater than 5 but less than or equal to 10");
	        } else {
	            System.out.println("z is 5 or less");
	        }
	    }
	}

}
