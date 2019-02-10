package io.file;

import java.io.File;
import java.io.IOException;

/*
 * File对象
 * 		绝对路径：以盘符开头
 * 		相对路径：相对于项目
 * 
 * 
 * 
 * 创建功能
 * 		
 * 
 * 删除功能
 * 		当指定的文件或文件夹存在时，删除文件或文件夹，
 * 		如果有子文件夹或子文件时，必须先删除子文件或子文件甲
 * 
 * */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		//--创建功能--
		
		//创建文件
//		File f1=new File("i\\i.txt");
//		System.out.println(f1.createNewFile());
		
		//创建文件夹
//		File f2=new File("i\\j");
//		System.out.println(f2.mkdir());
		
//		File f3=new File("o\\p\\q");
//		System.out.println(f3.mkdirs());//创建多层文件夹
		
		//--删除功能--
		
//		File f4=new File("i.txt");
//		System.out.println(f4.delete());
		
//		File f5=new File("i");
//		System.out.println(f5.delete());
	}
}
