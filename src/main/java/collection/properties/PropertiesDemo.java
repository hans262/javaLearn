package collection.properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 * Properties:�־õ����Լ�
 * 
 * 	ʵ����map�ӿ�
 * 
 * 
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		//�����б����
		Properties prop=new Properties();
		//���ӳ���ϵ
		prop.put("GZBK01", "huahua");
		prop.put("GZBK02", "goudan");
		prop.put("GZBK03", "zhazha");
		//��ȡ����key
		Set<Object> keys=prop.keySet();
		//���������б�
		for(Object key:keys){
			Object value=prop.get(key);
			System.out.println(key+" "+value);
		}
		
		System.out.println("-------------------");
		//��ȡ���н��֤����
		Set<Map.Entry<Object, Object>> entrys=prop.entrySet();
		for(Map.Entry<Object, Object> entry:entrys){
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+" "+value);
		}
	}
}
