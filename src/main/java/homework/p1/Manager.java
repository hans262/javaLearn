package homework.p1;
/*1.项目经理类Manager 
属性：
	姓名name
	工号id
	工资salary
	奖金bonus
行为：
	工作work()
2.程序员类Coder
属性：
	姓名name
	工号id
	工资salary
行为：
	工作work()
要求:
1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，setter和getter方法
2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
3.调用成员方法,打印格式如下:
	工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
	工号为135基本工资为10000的程序员正在努力的写着代码......*/
public class Manager {
	private String name;
	private int id;
	private int salary;
	private int bonus;
	
	public Manager() {}
	public void work() {
		System.out.println("工号为"+this.id+"基本工资为"+this.salary+"奖金为"+this.bonus+"的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return this.salary;
	}
	public void setbonus(int bonus) {
		this.bonus=bonus;
	}
	public int getBonus() {
		return this.bonus;
	}
}
