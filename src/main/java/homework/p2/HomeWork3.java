package homework.p2;

import java.util.ArrayList;
import java.util.regex.Pattern;

//1.����ArrayList���ϣ��������ַ���
//��:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "��ð�"  "������"  "���ܰ�"
//2.��������,ɾ�����ȴ���5���ַ���,��ӡɾ����ļ��϶���
//3.������һ��,ɾ��������Ԫ�ذ���0-9���ֵ��ַ���(ֻҪ�ַ����а���0-9�е�����һ�����־���Ҫɾ���������ַ���)
public class HomeWork3 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("ab1");
		array.add("123ad");
		array.add("bca");
		array.add("dadfadf");
		array.add("dddaaa");
		array.add("��ð�");
		array.add("������");
		array.add("���ܰ�");
		for(int i=0;i<array.size();i++){
			if(array.get(i).length()>5){
				array.remove(i);
				i--;
			}
			Pattern p = Pattern.compile("[0-9]");
            java.util.regex.Matcher m = p.matcher(array.get(i));
            if(m.find()){
            	array.remove(i);
            	i--;
            }
		}
		System.out.println(array);
	}
}
