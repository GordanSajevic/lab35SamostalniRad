package lab35SamostalniRad;

public class Sort {

	
	public static int[] bubbleSort(int[] array)
	{
		for (int i=0; i<array.length; i++)
		{
			for (int j=0; j<array.length; j++)
			{
				if (array[i] < array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	
	public static int[] selectionSort(int[] array)
	{
		for (int i=0; i<array.length-1; i++)
		{
			int minIndex = i;
			for (int j=i; j<array.length; j++)
			{
				if (array[j] < array[minIndex])
				{
					minIndex = j;
				}
			}
			if (minIndex != i)
			{
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
			
		return array;
	}
	
	public static int[] insertionSort(int[] array)
	{
		for (int i=0; i<array.length; i++)
		{
			int index = i;
			while(index > 0 && array[index] < array[index-1])
			{
				int temp = array[index-1];
				array[index-1] = array[index];
				array[index] = temp;
				index--;
			}
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = new int[20];
		for (int i=0; i<array.length; i++)
		{
			array[i] = 1 + (int)(Math.random()*(100-1));
			System.out.printf("%3d ", array[i]);
		}
		//array = bubbleSort(array);
		//array = selectionSort(array);
		array = insertionSort(array);
		System.out.println("\nSorted array: ");
		for (int i=0; i<array.length; i++)
		{
			System.out.printf("%3d ", array[i]);
		}

	}

}
