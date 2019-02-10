package io.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 *File对象的
 *获取方法
 *
 *修改名字功能
 *
 * */
public class FileDemo4 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\javaEE\\a\\b.txt");
		File f2=new File("a.txt");
		
		//获取File对象所指向路径的绝对路径，以字符串返回
//		System.out.println(f2.getAbsolutePath());
		//获取File对象所指向路径的绝对路径，以File对象返回
//		System.out.println(f2.getAbsoluteFile());
		
		File f3=new File("a");
		File f4=new File(f3,"a.txt");
//		if(!f3.exists()) {
//			f3.mkdirs();
//		}
//		f4.createNewFile();
		//获取指定父路径的，父类型对象
//		System.out.println(f4.getParentFile());
		//获取指定父路径的，父类型字符串
//		System.out.println(f4.getParent());
		
		//获取文件或文件夹的名称
//		System.out.println(f4.getName());
		
		//获取File对象所传入的路径
//		System.out.println(f2.getPath());
		
		//以毫秒返回文件的最后修改时间
//		System.out.println(f3.lastModified());
//		Date d=new Date(1531548094139L);
//		System.out.println(d);
		
		//返回文件的字节数，不能返回文件夹的字节数
//		System.out.println(f4.length());
		
		//修改文件或文件夹名字
//		File f5=new File("a\\a.txt");
//		File f6=new File("a\\b.txt");
//		System.out.println(f5.renameTo(f6));
	}
}
