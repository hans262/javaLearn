package collection.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		String[] arr={"������","��Ԫ��","���޼�","Ӧ����","�Ŵ�ɽ","ħ���"};
		ArrayList<String> array=new ArrayList<String>();
		for(int i=0;i<arr.length;i++) array.add(arr[i]);
		System.out.println(array);
		for(int i=0;i<array.size();i++){
			if(array.get(i).startsWith("��")){
				System.out.print(array.get(i)+",");
			}
		}
	}
}
