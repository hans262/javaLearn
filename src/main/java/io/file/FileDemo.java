package io.file;

import java.io.File;
/*
 * File对象的创建
 * 3种构造方法
 * 
 * */
public class FileDemo {
	public static void main(String[] args) {
		//创建File对象，并指向路径
		File file=new File("D:\\javaEE\\a\\b.txt");
		
		//创建File对象，根据父路径和文件路径
		File file2=new File("D:\\javaEE\\a","b.txt");
		
		//创建File对象，根据父路径对象和文件路径
		File file3=new File(new File("D:\\javaEE\\a"),"b.txt");
		
		System.out.println(file3);
	}
}
