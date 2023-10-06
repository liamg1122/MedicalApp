
public class PatientDriverApp {
	
	public static void main(String[] args) {
		
		Patient myPatient = new Patient("Liam", "N/A", "Ghershony", "219 Spring Ave", "Rockville", "MD", "20850", "301-660-0949", "Arie Ghershony", "301-275-6593");
		Procedure pro1 = new Procedure("Consult", "1/20/2023", "Dr.Smith", 225);
		Procedure pro2 = new Procedure("Consult 2", "1/23/2023");
		Procedure pro3 = new Procedure("Operation", "1/29/2023", "Dr.Oppenheimer", 2975);
		
		displayPatient(myPatient);
		displayProcedure(pro1);
		displayProcedure(pro2);
		displayProcedure(pro3);
		
		double totCharge = calculateTotalCharges(pro1,pro2,pro3);
		System.out.println("Total charges are: " + totCharge);
		


	}

	public static void displayPatient(Patient myPatient) {
		System.out.println(myPatient.toString());
	}
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toStringTwo());
	}
	public static double calculateTotalCharges(Procedure pro1, Procedure pro2, Procedure pro3) {
		return (pro1.getCharges() + pro2.getCharges()+ pro3.getCharges());
	}
}
