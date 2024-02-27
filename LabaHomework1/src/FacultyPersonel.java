
public class FacultyPersonel extends Personel{

String departmentName;

public FacultyPersonel(int id, String firstName, String lastName, String departmentName) {
	super(id, firstName, lastName);
	this.departmentName = departmentName;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

	
	
	
	

}
