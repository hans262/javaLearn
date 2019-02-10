package io.buffered_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * ��ȡ�ļ�
 * 
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
//		readLine();
//		readCh();
		readChs();
	}
	//һ�ζ�ȡһ���ַ�����
	public static void readChs() throws IOException {
		BufferedReader br= new BufferedReader(new FileReader("bw.txt"));
		char[] chs=new char[1024];
		int len;
		while((len=br.read(chs))!=-1){
			System.out.print(new String(chs, 0, len));
		}
		br.close();
	}
	
	//һ�ζ�ȡһ���ַ�
	public static void readCh() throws IOException {
		BufferedReader br= new BufferedReader(new FileReader("bw.txt"));
		int ch;
		while((ch=br.read())!=-1){
			System.out.print((char)ch);
		}
		br.close();
	}
	//һ�ζ�ȡһ��
	public static void readLine() throws IOException {
		BufferedReader br= new BufferedReader(new FileReader("bw.txt"));
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
}
