package lab35SamostalniRad;

public class Test {
	
	public static Student[] insertionSort(Student[] students)
	{
		for (int i=0; i<students.length; i++)
		{
			int index = i;
			while (index > 0 && students[index].compareTo(students[index-1])>0)
			{
				Student temp = students[index];
				students[index] = students[index-1];
				students[index-1] = temp;
				index--;
			}
		}
		
		return students;
	}
	
	
	
	public static void main(String[] args) {
		Student jesenko = new Student("Jesenko Gavrić", 134, 7.4);
		Student edib = new Student("Edib Imamović", 312, 7.2);
		Student necko = new Student ("Nedžad Hamzić", 345, 7.8);
		Student dastko = new Student("Davor Stanković", 223, 7.5);
		Student[] students = {jesenko, edib, necko, dastko};
		students = insertionSort(students);
		for (int i=0; i<students.length; i++)
		{
			System.out.println(students[i].toString());
		}
		
	}

}
