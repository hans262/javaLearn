package io.file;

import java.io.File;

public class GetFileDemo {
	public static void main(String[] args) {
		//�ݹ�ʵ�����Ŀ¼�������ļ�����
		File file=new File("bin");
		getFile(file);
	}
	public static void getFile(File file) {
		if(file.isDirectory()) {//�ж��Ƿ���һ���ļ���
			File[] files=file.listFiles();
			for(File f:files) {
				if(f.isDirectory()) {
					System.out.println(f+"Ŀ¼=>");
					getFile(f);
				}else if(f.isFile()) {
					System.out.println(f);
				}
			}
		}
	}
}
