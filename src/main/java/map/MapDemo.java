package map;

import java.util.HashMap;
import java.util.Map;

/*
 * map是一个接口
 * 
 * 
 * 
 * 
 * 
 * */
public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		
		//映射功能
		System.out.println("映射---");
		//map 将key映射到value，key存在就返回以前的value，key不存在就返回null
		System.out.println(map.put("001", "Bill"));
		System.out.println(map.put("002", "Tom"));
		System.out.println(map.put("001", "Kemi"));
		System.out.println(map.put("003", "Bob"));
		
		//删除功能
		System.out.println("删除---");
//		map.clear();
		System.out.println(map.remove("001"));//删除不成功，返回null
		
		//判断功能
		System.out.println("判断---");
		System.out.println(map.containsKey("003"));
		System.out.println(map.containsValue("Kemi"));
		System.out.println(map.isEmpty());
		
		//获取功能
		System.out.println("获取---");
		System.out.println(map.size());
		System.out.println(map.get("004"));//获取不成功返回null
		
		//遍历功能
		System.out.println(map);
		
	}
}
