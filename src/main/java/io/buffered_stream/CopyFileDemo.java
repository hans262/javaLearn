package io.buffered_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 缓冲流复制文件
 */
public class CopyFileDemo {
	static String copy="Copy.java";
	static String copyTo="CopyTo.java";
	public static void main(String[] args) throws IOException {
//		copyCh();
//		copyChs();
		
		copyLine();
	}
	//一次读取一行字符
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
	//一次复制一个字符数组
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
	
	//一次复制一个字符
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
