package io.file_stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 复制文件
 */

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
//		copyCh();
		copyChs();
		
	}

	//一次复制一个字符数组
	public static void copyChs() throws IOException {
		FileReader fr = new FileReader("Copy.java");
		FileWriter fw=new FileWriter("CopyTo.java");
		
		char[] chs=new char[1024];
		int len;
		while((len=fr.read(chs))!=-1){
			fw.write(chs, 0, len);
		}
		
		fr.close();
		fw.close();
	}

	//一次复制一个字符
	public static void copyCh() throws IOException {
		FileReader fr=new FileReader("Copy.java");
		FileWriter fw=new FileWriter("CopyTo.java");
		
		int ch;
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}
	
}
