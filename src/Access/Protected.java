package Access;

public class Protected  {
	    protected int protectedVar = 20;

	    protected void protectedMethod() {
	        System.out.println("This is a protected method.");
	    }
	}

	class SubClass extends Protected {
	    public static void main(String[] args) {
	        SubClass example = new SubClass();
	        System.out.println("Protected Variable: " + example.protectedVar);
	        example.protectedMethod();
	    }
	}

