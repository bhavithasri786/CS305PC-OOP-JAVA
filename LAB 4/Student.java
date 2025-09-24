//Encapsulation and Inheritation

package Student;
class Student extends person{
	private String id,name,branch,password;
	
	Student(String n){
		super(n);
		this.name = n;
	}
	public void getid(String id)
	{
		this.id = id;
	}
	public void getbranch(String branch)
	{
		this.branch = branch;
	}
	public void getpassword(String password)
	{
		this.password = password;
	}
	
	@Override
	public String getDetails()
	{
		return (id+","+name+","+branch+","+password);
	}
}
