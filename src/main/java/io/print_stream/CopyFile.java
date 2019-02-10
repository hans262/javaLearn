package io.print_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 打印流复制文件
 */
public class CopyFile {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("Copy.java"));
		PrintWriter pw=new PrintWriter(new FileWriter("CopyTo.java"),true);
		
		String line;
		while((line=br.readLine())!=null){
			pw.println(line);
		}
		br.close();
		pw.close();
	}
}
