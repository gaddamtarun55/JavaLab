class person{
	String name;
	int age;
}
class Student extends person{
	void Data (String n , int a) {
		n=name;
		a =age;
	}
		
	void details () {
		System.out.println("name of the preson: "+name);
		System.out.println("age is : "+ age);
		
		}
	}
	

public class SingleInheretance {
	public static void main (String args[]) {
		Student s= new Student();
		s.Data("hola", 10);
		s.details();
	}
	

}
