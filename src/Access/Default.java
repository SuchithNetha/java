package Access;

public class Default {
	
	    int defaultVar = 30;

	    void defaultMethod() {
	        System.out.println("This is a default access method.");
	    }

	    public static void main(String[] args) {
	        Default example = new Default();
	        System.out.println("Default Variable: " + example.defaultVar);
	        example.defaultMethod();
	    }
	}

