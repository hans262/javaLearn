package io.print_stream;

import java.io.IOException;
import java.io.PrintWriter;
/*
 * ��ӡ��
 * 	ֻ�������
 * 	
 * 	�ֽ�	PrintStream
 * 
 * 	�ַ�	PrintWriter
 * 		���Զ����� println
 * 		�Զ�ˢ��
 * 		��������ֽ�
 * 		���԰��ֽ������ת�����ַ������
 * 		��װ��
 * 
 */

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("is.txt");
		pw.write("hello");
		pw.write("\r\n");
		pw.write("world");
		pw.close();
	}
}
