
public class Main {
	
	public static void main(String args[]) {
		
		
	
	Professor p1 = new Professor(1, "Enes", "Pepele", "Engineering","Electronic");
	AdministrativeStaff a1 = new AdministrativeStaff(2, "Hasan", "Kaya", "Engineering");
	Rector r1 = new Rector(3, "Ersoy", "Ceylan", "Economy", "İstanbul Teknik Ünicersitesi");
	FacultyPersonel fp1 = new FacultyPersonel(4, "Ekrem", "Kara", "Medic");
	
	System.out.println(p1.toString());
	System.out.println();
	System.out.println(a1.toString());
	System.out.println();
	System.out.println(r1.toString());
	System.out.println();
	System.out.println(fp1.toString());
	

		
		
	}
	
	
	

}
