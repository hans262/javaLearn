package io.file;

import java.io.File;

/*
 * 获取文件甲下所有内容
 * */
public class FileDemo5 {
	public static void main(String[] args) {
//		method1();
//		method2();
		
//		method3();
	}

	private static void method3() {
		//返回当前根目录对象
		File[] files=File.listRoots();
		for(File file:files) {
			System.out.println(file);
		}
	}

	private static void method2() {
		//返回目录下所有文件夹和文件的File对象，File对象形式返回
		File file=new File("a");
		File[] files=file.listFiles();
		for(File f:files) {
			System.out.println(f);
		}
	}

	private static void method1() {
		//返回目录下所有文件夹和文件的名字，字符串形式返回
		File f1=new File("D:\\javaEE\\基础加强阶段\\day09\\avi");
		String[] files=f1.list();
		
		for(String s:files) {
			System.out.println(s);
		}
	}
}
