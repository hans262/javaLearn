package io.file;

import java.io.File;

/*
 * File对象的判断功能
 * */
public class FileDemo3 {
	public static void main(String[] args) {
		//判断文件是否存在
		File f1=new File("D:\\javaEE\\a\\b.txt");
		System.out.println(f1.exists());
		//判断是否是绝对路径
		File f2=new File("D:\\javaEE\\a\\b.txt");
		System.out.println(f2.isAbsolute());
		//判断是否是文件夹
		File f3=new File("a");
		System.out.println(f3.isDirectory());
		//判断是否是文件
		File f4=new File("a.txt");
		System.out.println(f4.isFile());
		//判断是否是隐藏文件文件或文件夹
		File f5=new File("D:\\javaEE\\a\\b.txt");
		System.out.println(f5.isHidden());
	}
}
