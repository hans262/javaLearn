package io.byte_stream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * �ֽ���
 * ͼƬ����Ƶ��һ��һ��byte
 * 
 * InputStream:����
 * OutputStream:���
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
