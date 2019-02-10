package io.byte_stream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节流
 * 图片、视频、一次一个byte
 * 
 * InputStream:输入
 * OutputStream:输出
 * 
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("Copy.java");
		int by;
		while((by=fis.read())!=-1){
			System.out.print((char)by);
		}
		fis.close();
	}
}
