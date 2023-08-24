package oopstask;

public class EmployeeOops {
private String name;
private int id;
private float salary;
EmployeeOops(String name,int id,float salary){
	this.name=name;
	this.id=id;
	this.salary=salary;
}
public String getName() {
	return name;
	}
public int getId() {
	return id;
}
public float getSalary() {
	return salary;
}
public String toString() {
	return name + ":" + id + ":" + salary;
}
public String setName(String string) {
	// TODO Auto-generated method stub
	return name;

}
}
