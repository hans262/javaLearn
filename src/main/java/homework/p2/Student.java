package homework.p2;

public class Student {
	private String name;
	private String age;
	private int score;
	
	public Student(String name, String age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public Student() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
