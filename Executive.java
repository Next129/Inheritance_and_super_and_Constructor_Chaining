public class Executive extends Employee{
	double bonus;
	Executive(String firstName, String lastname, int day, int month, int year, String workplace, String position,
			double salary, double bonus) {
		super(firstName, lastname, day, month, year, workplace, position, salary);
		this.bonus = bonus;
	}
	

void printInfo() {
	super.printInfo();
	System.out.println("Bonus: "+bonus);
}
void announceRule(String rule){
	System.out.println(position+" : "+super.name.firstName+" "+name.lastName);
	System.out.println("Announce rule: "+rule);
		
}


}
