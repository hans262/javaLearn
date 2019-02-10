package homework.p3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//实现一个验证码小程序，要求如下：
//1. 在项目根目录下新建一个文件：data.txt,
//键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
//2. 键盘录入一个需要被校验的验证码，
//如果输入的验证码在data.txt中存在：
//在控制台提示验证成功，如果不存在控制台提示验证失败 
public class HomeWork2 {
	public static void main(String[] args) throws IOException {
		String code="9856";
		BufferedReader br=new BufferedReader(new FileReader("data.txt"));
		String line;
		boolean flag=false;
		while((line=br.readLine())!=null){
			if(code.equals(line)){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println("验证成功");
		}else{
			System.out.println("验证失败");
		}
		br.close();
	}
}
