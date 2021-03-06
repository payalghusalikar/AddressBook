package addressbook;

public class Person {
	String firstName;
	String lastName;
	String city;
	String state;
	long MobileNo;
	int zip;

public Person(String firstName, String lastName, String city, String state, long MobileNo, int zip) {

	this.firstName = firstName;
	this.lastName = lastName;
	this.city = city;
	this.state = state;
	this.MobileNo = MobileNo;
	this.zip = zip;
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



public long getMobileNo() {
	return MobileNo;
}



public void setMobileNo(long mobileNo) {
	MobileNo = mobileNo;
}



public int getZip() {
	return zip;
}



public void setZip(int zip) {
	this.zip = zip;
}



public String toString() {
    return "Person [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
            + ", state=" + state + ", pincode=" + zip + ", MobileNo=" + MobileNo +"]"+"\n";
}

}
