package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ����Map
 * ΪʲôkeyҪSet���Ͻ��գ�valueҪCollection���գ�
 * ��Ϊkey�ǲ��ظ��ģ�Set����������ȥ�ؼ��ϣ�value�ǿ����ظ��ģ�Collection����Ҳ�����ظ�
 * 
 * */

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("001", "Bill");
		map.put("002", "Tom");
		map.put("003", "Kemi");
		map.put("004", "Jime");
		//��ȡ����key
		Set<String> keys=map.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		//��ȡ���е�value
		Collection<String> values=map.values();
		for(String value : values) {
			System.out.println(value);
		}
	}
}
