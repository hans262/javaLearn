package exception;

import java.io.FileWriter;
import java.io.IOException;

/*
 * finally:释放资源、清理垃圾、一定执行
 * 
 * */
public class FinallyDemo {
	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("a.txt");
			fw.write("aaaa\r\n");
			fw.write("bbbb\r\n");
			fw.write("cccc\r\n");
			System.out.println(10/0);
			fw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw!=null) {
					fw.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(10);
	}
}
