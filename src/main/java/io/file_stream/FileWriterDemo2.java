package io.file_stream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * void write(String str):写一个字符串数据
 * void write(String str, int index, int len):写一部分字符串数据
 * void write(int ch):写一个字符数据，或char对应的int类型的值。'a',97
 * void write(cha[] chs):写一个字符数组
 * void write(char[] chs, int index, int len):写一部分字符数组
 * 
*/
public class FileWriterDemo2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("fr.txt");
		
		fw.write("hello world");
		fw.write("\r\n");
		
		fw.write("hello world", 6, 5);
		fw.write("\r\n");
		
		fw.write(97);
		fw.write("\r\n");
		
		char[] chs={'h', 'e', 'l', 'l', 'o'};
		fw.write(chs);
		fw.write("\r\n");
		
		fw.write(chs, 2, 3);
		fw.write("\r\n");

		fw.flush();
		fw.close();
	}
}
