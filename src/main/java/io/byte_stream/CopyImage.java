package io.byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ�������ͼƬ
 * �������ļ�ֻ��ʹ���ֽ�������
 */

public class CopyImage {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("ASCII.jpg");
		FileOutputStream fos=new FileOutputStream("ASCIITO.jpg");
		byte[] bys=new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1){
			fos.write(bys, 0, len);
		}
		fis.close();
		fos.close();
	}
}
