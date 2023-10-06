
class Procedure {
	
	private String procedureName ="";
	private String procedureDate ="";
	private String practitionerName ="";
	private double charges = 0;
	
	
	
	public Procedure() {
		
	}
	
	public Procedure( String procedureName, String procedureDate) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
	}
	
	public Procedure (String procedureName, String procedureDate, String practitionerName, double charges) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = practitionerName;
		this.charges = charges;
	}
	
	public String getProcedureName() {
		return procedureName;
	}
	public String getProcedureDate() {
		return procedureDate;
	}
	public String getPractitionerName() {
		return practitionerName;
	}
	public double getCharges() {
		return charges;
	}
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}
	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	public String toStringTwo() {
		return "Procedure Information: \n" +
			   "Procedure Name: " + procedureName + "\n" +
			   "Procedure Date: " + procedureDate + "\n" +
			   "Practitioner Name: " + practitionerName + "\n" +
			   "Charges: $" + String.format("%.2f", charges) + "\n";
	}


	
}
