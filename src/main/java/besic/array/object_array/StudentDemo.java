package besic.array.object_array;

public class StudentDemo {
	public static void main(String[] args) {
		Student[] students=new Student[3];
		students[0]=new Student("�ŷ�",28);
		students[1]=new Student("����",30);
		students[2]=new Student("����",40);
		for(int i=0;i<students.length;i++){
			System.out.println(students[i].getName()+","+students[i].getAge());
		}
	}
}
