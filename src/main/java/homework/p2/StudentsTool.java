package homework.p2;

import java.util.ArrayList;

//public void listStudents(ArrayList<Student> arr):������ӡѧ����Ϣ
//public int getMaxScore(ArrayList<Student> arr):��ȡѧ���ɼ�����߷�
//public Student getMaxStudent(ArrayList<Student> arr):��ȡ�ɼ���ߵ�ѧԱ
//public int getAverageScore(ArrayList<Student> arr):��ȡѧ���ɼ���ƽ��ֵ
//public int getCount(ArrayList<Student> arr):��ȡ�������ѧԱ����
public class StudentsTool {
	public static void main(String[] args) {
		ArrayList<Student> arr=new ArrayList<Student>();
		arr.add(new Student("Bill","28",94));
		arr.add(new Student("Bob","30",85));
		arr.add(new Student("Mike","30",44));
		arr.add(new Student("Tom","25",89));
		arr.add(new Student("Goil","30",58));
		listStudents(arr);
		System.out.println("��߳ɼ��ǣ�"+getMaxScore(arr));
		System.out.println("��߳ɼ�ѧԱ�ǣ�"+getMaxStudent(arr).getName());
		System.out.println("�ɼ�ƽ�����ǣ�"+getAverageScore(arr));
		System.out.println("������ѧԱ������"+getCount(arr));
	}
	public static int getCount(ArrayList<Student> arr){
		int count=0;
		for(int i=0;i<arr.size();i++){
			Student s=arr.get(i);
			if(s.getScore()<60){
				count++;
			}
		}
		return count;
	}
	public static int getAverageScore(ArrayList<Student> arr){
		int Average=0;
		for(int i=0;i<arr.size();i++){
			Student s=arr.get(i);
			Average+=s.getScore();
		}
		Average=Average/arr.size();
		return Average;
	}
	public static Student getMaxStudent(ArrayList<Student> arr){
		Student max=arr.get(0);
		for(int i=1;i<arr.size();i++){
			Student s=arr.get(i);
			int score=s.getScore();
			if(score>max.getScore()){
				max=s;
			}
		}
		return max;
	}
	public static void listStudents(ArrayList<Student> arr){
		System.out.println("����\t����\t�ɼ�");
		for(int i=0;i<arr.size();i++){
			Student s=arr.get(i);
			System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getScore());
		}
	}
	public static int getMaxScore(ArrayList<Student> arr){
		int max=arr.get(0).getScore();
		for(int i=1;i<arr.size();i++){
			Student s=arr.get(i);
			int score=s.getScore();
			if(score>max) max=score;
		}
		return max;
	}
}
