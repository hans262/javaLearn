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
		vm.setName("有料饮料售货机");
		HashMap<String,Float> map=new HashMap<String,Float>();
		map.put("雪碧", 4.00f);
		map.put("红牛", 5.00f);
		map.put("娃哈哈", 3.50f);
		map.put("脉动", 4.00f);
		map.put("加多宝", 3.00f);
		vm.setYlb(map);
		vm.setJe(200.00f);
		
		System.out.println(vm.getYlb());
		shoopDrink(20.00f,"加多宝",vm);
		shoopDrink(20.00f,"脉动",vm);
	}

	private static void method8() {
//		1.统计每个单词出现的次数
//		2.有如下字符串"If you want to change your fate I think you must come to the dark horse to learn java"(用空格间隔)
//		3.打印格式：
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
//		1.利用键盘录入，输入一个字符串
//		2.统计该字符串中各个字符的数量(提示:字符不用排序)
//		3.如：
//			用户输入字符串"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
//			程序输出结果：-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入字符串");
		String s=sc.nextLine();
		//装入集合
		List<Character> list=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			list.add(s.charAt(i));
		}
		//去重
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
//		2.定义一个map集合,key为Student类型的对象,value为String类型的地址,
//		存入数据多条数据(需要加入对象的唯一性判断)
//			(1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)、成绩(int score)
//			(2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
//			(3)利用四种方式遍历Map集合中的内容，格式：key::value	
		Map<Student,String> map=new HashMap<Student,String>();
		map.put(new Student("Tom",22,85), "北京");
		map.put(new Student("Bill",25,96), "上海");
		map.put(new Student("Kemi",23,91), "成都");
		map.put(new Student("Tom",22,85), "南京");
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
//		1.定义一个map集合,key为String类型的姓名,value为String类型地址,
//		存入数据多条数据(假设不存在重名的情况),并用多种方式遍历
		Map<String,String> map=new HashMap<String,String>();
		map.put("Bill", "北京");
		map.put("Tom", "上海");
		map.put("Bob", "广州");
		map.put("Kemi", "南京");
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
		//定义Student类包含姓名：String name、年龄：int age、成绩：int score，生成空参、有参构造、set和get方法、toString方法
		//1.创建10个学生对象(其中有两个学员信息完全相同)存入集合中
		//2.去除重复的学员并遍历打印剩余学员信息(分别利用普通for循环、增强for循环、迭代器遍历)
		//3.打印最高分的学员信息
		//4.打印平均分
		//5.打印不及格的学员信息及数量
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
		//增强for循环遍历
		//for(Student s:set) {
		//	System.out.println(s);
		//}
		//迭代器遍历
		Iterator<Student> it=set.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			sunscore+=s.getScore();
			if(s.getScore()>maxscore) maxscore=s.getScore();
			if(s.getScore()<60) bjnum+=1;
			System.out.println(s);
		}
		System.out.println("最高成绩："+maxscore);
		System.out.println("平均分："+sunscore/set.size());
		System.out.println("不及格学员个数："+bjnum);
	}

	private static void method3() {
		//1.产生10个1-20之间的随机数要求随机数不能重复
		//2.产生10个长度为10的不能重复的字符串(里面只能出现大写字母、小写字母、0-9的数字)，并遍历打印输出
		Random r=new Random();
		Set<Integer> set=new HashSet<Integer>();
		while(set.size()<10) {
			int s=r.nextInt(20)+1;
			set.add(s);
		}
		System.out.println(set);
	}

	private static void method2() {
		//键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
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
		 * 1.定义一个长度为10的int数组,并存入10个int类型的数据,其中有一些数据是重复的
		 * 2.利用集合的知识对数组进行去重,产生新数组,不能改变数组中原来数字的大小顺序
		 * 3.打印新数组中的内容
		*/
		int[] arr={1,2,2,8,4,6,9,5,3,5};
		List<Integer> list=new ArrayList<Integer>();
		//保证顺序不变所有使用List集合
		for(int i=0;i<arr.length;i++) {
			if(!list.contains(arr[i])) {//不包含就存入
				list.add(arr[i]);
			}
		}
		System.out.println(list);
	}
	public static void shoopDrink(float m, String s,VendingMachine vm) {
		//传入钞票和饮料名称后，需要判断传入的钞票是否为真、面值是否足够购买此类饮料；
		//若不符合购买条件给出错误提示，结束购买流程；
		//若购买成功后需打印出找零金额和目前机内现金总额；
		Money money=new Money();
		money.setMz(m);
		money.setZj(true);
		
		if(vm.getYlb().get(s)!=null && money.isZj() && m>=vm.getYlb().get(s)) {
			//钞票为真、饮料存在
			float zling=m-vm.getYlb().get(s);
			float sjing=vm.getJe()+vm.getYlb().get(s);
			System.out.println("购买成功！找零："+zling);
			System.out.println("目前机内现金总额"+sjing);
			vm.setJe(sjing);
		}else {
			System.out.println("购买不成功，钞票为假/钞票不够");
		}
	}
}

class VendingMachine{
	private String name;//售货机名字
	private HashMap<String, Float> ylb;//售货机饮料列表
	private float je;//售货机剩余金额
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
