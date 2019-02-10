package io.file_stream;

import java.io.FileWriter;
import java.io.IOException;
/*
 * FileWriter
 * 普通写入流
 * 
 * 换行符 ：\r\n
 * 第二个参数：控制是否追加
 * 相对路径：相对于项目
 * 绝对路径：带盘符的路径
 * 
 * flush：刷新流
 * close：关闭流
 * 
*/
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("fr.txt",true);
		fw.write("hello world");
		fw.write("\r\n");
		fw.flush();
		fw.close();
	}
}
