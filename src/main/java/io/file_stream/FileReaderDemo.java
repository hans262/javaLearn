package io.file_stream;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader
 * ��ͨ��ȡ��
 * 
 * һ�ζ�ȡһ���ַ�
 * 
 * 
*/
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr =new FileReader("fr.txt");
		int ch;
		while((ch=fr.read())!=-1){
			System.out.print((char)ch);
		}
		fr.close();
	}
}
