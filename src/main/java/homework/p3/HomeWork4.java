package homework.p3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//��Ŀ��·������text.txt�ļ����������£�
//�Ұ�����s
//123456
//����IO����֪ʶ��ȡtext.txt�ļ������ݷ�ת��д��text.txt�ļ���
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
