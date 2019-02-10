package collection.properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 * Properties:持久的属性集
 * 
 * 	实现了map接口
 * 
 * 
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		//创建列表对象
		Properties prop=new Properties();
		//添加映射关系
		prop.put("GZBK01", "huahua");
		prop.put("GZBK02", "goudan");
		prop.put("GZBK03", "zhazha");
		//获取所有key
		Set<Object> keys=prop.keySet();
		//遍历属性列表
		for(Object key:keys){
			Object value=prop.get(key);
			System.out.println(key+" "+value);
		}
		
		System.out.println("-------------------");
		//获取所有结婚证对象
		Set<Map.Entry<Object, Object>> entrys=prop.entrySet();
		for(Map.Entry<Object, Object> entry:entrys){
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+" "+value);
		}
	}
}
