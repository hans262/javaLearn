package io.system_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/*
 * 标准输入流
 * 字节流
 * InputStream
 * 
 * InputStreamReader
 */

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		Reader r=new InputStreamReader(System.in);
		FileWriter fw=new FileWriter("is.txt");
		
		char[] chs=new char[1024];
		int len;
		while((len=r.read(chs))!=-1){
			fw.write(chs, 0, len);
			fw.flush();
		}
		r.close();
		fw.close();
	}

	public static void demo1() throws IOException {
		InputStream is=System.in;
		FileWriter fw=new FileWriter("is.txt");
		byte[] bys=new byte[1024];
		int len;
		while((len=is.read(bys))!=-1){
			fw.write(new String(bys, 0, len));
			fw.flush();
		}
		is.close();
		fw.close();
	}
}
