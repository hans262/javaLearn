package homework.p1;

public class Dog {
	private String color;
	private String breed;
	public Dog(){}
	public void eat() {
		System.out.println(this.color+"��"+this.breed+"���ڿй�ͷ.....");
	}
	public void lookHome() {
		System.out.println(this.color+"��"+this.breed+"���ڿ���.....");
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
