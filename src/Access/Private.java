package Access;
class Hii{
     void Hello() {
	 int age=20;
	 System.out.println(age);
}}
public class Private {
	    private int privateVar = 40;

	    private void privateMethod() {
	        System.out.println("This is a private method.");
	    }

	    public int getPrivateVar() {
	        return privateVar;
	    }

	    public void accessPrivateMethod() {
	        privateMethod();
	    }

	    public static void main(String[] args) {
	        Private example = new Private();
	        Hii obj=new Hii();
	        obj.Hello();
	        System.out.println("Private Variable via Getter: " + example.getPrivateVar());
	        example.accessPrivateMethod();
	    }
}

