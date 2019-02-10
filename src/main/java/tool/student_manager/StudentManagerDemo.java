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
			System.out.println("-----欢迎来到学生管理系统-----");
			System.out.println("1查看所有学生");
			System.out.println("2添加学生");
			System.out.println("3删除学生");
			System.out.println("4修改学生");
			System.out.println("5退出");
			System.out.println("请输入你的选择：");
			Scanner sc=new Scanner(System.in);
			String strInput=sc.nextLine();
			switch(strInput){
			case "1":
				//查看学生
				searchStudent(fileName);
				break;
			case "2":
				//添加学生
				addStudent(fileName);
				break;
			case "3":
				//删除学生
				deleteStudent(fileName);
				break;
			case "4":
				//修改学生
				updateStudent(fileName);
				break;
			case "5":
			default :
				//退出
				System.out.println("谢谢你的使用");
				System.exit(0);//JVM退出
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
		System.out.println("请输入你要修改的学生学号：");
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
			System.out.println("你输入的学号不存在，请重新选择你的操作");
		}else{
			System.out.println("请输入新姓名：");
			String name=sc.nextLine();
			System.out.println("请输入新年龄：");
			String age=sc.nextLine();
			System.out.println("请输入新地址：");
			String address=sc.nextLine();
			array.set(index, new Student(id,name,age,address));
			writeData(fileName,array);
			System.out.println("修改成功！");
		}
		
	}
	public static void deleteStudent(String fileName) throws IOException {
		ArrayList<Student> array=new ArrayList<Student>();
		getData(fileName,array);
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你要删除的学生学号：");
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
			System.out.println("你输入的学号不存在，请重新选择你的操作");
		}else{
			array.remove(index);
			writeData(fileName,array);
			System.out.println("删除成功");
		}
	}
	public static void addStudent(String fileName) throws IOException {
		ArrayList<Student> array=new ArrayList<Student>();
		getData(fileName,array);
		Scanner sc=new Scanner(System.in);
		String id;
		while(true){
			System.out.println("请输入学号");
			id=sc.nextLine();
			boolean flag=false;
			for(int i=0;i<array.size();i++){
				Student s=array.get(i);
				if(s.getId().equals(id)){
					flag=true;
					break;//跳出for循环
				}
			}
			if(flag){
				System.out.println("你的学号已被占用，请重新输入");
			}else{
				break;//跳出while循环
			}
		}
		System.out.println("请输入姓名");
		String name=sc.nextLine();
		System.out.println("请输入年龄");
		String age=sc.nextLine();
		System.out.println("请输入居住地");
		String address=sc.nextLine();
		array.add(new Student(id,name,age,address));
		writeData(fileName,array);
		System.out.println("添加成功");
	}
	public static void searchStudent(String fileName) throws IOException {
		ArrayList<Student> array=new ArrayList<Student>();
		getData(fileName,array);
		if(array.size()==0){
			System.out.println("不好意思，还没有学生数据，请重新选择");
			return;
		}
		System.out.println("学号\t姓名\t年龄\t居住地");
		for(int i=0;i<array.size();i++){
			Student s=array.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
}
