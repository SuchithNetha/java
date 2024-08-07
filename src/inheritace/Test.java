package inheritace;

 interface Student1{
	void Write(); 
	}
 interface Student2{
	void Read(); 
	}
	public class Test implements Student1,Student2{
		public void Write() {
			System.out.println("Interface implemented");
			}
		public void Read() {
			System.out.println("Interface implemented");
		}
		public static void main(String[] args) {
		Test obj=new Test();
		obj.Read();
		obj.Write();
		}
	}