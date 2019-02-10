package io.object_stream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * �����д��
 * 	ObjectOutputStream
 * 		writeObject
 * 		���������OutputStream out
 * 	ObjectInputStream
 * 		readObject
 * 		���������InputSteam in
 * 
 * ע��
 * 	ʹ�ö��������д������ֻ��ʹ�ö�������������ȡ����
 * 	ֻ��֧�� java.io.Serializeble �ӿڵĶ���д������
 * 
 * Exception in thread "main" java.io.NotSerializableException
 * д�����׳��쳣���ö������ʵ�����л�
 * 
 * Exception in thread "main" java.io.EOFException
 * �����ļ���ĩβ���׳��쳣
 * 
 * Exception in thread "main" java.io.InvalidClassException
 * �޸Ķ�����ٴζ��������л���ƥ�䣬�׳��쳣
 * ����취���Զ���������к�
 * 
 */
public class ObjectOutputStreamDemo {
	//ʹ�ö���������Ͷ�������д����
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		writeObject();
		readObject();
	}
	//��д���϶��󣬽���ļ�ĩ�쳣����
	public static void readListObject() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("is.txt"));
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("bill",18));
		list.add(new Student("bob",19));
		list.add(new Student("kemi",20));
		oos.writeObject(list);
		oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("is.txt"));
		Object obj=ois.readObject();
		//����ת��
		List<Student> students=(List<Student>) obj;
		//����ѧ������
		for(Student student:students){
			System.out.println(student);
		}
		ois.close();
	}
	//������
	public static void readObject() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("is.txt"));
		try{
			while(true){
				Object s=ois.readObject();
				System.out.println(s);
			}
		}catch(EOFException e){
			System.out.println("�����ļ�ĩβ��");
		}finally {
			ois.close();
		}
	}
	//д����
	public static void writeObject() throws FileNotFoundException, IOException {
		//��������������Ķ���
		FileOutputStream fos=new FileOutputStream("is.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		//����ѧ������
		Student huahua=new Student("huahua",18);
		Student goudan=new Student("goudan",19);
		//д��ѧ������
		oos.writeObject(huahua);
		oos.writeObject(goudan);
		//�ͷ���Դ
		oos.close();
	}
}
