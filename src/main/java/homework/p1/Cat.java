package homework.p1;

public class Cat {
	private String color;
	private String breed;
	public Cat(){}
	public void eat() {
		System.out.println(this.color+"��"+this.breed+"���ڳ���.....");
	}
	public void catchMouse() {
		System.out.println(this.color+"��"+this.breed+"���ڴ�����....");
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public String getBreed() {
		return this.breed;
	}
}
