package io.byte_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("fos.txt");
		
		fos.write(97);
		fos.close();
		
	}
}
