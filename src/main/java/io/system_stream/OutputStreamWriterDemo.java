package io.system_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * 标准流
 * 	字节流
 * 	输入	InputStream System.in
 * 	输出	OutputStream System.out
 * 
 * 转换流
 * 	OutputStreamWriter
 * 	字节流转字符流，字节流和字符流的桥梁
 * 	构造参数是一个字节流
 * 	
 */

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("Copy.java"));
		Writer w=new OutputStreamWriter(System.out);//字节流转字符流
		BufferedWriter bw=new BufferedWriter(w);//利用高效输出流的，newLine功能
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
	
	public static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br =new BufferedReader(new FileReader("Copy.java"));
		OutputStream os=System.out;
		String line;
		while((line=br.readLine())!=null){
			os.write(line.getBytes());
			os.write("\r\n".getBytes());
		}
		br.close();
		os.close();
	}
}
