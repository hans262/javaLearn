package io.buffered_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 缓冲流：高效的读写流
 * 
 * BufferedWriter:将文本写入字符输出流
 * 	void newLine():写一个换行符，由系统决定
 * 
 * BufferedReader:从字符输出流中读取文本
 * 	void readLine():一次读取一行数据，不读取换行符
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
