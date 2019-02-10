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
 * 对象读写流
 * 	ObjectOutputStream
 * 		writeObject
 * 		构造参数：OutputStream out
 * 	ObjectInputStream
 * 		readObject
 * 		构造参数：InputSteam in
 * 
 * 注意
 * 	使用对象输出流写出对象，只能使用对象输入流来读取对象
 * 	只能支持 java.io.Serializeble 接口的对象写入流中
 * 
 * Exception in thread "main" java.io.NotSerializableException
 * 写对象抛出异常，该对象必须实现序列化
 * 
 * Exception in thread "main" java.io.EOFException
 * 读到文件的末尾，抛出异常
 * 
 * Exception in thread "main" java.io.InvalidClassException
 * 修改对象后，再次读对象，序列化不匹配，抛出异常
 * 解决办法，自定义对象序列号
 * 
 */
public class ObjectOutputStreamDemo {
	//使用对象输出流和读对象流写对象
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		writeObject();
		readObject();
	}
	//读写集合对象，解决文件末异常问题
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
		//向下转型
		List<Student> students=(List<Student>) obj;
		//遍历学生集合
		for(Student student:students){
			System.out.println(student);
		}
		ois.close();
	}
	//读对象
	public static void readObject() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("is.txt"));
		try{
			while(true){
				Object s=ois.readObject();
				System.out.println(s);
			}
		}catch(EOFException e){
			System.out.println("读到文件末尾了");
		}finally {
			ois.close();
		}
	}
	//写对象
	public static void writeObject() throws FileNotFoundException, IOException {
		//创建对象输出流的对象
		FileOutputStream fos=new FileOutputStream("is.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		//创建学生对象
		Student huahua=new Student("huahua",18);
		Student goudan=new Student("goudan",19);
		//写出学生对象
		oos.writeObject(huahua);
		oos.writeObject(goudan);
		//释放资源
		oos.close();
	}
}
