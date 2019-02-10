package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 遍历Map
 * 为什么key要Set集合接收，value要Collection接收？
 * 因为key是不重复的，Set集合正好是去重集合，value是可以重复的，Collection集合也允许重复
 * 
 * */

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("001", "Bill");
		map.put("002", "Tom");
		map.put("003", "Kemi");
		map.put("004", "Jime");
		//获取所有key
		Set<String> keys=map.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		//获取所有的value
		Collection<String> values=map.values();
		for(String value : values) {
			System.out.println(value);
		}
	}
}
