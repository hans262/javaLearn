package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("����","��᳤");
		map.put("����", "28");
		map.put("�Ա�", "Ů");
		map.put("����", "��ɻ�");
		
		//��һ�ֱ�����ʽ
		Set<String> keys=map.keySet();
		for(String key:keys) {
			String value=map.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("----------");
		//�ڶ��ֱ�����ʽ
		//��Ϊentry��Map���ڲ��࣬������ҪMapȥ����
		Set<Map.Entry<String,String>> entrys=map.entrySet();
		for(Map.Entry<String, String> entry:entrys) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+":"+value);
		}
	}
}
