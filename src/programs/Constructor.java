package programs;

public class Constructor {
  int rollno;
  
  
  
  
  String name;
 static  String collegename="Mahindra University";
 static void change() {
	 collegename="JNTU";
 }
public Constructor(int Number,String Firstname) {
	rollno=Number;
	name=Firstname;
}
public void display() {
	System.out.println(name+rollno+collegename);
	}
public static void main(String args[]) {
	Constructor obj=new Constructor(10,"Tech");
	obj.display();
	Constructor.change();
	Constructor obj2=new Constructor(20,"Massil");
	obj2.display();
}
}