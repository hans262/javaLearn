package homework.p1;
/*1.��Ŀ������Manager 
���ԣ�
	����name
	����id
	����salary
	����bonus
��Ϊ��
	����work()
2.����Ա��Coder
���ԣ�
	����name
	����id
	����salary
��Ϊ��
	����work()
Ҫ��:
1.��������Ҫ����Manager���Coder��,����Ҫ˽��,���ɿղΡ��вι��죬setter��getter����
2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(��ʾ���ַ���:setter�����͹��췽��)
3.���ó�Ա����,��ӡ��ʽ����:
	����Ϊ123��������Ϊ15000����Ϊ6000����Ŀ��������Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....
	����Ϊ135��������Ϊ10000�ĳ���Ա����Ŭ����д�Ŵ���......*/
public class Manager {
	private String name;
	private int id;
	private int salary;
	private int bonus;
	
	public Manager() {}
	public void work() {
		System.out.println("����Ϊ"+this.id+"��������Ϊ"+this.salary+"����Ϊ"+this.bonus+"����Ŀ��������Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....");
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
