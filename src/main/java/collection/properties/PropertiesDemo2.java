package collection.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/*
 * ���з���
 * 
 * 	IO���Ľ�Ϸ���
 * 
 * 	void list(PrintWriter out)
 * 	void load(Reader reader)
 * 	void store(Writer writer, String comments)
 * 
 */
public class PropertiesDemo2 {
	public static void main(String[] args) throws IOException {
		//�����б����
		Properties prop=new Properties();
		//���ӳ���ϵ
		prop.put("GZBK01", "huahua");
		prop.put("GZBK02", "goudan");
		prop.put("GZBK03", "zhazha");
		FileWriter out=new FileWriter("is.txt");
		prop.store(out, "people");
		out.close();
		
	}

	public static void loadDemo() throws FileNotFoundException, IOException {
		//�����б����
		Properties prop=new Properties();
		//��������������
		FileReader fr=new FileReader("is.txt");
		//���ض���
		prop.load(fr);
		//�ͷ���Դ
		fr.close();
		
		System.out.println(prop);
	}

	public static void listDemo() throws FileNotFoundException {
		//�����б����
		Properties prop=new Properties();
		//���ӳ���ϵ
		prop.put("GZBK01", "huahua");
		prop.put("GZBK02", "goudan");
		prop.put("GZBK03", "zhazha");
		
		//������ӡ��
		PrintWriter out=new PrintWriter("is.txt");
		prop.list(out);
		
		out.close();
	}
}
