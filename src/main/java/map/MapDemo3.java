package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("姓名","徐会长");
		map.put("年龄", "28");
		map.put("性别", "女");
		map.put("爱好", "打飞机");
		
		//第一种遍历方式
		Set<String> keys=map.keySet();
		for(String key:keys) {
			String value=map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("----------");
		//第二种遍历方式
		//因为entry是Map的内部类，所以需要Map去调用
		Set<Map.Entry<String,String>> entrys=map.entrySet();
		for(Map.Entry<String, String> entry:entrys) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+":"+value);
		}
	}
}
