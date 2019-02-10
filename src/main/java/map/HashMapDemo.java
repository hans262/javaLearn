package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("001", "徐会长");
		hm.put("002","黄厅");
		hm.put("003", "蛋蛋");
		
		//第一种遍历方式
		Set<String> keys=hm.keySet();
		for(String key:keys) {
			String value=hm.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("-------");
		//第二种遍历方式
		Set<Map.Entry<String, String>> entrys=hm.entrySet();
		for(Map.Entry<String, String> entry:entrys) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+":"+value);
		}
	}
}
