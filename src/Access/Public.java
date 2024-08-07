package Access;

public class Public  {
	    public int publicVar = 10;

	    public void publicMethod() {
	        System.out.println("This is a public method.");
	    }

	    public static void main(String[] args) {
	        Public example = new Public();
	        System.out.println("Public Variable: " + example.publicVar);
	        example.publicMethod();
	    }
	}


