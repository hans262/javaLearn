package io.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 *File�����
 *��ȡ����
 *
 *�޸����ֹ���
 *
 * */
public class FileDemo4 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\javaEE\\a\\b.txt");
		File f2=new File("a.txt");
		
		//��ȡFile������ָ��·���ľ���·�������ַ�������
//		System.out.println(f2.getAbsolutePath());
		//��ȡFile������ָ��·���ľ���·������File���󷵻�
//		System.out.println(f2.getAbsoluteFile());
		
		File f3=new File("a");
		File f4=new File(f3,"a.txt");
//		if(!f3.exists()) {
//			f3.mkdirs();
//		}
//		f4.createNewFile();
		//��ȡָ����·���ģ������Ͷ���
//		System.out.println(f4.getParentFile());
		//��ȡָ����·���ģ��������ַ���
//		System.out.println(f4.getParent());
		
		//��ȡ�ļ����ļ��е�����
//		System.out.println(f4.getName());
		
		//��ȡFile�����������·��
//		System.out.println(f2.getPath());
		
		//�Ժ��뷵���ļ�������޸�ʱ��
//		System.out.println(f3.lastModified());
//		Date d=new Date(1531548094139L);
//		System.out.println(d);
		
		//�����ļ����ֽ��������ܷ����ļ��е��ֽ���
//		System.out.println(f4.length());
		
		//�޸��ļ����ļ�������
//		File f5=new File("a\\a.txt");
//		File f6=new File("a\\b.txt");
//		System.out.println(f5.renameTo(f6));
	}
}
