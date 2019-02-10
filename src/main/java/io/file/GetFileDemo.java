package io.file;

import java.io.File;

public class GetFileDemo {
	public static void main(String[] args) {
		//递归实现输出目录下所有文件对象
		File file=new File("bin");
		getFile(file);
	}
	public static void getFile(File file) {
		if(file.isDirectory()) {//判断是否是一个文件夹
			File[] files=file.listFiles();
			for(File f:files) {
				if(f.isDirectory()) {
					System.out.println(f+"目录=>");
					getFile(f);
				}else if(f.isFile()) {
					System.out.println(f);
				}
			}
		}
	}
}
