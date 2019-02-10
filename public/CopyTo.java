package com.ouna;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("c.txt",true);//◊∑º”…Ë÷√true
		for(int i=0;i<5;i++){
			fw.write("hello world "+i);
			fw.write("\r\n");
		}
		fw.close();
	}
}
