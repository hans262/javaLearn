package io.object_stream;

import java.io.Serializable;

public class Student implements Serializable{
	//Éú³ÉĞòÁĞºÅid
	private static final long serialVersionUID = 861678325493334554L;
	
	private String name;
	private int age;
	private String gender;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
