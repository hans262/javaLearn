package collection.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/*
 * 特有方法
 * 
 * 	IO流的结合方法
 * 
 * 	void list(PrintWriter out)
 * 	void load(Reader reader)
 * 	void store(Writer writer, String comments)
 * 
 */
public class PropertiesDemo2 {
	public static void main(String[] args) throws IOException {
		//创建列表对象
		Properties prop=new Properties();
		//添加映射关系
		prop.put("GZBK01", "huahua");
		prop.put("GZBK02", "goudan");
		prop.put("GZBK03", "zhazha");
		FileWriter out=new FileWriter("is.txt");
		prop.store(out, "people");
		out.close();
		
	}

	public static void loadDemo() throws FileNotFoundException, IOException {
		//创建列表对象
		Properties prop=new Properties();
		//创建输入流对象
		FileReader fr=new FileReader("is.txt");
		//加载对象
		prop.load(fr);
		//释放资源
		fr.close();
		
		System.out.println(prop);
	}

	public static void listDemo() throws FileNotFoundException {
		//创建列表对象
		Properties prop=new Properties();
		//添加映射关系
		prop.put("GZBK01", "huahua");
		prop.put("GZBK02", "goudan");
		prop.put("GZBK03", "zhazha");
		
		//创建打印流
		PrintWriter out=new PrintWriter("is.txt");
		prop.list(out);
		
		out.close();
	}
}
