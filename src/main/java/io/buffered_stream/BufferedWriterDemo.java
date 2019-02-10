package io.buffered_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ����������Ч�Ķ�д��
 * 
 * BufferedWriter:���ı�д���ַ������
 * 	void newLine():дһ�����з�����ϵͳ����
 * 
 * BufferedReader:���ַ�������ж�ȡ�ı�
 * 	void readLine():һ�ζ�ȡһ�����ݣ�����ȡ���з�
 * 
 */
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("bw.txt"));
		bw.write("hello");
		bw.write("\r\n");
		bw.write("world");
		bw.write("\r\n");
		bw.write("java");
		bw.write("\r\n");
		bw.write("javascript");
		bw.write("\r\n");
		
		bw.flush();
		bw.close();
	}
}
