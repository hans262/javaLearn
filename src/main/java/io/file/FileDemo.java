package io.file;

import java.io.File;
/*
 * File����Ĵ���
 * 3�ֹ��췽��
 * 
 * */
public class FileDemo {
	public static void main(String[] args) {
		//����File���󣬲�ָ��·��
		File file=new File("D:\\javaEE\\a\\b.txt");
		
		//����File���󣬸��ݸ�·�����ļ�·��
		File file2=new File("D:\\javaEE\\a","b.txt");
		
		//����File���󣬸��ݸ�·��������ļ�·��
		File file3=new File(new File("D:\\javaEE\\a"),"b.txt");
		
		System.out.println(file3);
	}
}
