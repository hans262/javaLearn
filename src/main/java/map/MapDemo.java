package map;

import java.util.HashMap;
import java.util.Map;

/*
 * map��һ���ӿ�
 * 
 * 
 * 
 * 
 * 
 * */
public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		
		//ӳ�书��
		System.out.println("ӳ��---");
		//map ��keyӳ�䵽value��key���ھͷ�����ǰ��value��key�����ھͷ���null
		System.out.println(map.put("001", "Bill"));
		System.out.println(map.put("002", "Tom"));
		System.out.println(map.put("001", "Kemi"));
		System.out.println(map.put("003", "Bob"));
		
		//ɾ������
		System.out.println("ɾ��---");
//		map.clear();
		System.out.println(map.remove("001"));//ɾ�����ɹ�������null
		
		//�жϹ���
		System.out.println("�ж�---");
		System.out.println(map.containsKey("003"));
		System.out.println(map.containsValue("Kemi"));
		System.out.println(map.isEmpty());
		
		//��ȡ����
		System.out.println("��ȡ---");
		System.out.println(map.size());
		System.out.println(map.get("004"));//��ȡ���ɹ�����null
		
		//��������
		System.out.println(map);
		
	}
}
