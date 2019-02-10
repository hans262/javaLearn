package io.byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) throws IOException {
//		copyBy();
		copyBys();
	}
	//一次复制一个字节数组
	public static void copyBys() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("Copy.java");
		FileOutputStream fos=new FileOutputStream("CopyTo.java");
		byte[] bys=new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1){
			fos.write(bys, 0, len);
		}
		
		fis.close();
		fos.close();
	}
	//一次复制一个字节
	public static void copyBy() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("Copy.java");
		FileOutputStream fos=new FileOutputStream("CopyTo.java");
		int by;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		fis.close();
		fos.close();
	}
}
