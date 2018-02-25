package GoalSheet11;

public class Pr3_Student {
	private String firstName;
	private String lastName;
	private String idNumber;
	private double percentage;
	private String letterGrade;
	
	public Pr3_Student()
	{
		firstName = "";
		lastName = "";
		idNumber = "";
		percentage = 0;
		letterGrade = "F";
	};
	
	
	public Pr3_Student(String ln, String fn, String id, double percent, String letter)
	{
		firstName = fn;
		lastName = ln;
		idNumber = id;
		percentage = percent;
		letterGrade = letter;
	};
	
	public String getFirstName()
	{
		return firstName;
	};
	
	public String getLastName()
	{
		return lastName;
	};
	public String getIDNumber(){return idNumber;};
	public double getPercentage(){return percentage;};
	public String getLetterGrade(){return letterGrade;};
	public String toString(){return firstName + " " + lastName + " " + idNumber + " " + percentage + " " + letterGrade;};
}
