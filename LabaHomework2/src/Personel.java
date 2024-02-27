
public abstract class Personel implements WorkingConditions{
	
	
	public int id;
	public String firstName;
	public String lastName;
	
	
	public Personel(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public int numberOfDayOff() {
		// TODO Auto-generated method stub
		return 15;
	}
	@Override
	public int paySalary() {
		// TODO Auto-generated method stub
		return 150;
	}
	@Override
	public boolean comeToCampus() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public String toString() {
		return "Personel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", getId()=" + getId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", numberOfDayOff()="
				+ numberOfDayOff() + ", paySalary()=" + paySalary() + ", comeToCampus()=" + comeToCampus() + "]";
	}
	
	
	
	
	
	
	
	

}
