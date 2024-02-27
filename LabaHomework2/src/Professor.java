
public class Professor extends FacultyPersonel{
	
	String branchOfScience;

	

	public String getBranchOfScience() {
		return branchOfScience;
	}



	public void setBranchOfScience(String branchOfScience) {
		this.branchOfScience = branchOfScience;
	}



	public Professor(int id, String firstName, String lastName, String departmentName, String branchOfScience) {
		super(id, firstName, lastName, departmentName);
		this.branchOfScience = branchOfScience;
	}



	@Override
	public int numberOfDayOff() {
		// TODO Auto-generated method stub
		return super.numberOfDayOff()+10;
	}



	@Override
	public int paySalary() {
		// TODO Auto-generated method stub
		return super.paySalary()*2;
	}
	
	
	
	
	

}
