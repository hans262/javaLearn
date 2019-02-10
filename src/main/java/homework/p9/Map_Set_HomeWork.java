package homework.p9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class Map_Set_HomeWork {
	public static void main(String[] args) {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
		
		
		VendingMachine vm=new VendingMachine();
		vm.setName("���������ۻ���");
		HashMap<String,Float> map=new HashMap<String,Float>();
		map.put("ѩ��", 4.00f);
		map.put("��ţ", 5.00f);
		map.put("�޹���", 3.50f);
		map.put("����", 4.00f);
		map.put("�Ӷ౦", 3.00f);
		vm.setYlb(map);
		vm.setJe(200.00f);
		
		System.out.println(vm.getYlb());
		shoopDrink(20.00f,"�Ӷ౦",vm);
		shoopDrink(20.00f,"����",vm);
	}

	private static void method8() {
//		1.ͳ��ÿ�����ʳ��ֵĴ���
//		2.�������ַ���"If you want to change your fate I think you must come to the dark horse to learn java"(�ÿո���)
//		3.��ӡ��ʽ��
//			to=3
//			think=1
//			you=2
		String s="If you want to change your fate I think you must come to the dark horse to learn java";
		String[] arr=s.split(" ");
		List<String> list=new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		Set<String> set=new HashSet<String>();
		for(int i=0;i<list.size();i++) {
			set.add(list.get(i));
		}
		System.out.println(set);
		int x=0;
		for(String v:set) {
			for(int i=0;i<list.size();i++) {
				if(v.equals(list.get(i))) {
					x+=1;
				}
			}
			System.out.println(v+"="+x);
			x=0;
		}
	}

	private static void method7() {
//		1.���ü���¼�룬����һ���ַ���
//		2.ͳ�Ƹ��ַ����и����ַ�������(��ʾ:�ַ���������)
//		3.�磺
//			�û������ַ���"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
//			������������-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ַ���");
		String s=sc.nextLine();
		//װ�뼯��
		List<Character> list=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			list.add(s.charAt(i));
		}
		//ȥ��
		Set<Character> set=new HashSet<Character>();
		for(char c:list) {
			set.add(c);
		}
		int x=0;
		for(char c:set) {
			for(int i=0;i<list.size();i++) {
				if(c==list.get(i)) x+=1;
			}
			System.out.print(c+"("+x+")");
			x=0;
		}
	}

	private static void method6() {
//		2.����һ��map����,keyΪStudent���͵Ķ���,valueΪString���͵ĵ�ַ,
//		�������ݶ�������(��Ҫ��������Ψһ���ж�)
//			(1)����һ��ѧ����Student���������ԣ�����(String name)������(int age)���ɼ�(int score)
//			(2)����Map���ϣ���Student������Ϊkey�����ַ���(�˱�ʾ��ʾѧ����סַ)��Ϊvalue
//			(3)�������ַ�ʽ����Map�����е����ݣ���ʽ��key::value	
		Map<Student,String> map=new HashMap<Student,String>();
		map.put(new Student("Tom",22,85), "����");
		map.put(new Student("Bill",25,96), "�Ϻ�");
		map.put(new Student("Kemi",23,91), "�ɶ�");
		map.put(new Student("Tom",22,85), "�Ͼ�");
//		System.out.println(map);
//		Set<Student> keys=map.keySet();
//		for(Student key:keys) {
//			String value=map.get(key);
//			System.out.println(key+"::"+value);
//		}
		Set<Map.Entry<Student, String>> entrys=map.entrySet();
		for(Map.Entry<Student, String> entry:entrys) {
			Student key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"::"+value);
		}
	}

	private static void method5() {
//		1.����һ��map����,keyΪString���͵�����,valueΪString���͵�ַ,
//		�������ݶ�������(���費�������������),���ö��ַ�ʽ����
		Map<String,String> map=new HashMap<String,String>();
		map.put("Bill", "����");
		map.put("Tom", "�Ϻ�");
		map.put("Bob", "����");
		map.put("Kemi", "�Ͼ�");
//		Set<String> keys=map.keySet();
//		for(String key:keys) {
//			System.out.println(key+":"+map.get(key));
//		}
		Set<Map.Entry<String, String>> entrys=map.entrySet();
		for(Map.Entry<String, String> entry:entrys) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+":"+value);
		}
	}
	
	private static void method4() {
		//����Student�����������String name�����䣺int age���ɼ���int score�����ɿղΡ��вι��졢set��get������toString����
		//1.����10��ѧ������(����������ѧԱ��Ϣ��ȫ��ͬ)���뼯����
		//2.ȥ���ظ���ѧԱ��������ӡʣ��ѧԱ��Ϣ(�ֱ�������ͨforѭ������ǿforѭ��������������)
		//3.��ӡ��߷ֵ�ѧԱ��Ϣ
		//4.��ӡƽ����
		//5.��ӡ�������ѧԱ��Ϣ������
		Set<Student> set=new HashSet<Student>();
		set.add(new Student("Bill",28,88));
		set.add(new Student("Tom",22,96));
		set.add(new Student("Kemi",25,55));
		set.add(new Student("Finy",23,92));
		set.add(new Student("Kemi",25,55));
		set.add(new Student("Honiy",25,49));
		int sunscore=0;
		int maxscore=0;
		int bjnum=0;
		//��ǿforѭ������
		//for(Student s:set) {
		//	System.out.println(s);
		//}
		//����������
		Iterator<Student> it=set.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			sunscore+=s.getScore();
			if(s.getScore()>maxscore) maxscore=s.getScore();
			if(s.getScore()<60) bjnum+=1;
			System.out.println(s);
		}
		System.out.println("��߳ɼ���"+maxscore);
		System.out.println("ƽ���֣�"+sunscore/set.size());
		System.out.println("������ѧԱ������"+bjnum);
	}

	private static void method3() {
		//1.����10��1-20֮��������Ҫ������������ظ�
		//2.����10������Ϊ10�Ĳ����ظ����ַ���(����ֻ�ܳ��ִ�д��ĸ��Сд��ĸ��0-9������)����������ӡ���
		Random r=new Random();
		Set<Integer> set=new HashSet<Integer>();
		while(set.size()<10) {
			int s=r.nextInt(20)+1;
			set.add(s);
		}
		System.out.println(set);
	}

	private static void method2() {
		//���̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s=sc.nextLine();
		List<Character> list=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			if(!list.contains(s.charAt(i))) {
				list.add(s.charAt(i));
			}
		}
		System.out.println(list);
	}

	private static void method1() {
		/*
		 * 1.����һ������Ϊ10��int����,������10��int���͵�����,������һЩ�������ظ���
		 * 2.���ü��ϵ�֪ʶ���������ȥ��,����������,���ܸı�������ԭ�����ֵĴ�С˳��
		 * 3.��ӡ�������е�����
		*/
		int[] arr={1,2,2,8,4,6,9,5,3,5};
		List<Integer> list=new ArrayList<Integer>();
		//��֤˳�򲻱�����ʹ��List����
		for(int i=0;i<arr.length;i++) {
			if(!list.contains(arr[i])) {//�������ʹ���
				list.add(arr[i]);
			}
		}
		System.out.println(list);
	}
	public static void shoopDrink(float m, String s,VendingMachine vm) {
		//���볮Ʊ���������ƺ���Ҫ�жϴ���ĳ�Ʊ�Ƿ�Ϊ�桢��ֵ�Ƿ��㹻����������ϣ�
		//�������Ϲ�����������������ʾ�������������̣�
		//������ɹ������ӡ���������Ŀǰ�����ֽ��ܶ
		Money money=new Money();
		money.setMz(m);
		money.setZj(true);
		
		if(vm.getYlb().get(s)!=null && money.isZj() && m>=vm.getYlb().get(s)) {
			//��ƱΪ�桢���ϴ���
			float zling=m-vm.getYlb().get(s);
			float sjing=vm.getJe()+vm.getYlb().get(s);
			System.out.println("����ɹ������㣺"+zling);
			System.out.println("Ŀǰ�����ֽ��ܶ�"+sjing);
			vm.setJe(sjing);
		}else {
			System.out.println("���򲻳ɹ�����ƱΪ��/��Ʊ����");
		}
	}
}

class VendingMachine{
	private String name;//�ۻ�������
	private HashMap<String, Float> ylb;//�ۻ��������б�
	private float je;//�ۻ���ʣ����
	public VendingMachine() {
		super();
	}
	public VendingMachine(String name, HashMap<String, Float> ylb, float je) {
		super();
		this.name = name;
		this.ylb = ylb;
		this.je = je;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap<String, Float> getYlb() {
		return ylb;
	}
	public void setYlb(HashMap<String, Float> ylb) {
		this.ylb = ylb;
	}
	public float getJe() {
		return je;
	}
	public void setJe(float je) {
		this.je = je;
	}
}

class Money{
	private Float mz;
	private boolean zj;
	public Money() {
		super();
	}
	public Money(Float mz, boolean zj) {
		super();
		this.mz = mz;
		this.zj = zj;
	}
	public Float getMz() {
		return mz;
	}
	public void setMz(Float mz) {
		this.mz = mz;
	}
	public boolean isZj() {
		return zj;
	}
	public void setZj(boolean zj) {
		this.zj = zj;
	}
}
