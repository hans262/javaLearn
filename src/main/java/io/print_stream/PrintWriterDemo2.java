package io.print_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/*
 * �Զ����� println
 * �Զ�ˢ�£������ַ�����Ϊ��һ���������ڶ�������ֵ���������Ƿ�ˢ��
 * 
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws IOException {
//		PrintWriter pw=new PrintWriter("is.txt");
		PrintWriter pw=new PrintWriter(new FileWriter("is.txt"),true);
		pw.println("hello");
		pw.println("world");
		pw.println("java");
		
		pw.close();
	}
}
