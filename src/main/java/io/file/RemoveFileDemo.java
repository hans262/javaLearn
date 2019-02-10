package io.file;

import java.io.File;

public class RemoveFileDemo {
	public static void main(String[] args) {
		//ɾ��Ŀ¼�µ������ļ��������Լ�
		File file=new File("D:\\a");
		removeFile(file);
	}
	public static void removeFile(File file) {
		if(file.isDirectory()) {
			//ɾ����Ŀ¼
			File[] files=file.listFiles();
			for(File f:files) {
				if(f.isFile()) {
					System.out.println(f.getName());
					f.delete();
				}else if(f.isDirectory()) {
					removeFile(f);
				}
			}
			//ɾ���Լ�
			System.out.println(file.getName());
			file.delete();
		}
	}
}
