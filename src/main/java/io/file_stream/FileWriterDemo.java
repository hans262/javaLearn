package io.file_stream;

import java.io.FileWriter;
import java.io.IOException;
/*
 * FileWriter
 * ��ͨд����
 * 
 * ���з� ��\r\n
 * �ڶ��������������Ƿ�׷��
 * ���·�����������Ŀ
 * ����·�������̷���·��
 * 
 * flush��ˢ����
 * close���ر���
 * 
*/
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("fr.txt",true);
		fw.write("hello world");
		fw.write("\r\n");
		fw.flush();
		fw.close();
	}
}
