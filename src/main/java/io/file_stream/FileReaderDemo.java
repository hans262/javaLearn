package io.file_stream;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader
 * 普通读取流
 * 
 * 一次读取一个字符
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
