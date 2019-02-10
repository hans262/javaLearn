package io.file_stream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * void write(String str):дһ���ַ�������
 * void write(String str, int index, int len):дһ�����ַ�������
 * void write(int ch):дһ���ַ����ݣ���char��Ӧ��int���͵�ֵ��'a',97
 * void write(cha[] chs):дһ���ַ�����
 * void write(char[] chs, int index, int len):дһ�����ַ�����
 * 
*/
public class FileWriterDemo2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("fr.txt");
		
		fw.write("hello world");
		fw.write("\r\n");
		
		fw.write("hello world", 6, 5);
		fw.write("\r\n");
		
		fw.write(97);
		fw.write("\r\n");
		
		char[] chs={'h', 'e', 'l', 'l', 'o'};
		fw.write(chs);
		fw.write("\r\n");
		
		fw.write(chs, 2, 3);
		fw.write("\r\n");

		fw.flush();
		fw.close();
	}
}
