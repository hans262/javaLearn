package tool.student_manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerDemo {
	public static void main(String[] args) throws IOException {
		String fileName="Student.txt";
		while(true){
			System.out.println("-----��ӭ����ѧ������ϵͳ-----");
			System.out.println("1�鿴����ѧ��");
			System.out.println("2���ѧ��");
			System.out.println("3ɾ��ѧ��");
			System.out.println("4�޸�ѧ��");
			System.out.println("5�˳�");
			System.out.println("���������ѡ��");
			Scanner sc=new Scanner(System.in);
			String strInput=sc.nextLine();
			switch(strInput){
			case "1":
				//�鿴ѧ��
				searchStudent(fileName);
				break;
			case "2":
				//���ѧ��
				addStudent(fileName);
				break;
			case "3":
				//ɾ��ѧ��
				deleteStudent(fileName);
				break;
			case "4":
				//�޸�ѧ��
				updateStudent(fileName);
				break;
			case "5":
			default :
				//�˳�
				System.out.println("лл���ʹ��");
				System.exit(0);//JVM�˳�
				break;
			}
		}
	}
	public static void writeData(String fileName,ArrayList<Student> array) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter(fileName));
		for(int i=0;i<array.size();i++){
			Student s=array.get(i);
			StringBuilder sb=new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName());
			sb.append(",").append(s.getAge()).append(",").append(s.getAddress());
			
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	public static void getData(String fileName,ArrayList<Student> array) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		String line;
		while((line=br.readLine())!=null){
			String[] arr=line.split(",");
			array.add(new Student(arr[0],arr[1],arr[2],arr[3]));
		}
		br.close();
	}
	public static void updateStudent(String fileName) throws IOException {
		ArrayList<Student> array=new ArrayList<Student>();
		getData(fileName,array);
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
		String id=sc.nextLine();
		int index=-1;
		for(int i=0;i<array.size();i++){
			Student s=array.get(i);
			if(s.getId().equals(id)){
				index=i;
				break;
			}
		}
		if(index==-1){
			System.out.println("�������ѧ�Ų����ڣ�������ѡ����Ĳ���");
		}else{
			System.out.println("��������������");
			String name=sc.nextLine();
			System.out.println("�����������䣺");
			String age=sc.nextLine();
			System.out.println("�������µ�ַ��");
			String address=sc.nextLine();
			array.set(index, new Student(id,name,age,address));
			writeData(fileName,array);
			System.out.println("�޸ĳɹ���");
		}
		
	}
	public static void deleteStudent(String fileName) throws IOException {
		ArrayList<Student> array=new ArrayList<Student>();
		getData(fileName,array);
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ��ѧ�ţ�");
		String id=sc.nextLine();
		int index=-1;
		for(int i=0;i<array.size();i++){
			Student s=array.get(i);
			if(s.getId().equals(id)){
				index=i;
				break;
			}
		}
		if(index==-1){
			System.out.println("�������ѧ�Ų����ڣ�������ѡ����Ĳ���");
		}else{
			array.remove(index);
			writeData(fileName,array);
			System.out.println("ɾ���ɹ�");
		}
	}
	public static void addStudent(String fileName) throws IOException {
		ArrayList<Student> array=new ArrayList<Student>();
		getData(fileName,array);
		Scanner sc=new Scanner(System.in);
		String id;
		while(true){
			System.out.println("������ѧ��");
			id=sc.nextLine();
			boolean flag=false;
			for(int i=0;i<array.size();i++){
				Student s=array.get(i);
				if(s.getId().equals(id)){
					flag=true;
					break;//����forѭ��
				}
			}
			if(flag){
				System.out.println("���ѧ���ѱ�ռ�ã�����������");
			}else{
				break;//����whileѭ��
			}
		}
		System.out.println("����������");
		String name=sc.nextLine();
		System.out.println("����������");
		String age=sc.nextLine();
		System.out.println("�������ס��");
		String address=sc.nextLine();
		array.add(new Student(id,name,age,address));
		writeData(fileName,array);
		System.out.println("��ӳɹ�");
	}
	public static void searchStudent(String fileName) throws IOException {
		ArrayList<Student> array=new ArrayList<Student>();
		getData(fileName,array);
		if(array.size()==0){
			System.out.println("������˼����û��ѧ�����ݣ�������ѡ��");
			return;
		}
		System.out.println("ѧ��\t����\t����\t��ס��");
		for(int i=0;i<array.size();i++){
			Student s=array.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
}
