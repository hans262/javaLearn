package io.file_stream;

import java.io.FileReader;
import java.io.IOException;

/*
 * 一次读取一个字符数组
 * 有可能读满，有可能不满
 * 
 * len:本次读取的数组长度
 * 
 * len=-1:没有内容可读
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
