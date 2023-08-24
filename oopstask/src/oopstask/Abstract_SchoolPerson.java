package oopstask;
interface SchoolPerson{
	String name(String A);
	 int studentId(int id);
}
abstract class name implements SchoolPerson{
	public String name(String A) {
		return A;
	}
}
class Abstract_SchoolPerson extends name{ 
	public int studentId(int id)
	{
		return id;
	}

	public static void main(String[] args) {
		Abstract_SchoolPerson obj=new Abstract_SchoolPerson();
		String m=obj.name("manikandan ");
		System.out.println("Teacher name :"+ "Manikandan S");
		int d=obj.studentId(35);
		System.out.println("Student id :"+d);

	}

}
