package lab35SamostalniRad;

public class TestDinamicArray {

	public static void main(String[] args) {
		DinamicArray array = new DinamicArray(3);
		for (int i=0; i<5; i++)
		{
			array.add(i*2);
		}
		for (int i=0; i<5; i++)
		{
			System.out.println(array.getAt(i));
		}
		System.out.println();
		array.removeAt(2);
		for (int i=0; i<array.getSize(); i++)
		{
			System.out.println(array.getAt(i));
		}
		int[] array2 = array.toArray();
		System.out.println();
		for (int i=0; i<array.getSize(); i++)
		{
			System.out.println(array2[i]);
		}
		
	}

}
