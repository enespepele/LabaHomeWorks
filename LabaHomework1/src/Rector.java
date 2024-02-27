
public class Rector extends AdministrativeStaff{

	String univertsityName;

	public Rector(int id, String firstName, String lastName, String departmentName, String univertsityName) {
		super(id, firstName, lastName, departmentName);
		this.univertsityName = univertsityName;
	}

	public String getUnivertsityName() {
		return univertsityName;
	}

	public void setUnivertsityName(String univertsityName) {
		this.univertsityName = univertsityName;
	}
	
	
	
	
	
	

}
