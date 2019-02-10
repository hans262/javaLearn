package homework.p3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//1.��e:\\a.txt���Ƶ�d:\\��Ŀ¼��
//2.�ö��ַ�ʽʵ�ָ���
//	(1)ʹ���ַ������ַ�ѭ������
//	(2)ʹ���ַ��������ַ�����ʵ�ָ���
//	(3)ʹ�ø�Ч�ַ�������ʵ�ָ���
public class HomeWork {
	public static void main(String[] args) throws IOException{
		String srcName="e:\\a.txt";
		String copyName="d:\\Copy.txt";
		copyFile5(srcName,copyName);
	}
	//��Ч�ַ�������һ�ζ�ȡһ���ַ���
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
	//��Ч�ַ��������ַ������ȡ
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
	//��Ч�ַ����������ַ���ȡ
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
	//ʹ���ַ��������ַ�����ʵ�ָ���
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
	//ʹ���ַ������ַ�ѭ������
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
