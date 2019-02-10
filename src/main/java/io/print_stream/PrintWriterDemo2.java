package io.print_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/*
 * 自动换行 println
 * 自动刷新：传入字符流作为第一个参数，第二个布尔值参数控制是否刷新
 * 
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws IOException {
//		PrintWriter pw=new PrintWriter("is.txt");
		PrintWriter pw=new PrintWriter(new FileWriter("is.txt"),true);
		pw.println("hello");
		pw.println("world");
		pw.println("java");
		
		pw.close();
	}
}
