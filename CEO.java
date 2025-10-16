public class CEO extends Executive{
	String positionVehicle;
CEO(String firstName,String lastname,int day,int month,int year,String workplace,String position,double salary,double bonus,String positionVehicle){
	super(firstName,lastname,day,month,year,workplace,position,salary,bonus);
	this.positionVehicle = positionVehicle;
}
void printInflo() {
	super.printInfo();
	System.out.println("Position Vehicle: "+positionVehicle);

}
void showVision(String vision) {
	System.out.println(name.firstName+" "+name.lastName+" shows "+vision);

	
	
}
	
	

}