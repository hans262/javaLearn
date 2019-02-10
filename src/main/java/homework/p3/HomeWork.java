package homework.p3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//1.将e:\\a.txt复制到d:\\根目录下
//2.用多种方式实现复制
//	(1)使用字符流单字符循环复制
//	(2)使用字符流利用字符数组实现复制
//	(3)使用高效字符缓冲流实现复制
public class HomeWork {
	public static void main(String[] args) throws IOException{
		String srcName="e:\\a.txt";
		String copyName="d:\\Copy.txt";
		copyFile5(srcName,copyName);
	}
	//高效字符缓冲流一次读取一行字符串
	public static void copyFile5(String srcName,String copyName) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(srcName));
		BufferedWriter bw=new BufferedWriter(new FileWriter(copyName));
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
	//高效字符缓冲流字符数组读取
	public static void copyFile4(String srcName,String copyName) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(srcName));
		BufferedWriter bw=new BufferedWriter(new FileWriter(copyName));
		char[] chs=new char[1024];
		int len;
		while((len=br.read(chs))!=-1){
			bw.write(new String(chs));
			bw.flush();
		}
		bw.close();
		br.close();
	}
	//高效字符缓冲流单字符读取
	public static void copyFile3(String srcName,String copyName) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(srcName));
		BufferedWriter bw=new BufferedWriter(new FileWriter(copyName));
		int len;
		while((len=br.read())!=-1){
			bw.write((char)len);
			bw.flush();
		}
		bw.close();
		br.close();
	}
	//使用字符流利用字符数组实现复制
	public static void copyFile2(String srcName,String copyName) throws IOException {
		FileReader fr=new FileReader(srcName);
		FileWriter fw=new FileWriter(copyName);
		char[] chs=new char[1024];
		int len;
		while((len=fr.read(chs))!=-1){
			fw.write(new String(chs,0,len));
			fw.flush();
		}
		fw.close();
		fr.close();
	}
	//使用字符流单字符循环复制
	public static void copyFile1(String srcName,String copyName) throws IOException {
		FileReader fr=new FileReader(srcName);
		FileWriter fw=new FileWriter(copyName);
		int len;
		while((len=fr.read())!=-1){
			fw.write((char)len);
			fw.flush();
		}
		fw.close();
		fr.close();
	}
}
