package io.file;

import java.io.File;

/*
 * ��ȡ�ļ�������������
 * */
public class FileDemo5 {
	public static void main(String[] args) {
//		method1();
//		method2();
		
//		method3();
	}

	private static void method3() {
		//���ص�ǰ��Ŀ¼����
		File[] files=File.listRoots();
		for(File file:files) {
			System.out.println(file);
		}
	}

	private static void method2() {
		//����Ŀ¼�������ļ��к��ļ���File����File������ʽ����
		File file=new File("a");
		File[] files=file.listFiles();
		for(File f:files) {
			System.out.println(f);
		}
	}

	private static void method1() {
		//����Ŀ¼�������ļ��к��ļ������֣��ַ�����ʽ����
		File f1=new File("D:\\javaEE\\������ǿ�׶�\\day09\\avi");
		String[] files=f1.list();
		
		for(String s:files) {
			System.out.println(s);
		}
	}
}
