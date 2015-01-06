package lab35SamostalniRad;

import java.util.Arrays;

public class DinamicArrayOfString {

	private static final int INITIAL_NUMBER = 1;
	String[] myArray;
	int myCount;
	
	public DinamicArrayOfString()
	{
		this(INITIAL_NUMBER);
	}
	
	public DinamicArrayOfString(int initialNumber)
	{
		super();
		myArray = new String[initialNumber];
		myCount = 0;
	}
	
	public void add(String str)
	{
		if (myCount == myArray.length)
		{
			myArray = Arrays.copyOf(myArray, myArray.length*2);
		}
		myArray[myCount] = str;
		myCount++;
	}
	
	public void set(int offset, String str)
	{
		if (offset < 0 || offset  >= myCount)
		{
			throw new IndexOutOfBoundsException("Your offset " + offset + " doesn't belong to [0, " + (myCount-1) + " ].");
		}
		myArray[offset] = str;
	}
	
	public int getMyCount()
	{
		return myCount;
	}
	
	public String getAt(int offset)
	{
		if (offset < 0 || offset  >= myCount)
		{
			throw new IndexOutOfBoundsException("Your offset " + offset + " doesn't belong to [0, " + (myCount-1) + " ].");
		}
		return myArray[offset];
	}
	
	public String[] get()
	{
		return Arrays.copyOf(myArray, myCount);
	}
	
	public void remove(int offset)
	{
		if (offset < 0 || offset >= myCount)
		{
			throw new IndexOutOfBoundsException("Your offset " + offset + " doesn't belong to [0, " + (myCount-1) + " ].");
		}
		for (int i=offset; i<myCount; i++)
		{
			myArray[i] = myArray[i+1];
		}
		myCount--;
		if (myCount < myArray.length/3)
		{
			myArray = Arrays.copyOf(myArray, myArray.length/2);
		}
	}
}
