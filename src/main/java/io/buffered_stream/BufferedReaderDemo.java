package io.buffered_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * 读取文件
 * 
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
//		readLine();
//		readCh();
		readChs();
	}
	//一次读取一个字符数组
	public static void readChs() throws IOException {
		BufferedReader br= new BufferedReader(new FileReader("bw.txt"));
		char[] chs=new char[1024];
		int len;
		while((len=br.read(chs))!=-1){
			System.out.print(new String(chs, 0, len));
		}
		br.close();
	}
	
	//一次读取一个字符
	public static void readCh() throws IOException {
		BufferedReader br= new BufferedReader(new FileReader("bw.txt"));
		int ch;
		while((ch=br.read())!=-1){
			System.out.print((char)ch);
		}
		br.close();
	}
	//一次读取一行
	public static void readLine() throws IOException {
		BufferedReader br= new BufferedReader(new FileReader("bw.txt"));
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
}
