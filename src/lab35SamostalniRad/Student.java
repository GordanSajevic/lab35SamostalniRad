package lab35SamostalniRad;

public class Student {
	
	private String name;
	private int numIndex;
	private double gpa;
	
	public Student(String name, int numIndex, double gpa)
	{
		this.name = name;
		this.numIndex = numIndex;
		this.gpa = gpa;
	}
	
	public void setName(String name)
	{
		if (name.length() < 1)
		{
			throw new IllegalArgumentException("Name cannot be empty field!");
		}
		else
		{
			this.name = name;
		}
	}
	
	public void setNumIndex(int numIndex)
	{
		if (numIndex <= 0)
		{
			throw new IllegalArgumentException("Index number cannot be lesser or equal to zero!");
		}
		else
		{
			this.numIndex = numIndex;
		}
	}
	
	public void setGpa(double gpa)
	{
		if (gpa <= 0)
		{
			throw new IllegalArgumentException("Gpa cannot be lesser or equal to zero!");
		}
		else
		{
			this.gpa = gpa;
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNumIndex()
	{
		return numIndex;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public String toString()
	{
		return name + "\nIndex number: " + numIndex + "\nGpa: " + gpa;
	}
	
	public int compareTo(Student other)
	{
		if (this.gpa > other.gpa)
		{
			return 1;
		}
		else if (this.gpa < other.gpa)
		{
			return -1;
		}
		else
		{
			if (this.numIndex > other.numIndex)
			{
				return 1;
			}
			else if (this.numIndex < other.numIndex)
			{
				return -1;
			}
			else
			{
				if (this.name.compareTo(other.name)>0)
				{
					return 1;
				}
				else if (this.name.compareTo(other.name)<0)
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		}
	}

}
