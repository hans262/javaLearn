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
 * ��׼��
 * 	�ֽ���
 * 	����	InputStream System.in
 * 	���	OutputStream System.out
 * 
 * ת����
 * 	OutputStreamWriter
 * 	�ֽ���ת�ַ������ֽ������ַ���������
 * 	���������һ���ֽ���
 * 	
 */

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("Copy.java"));
		Writer w=new OutputStreamWriter(System.out);//�ֽ���ת�ַ���
		BufferedWriter bw=new BufferedWriter(w);//���ø�Ч������ģ�newLine����
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
