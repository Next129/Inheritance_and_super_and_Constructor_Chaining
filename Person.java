public class Person {
	Name name;
	Date dateOfBirth;
	static int numPerson=0;
	
Person(String firstName,String lastname,int day,int month,int year){
	

name = new Name(firstName,lastname);
dateOfBirth = new Date(day,month,year);
numPerson++; 
}



void printInfo() {
	System.out.println("Name: "+name.firstName+" "+name.lastName);
	System.out.println("DOB: "+dateOfBirth.day+"-"+dateOfBirth.month+"-"+dateOfBirth.year);
	printAgeAtYear(2025);

}

void printAgeAtYear(int year) {
	System.out.println("Age: "+(year-dateOfBirth.year));
}
static void printNumberOfPerson() {
	System.out.println("The total number of Persons is "+numPerson);
	
}

}