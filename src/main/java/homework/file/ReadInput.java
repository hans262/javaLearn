package homework.file;
import java.io.*;

public class ReadInput {
	public static void main(String[] args) throws IOException{
		char c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按下q退出");
		do{
			c=(char) br.read();
			System.out.print(c);
		}while(c!='q');
	}
}
