package homework.p3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//项目根路径下有text.txt文件，内容如下：
//我爱黑马s
//123456
//利用IO流的知识读取text.txt文件的内容反转后写入text.txt文件中
public class HomeWork4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("text.txt"));
		String content="";
		int len;
		while((len=br.read())!=-1){
			content+=(char)len;
		}
		br.close();
		BufferedWriter bw=new BufferedWriter(new FileWriter("text.txt"));
		StringBuilder sb=new StringBuilder(content);
		bw.write(sb.reverse().toString());
		bw.flush();
		bw.close();
	}
}
