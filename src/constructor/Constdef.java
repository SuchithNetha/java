package constructor;

public class Constdef {
	public Constdef() {
		System.out.println("Hello");
	}
//this is deafult constructor
public int add(int a,int b) {
	return a+b;
}
	public static void main(String args[]) {
	Constdef df=new Constdef();
	System.out.println(df.add(2,3));
}
}