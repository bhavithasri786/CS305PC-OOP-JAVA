//abstraction
package Student;
abstract class person{
	protected String name;
	person(String name){
	this.name=name;
	}
	abstract String getDetails();
}
