package homework.p2;

import java.util.ArrayList;

//1.����ArrayList���ϣ��������ַ���"abc" "def"  "efg" "qwe" "swd" "wwe"
//2.��ȡ����������Ϊ3��Ԫ�ز���ӡ
//3.��������,����"def"Ԫ��ʱ,"def"ֱ��ɾ��
//4.��������ÿ��Ԫ���е�Сд��ĸ��ɴ�д��ĸ
//5.��ӡ����
public class HomeWork2 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("abc");
		array.add("def");
		array.add("efg");
		array.add("qwe");
		array.add("swd");
		array.add("wwe");
		for(int i=0;i<array.size();i++){
			if(array.get(i)=="def"){
				array.remove(i);
			}
			String s=array.get(i).toUpperCase();
			array.set(i, s);
		}
		System.out.println(array);
	}
}
