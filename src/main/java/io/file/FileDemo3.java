package io.file;

import java.io.File;

/*
 * File������жϹ���
 * */
public class FileDemo3 {
	public static void main(String[] args) {
		//�ж��ļ��Ƿ����
		File f1=new File("D:\\javaEE\\a\\b.txt");
		System.out.println(f1.exists());
		//�ж��Ƿ��Ǿ���·��
		File f2=new File("D:\\javaEE\\a\\b.txt");
		System.out.println(f2.isAbsolute());
		//�ж��Ƿ����ļ���
		File f3=new File("a");
		System.out.println(f3.isDirectory());
		//�ж��Ƿ����ļ�
		File f4=new File("a.txt");
		System.out.println(f4.isFile());
		//�ж��Ƿ��������ļ��ļ����ļ���
		File f5=new File("D:\\javaEE\\a\\b.txt");
		System.out.println(f5.isHidden());
	}
}
