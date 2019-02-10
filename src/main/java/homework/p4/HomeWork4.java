package homework.p4;
/*
1.定义动物类
属性：年龄，颜色
行为:eat(String something)
方法(无具体行为,不同动物吃的方式和东西不一样,something表示吃的东西)
生成空参有参构造，set和get方法
2.定义狗类继承动物类
行为:eat(String something)方法,看家lookHome方法(无参数)
3.定义猫类继承动物类
行为:eat(String something)方法,逮老鼠catchMouse方法(无参数)
4.定义Person类
属性：姓名，年龄
行为：keepPet(Dog dog,String something)方法
功能：喂养宠物狗，something表示喂养的东西
行为：keepPet(Cat cat,String something)方法
功能：喂养宠物猫，something表示喂养的东西
生成空参有参构造，set和get方法  
5.定义测试类(完成以下打印效果):
keepPet(Dog dog,String somethind)方法打印内容如下：
年龄为30岁的老王养了一只黑颜色的2岁的宠物
2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
keepPet(Cat cat,String somethind)方法打印内容如下：
年龄为25岁的老李养了一只灰颜色的3岁的宠物
3岁的灰颜色的猫眯着眼睛侧着头吃鱼
6.思考：		
1.Dog和Cat都是Animal的子类，以上案例中针对不同的动物，
定义了不同的keepPet方法，过于繁琐，能否简化，并体会简化后的好处？
2.Dog和Cat虽然都是Animal的子类，
但是都有其特有方法，能否想办法在keepPet中调用特有方法？
*/
public class HomeWork4 {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("老王");
		p.setAge(30);
		Dog d=new Dog();
		d.setAge(2);
		d.setColor("黑色");
		p.keepPet(d, "骨头");
		
		Person p2=new Person();
		p2.setName("老李");
		p2.setAge(25);
		Cat c=new Cat();
		c.setAge(3);
		c.setColor("灰色");
		p2.keepPet(c, "鱼");
	}
}
class Person{
	private String name;
	private int age;
	public void keepPet(Animal a,String food){
		if(a instanceof Dog){
			System.out.println("年龄为"+this.age+"岁的"+this.name+"养了一只"+a.getColor()+"的"+a.getAge()+"岁的宠物");
			System.out.println(a.getAge()+"岁的"+a.getColor()+"的狗两只前腿死死的抱住"+food+"猛吃");
			((Dog) a).lookHome();
		}else if(a instanceof Cat){
			System.out.println("年龄为"+this.age+"岁的"+this.name+"养了一只"+a.getColor()+"的"+a.getAge()+"岁的宠物");
			System.out.println(a.getAge()+"岁的"+a.getColor()+"的猫眯着眼睛侧着头吃"+food);
			((Cat) a).catchMouse();
		}
	}
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Cat extends Animal{
	@Override
	public void eat(String food) {
		System.out.println("猫正在吃"+food);
	}
	public void catchMouse(){
		System.out.println("猫正在抓老鼠");
	}
}
class Dog extends Animal{
	@Override
	public void eat(String food) {
		System.out.println("狗正在吃"+food);
	}
	public void lookHome(){
		System.out.println("狗正在看家");
	}
}
abstract class Animal{
	private int age;
	private String color;
	public abstract void eat(String food);
	public Animal() {
		super();
	}
	public Animal(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}