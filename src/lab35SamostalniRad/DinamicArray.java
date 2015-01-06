package lab35SamostalniRad;

public class DinamicArray {
	
	private int[] array;
	private int count;
	final int INIT_SIZE = 5;
	
	public DinamicArray(int size)
	{
		this.array = new int[size];
		this.count=0;
	}
	
	public DinamicArray()
	{
		this.array = new int[INIT_SIZE];
		this.count=0;
	}
	
	public void add(int newElement)
	{
		if (count == array.length)
		{
			resize();
		}
		array[count] = newElement;
		this.count++;
	}
	
	private void resize()
	{
		int[] newArray = new int[array.length*2];
		for (int i=0; i<array.length; i++)
		{
			newArray[i] = array[i];
		}
		array = newArray;
	}
	
	public int getAt(int index)
	{
		if (index < 0 || index > count)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			return array[index];
		}
	}
	
	public void removeAt(int index)
	{
		if (index < 0 || index > count)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			for (int i=index; i<count-1; i++)
			{
				array[i] = array[i+1];
			}
			this.count--;
		}
	}
	
	public int getSize()
	{
		return count;
	}
	
	public int[] toArray()
	{
		int[] newArray = new int[count];
		for (int i=0; i<count; i++)
		{
			newArray[i] = array[i];
		}
		array = newArray;
		return array;
	}
	
}
