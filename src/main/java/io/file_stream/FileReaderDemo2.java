package io.file_stream;

import java.io.FileReader;
import java.io.IOException;

/*
 * һ�ζ�ȡһ���ַ�����
 * �п��ܶ������п��ܲ���
 * 
 * len:���ζ�ȡ�����鳤��
 * 
 * len=-1:û�����ݿɶ�
 * 
 */
public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		FileReader fr =new FileReader("fr.txt");
		char[] chs= new char[1024];
		int len;
		
		while((len=fr.read(chs))!=-1){
			System.out.print(new String(chs,0,len));
		}
		fr.close();
	}
}
