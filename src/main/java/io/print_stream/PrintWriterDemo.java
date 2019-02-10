package io.print_stream;

import java.io.IOException;
import java.io.PrintWriter;
/*
 * 打印流
 * 	只能输出流
 * 	
 * 	字节	PrintStream
 * 
 * 	字符	PrintWriter
 * 		可自动换行 println
 * 		自动刷新
 * 		不能输出字节
 * 		可以把字节输出流转换成字符输出流
 * 		包装流
 * 
 */

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("is.txt");
		pw.write("hello");
		pw.write("\r\n");
		pw.write("world");
		pw.close();
	}
}
