class Patient {
	
	private String firstName ="";
	private String lastName ="";
	private String middleName ="";
	private String streetAddress ="";
	private String city ="";
	private String state ="";
	private String zipCode ="";
	private String phoneNumber ="";
	private String emergencyContactName ="";
	private String emergencyContactNumber ="";


public Patient () {
	
}

public Patient(String firstName, String middleName, String lastName) {
	
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	
}

public Patient (String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactNumber ) {
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.streetAddress = streetAddress;
	this.city =city;
	this.state = state;
	this.zipCode =zipCode;
	this.phoneNumber =phoneNumber;
	this.emergencyContactName = emergencyContactName;
	this.emergencyContactNumber = emergencyContactNumber;
	
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getStreetAddress() {
	return streetAddress;
}
public void setStreetAddress(String streetAddress) {
	this.streetAddress = streetAddress;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmergencyName() {
	return emergencyContactName;
}
public void setEmergencyName(String emergencyContactName) {
	this.emergencyContactName = emergencyContactName;
}
public String getEmergencyNumber() {
	return emergencyContactNumber;
}
public void setEmergencyNumber(String emergencyContactNumber) {
	this.emergencyContactNumber = emergencyContactNumber;
}

public String toString() {
	return "Patient Information:\n"+
		   "Full Name: " + firstName + " " + middleName + " " + lastName + "\n" +
		   "Address: " + streetAddress + ", " + city + ", " + state + ", " + zipCode + "\n" +
		   "Phone Number: " + phoneNumber + "\n" +
		   "Emergency Contact Information: " + emergencyContactName + " " + emergencyContactNumber + "\n";
		   
		   
}
}