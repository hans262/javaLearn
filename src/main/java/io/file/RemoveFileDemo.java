package io.file;

import java.io.File;

public class RemoveFileDemo {
	public static void main(String[] args) {
		//删除目录下的所有文件，包括自己
		File file=new File("D:\\a");
		removeFile(file);
	}
	public static void removeFile(File file) {
		if(file.isDirectory()) {
			//删除子目录
			File[] files=file.listFiles();
			for(File f:files) {
				if(f.isFile()) {
					System.out.println(f.getName());
					f.delete();
				}else if(f.isDirectory()) {
					removeFile(f);
				}
			}
			//删除自己
			System.out.println(file.getName());
			file.delete();
		}
	}
}
