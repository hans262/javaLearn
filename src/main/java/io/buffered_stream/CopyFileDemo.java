package io.buffered_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �����������ļ�
 */
public class CopyFileDemo {
	static String copy="Copy.java";
	static String copyTo="CopyTo.java";
	public static void main(String[] args) throws IOException {
//		copyCh();
//		copyChs();
		
		copyLine();
	}
	//һ�ζ�ȡһ���ַ�
	public static void copyLine() throws FileNotFoundException, IOException {
		BufferedReader br=new BufferedReader(new FileReader(copy));
		BufferedWriter bw=new BufferedWriter(new FileWriter(copyTo));
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
	//һ�θ���һ���ַ�����
	public static void copyChs() throws FileNotFoundException, IOException {
		BufferedReader br=new BufferedReader(new FileReader(copy));
		BufferedWriter bw=new BufferedWriter(new FileWriter(copyTo));
		char[] chs=new char[1024];
		int len;
		while((len=br.read(chs))!=-1){
			bw.write(chs, 0, len);
		}
		br.close();
		bw.close();
	}
	
	//һ�θ���һ���ַ�
	public static void copyCh() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(copy));
		BufferedWriter bw=new BufferedWriter(new FileWriter(copyTo));
		int ch;
		while((ch=br.read())!=-1){
			bw.write(ch);
		}
		br.close();
		bw.close();
	}
}
