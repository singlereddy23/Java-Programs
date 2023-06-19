package Input_Empoyee_Details;

public class Employee
{
	String name;
	String gender;
	String department;
	double salary;

	public void setName(String name)
	{
		this.name = name;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public Employee()
	{
		super();
	}

	public String toString()
	{
		return "Employee [name=" + name + ", gender=" + gender + ", department=" + department + ", salary=" + salary + "]";
	}
}