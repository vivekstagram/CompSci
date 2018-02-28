//*******************Vivek Patel - Feb 2018 - BJP Ch 13 Pr 3*****************//

package GoalSheet11;

public class Pr3_Student {
	private String _fn;
	private String _ln;
	private String _id;
	private double _per;
	private String _lg;
	
	public Pr3_Student()
	{
		_fn = "";
		_ln = "";
		_id = "";
		_per = 0;
		_lg = "F";
	};
	
	
	public Pr3_Student(String ln, String fn, String id, double percent, String letter)
	{
		_fn = fn;
		_ln = ln;
		_id = id;
		_per = percent;
		_lg = letter;
	};
	
	public String getFirstName()
	{
		return _fn;
	};
	
	public String getLastName()
	{
		return _ln;
	};
	public String getIDNumber()
	{
		return _id;
	};
	
	
	public double getPercentage()
	{
		return _per;
	};
	
	public String getLetterGrade()
	{
		return _lg;
	};
	
	public String toString()
	{
		return _fn + " " + _ln + " " + _id + " " + _per + " " + _lg;
	};
}
