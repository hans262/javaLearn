package exception;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �׳��쳣:
 * 		thows�ؼ���
 * 		
 * 
 * */
public class ExceptionDemo2 {
	public static void main(String[] args) throws IOException{
		method();
	}
	public static void method() throws IOException{
		FileWriter fw=new FileWriter("a.txt");
		fw.write("hello java");
		fw.write("\r\n");
		fw.write("hello world");
		fw.write("\r\n");
		fw.flush();
		fw.close();
	}
}
