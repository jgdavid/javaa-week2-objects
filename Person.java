package java_week2_objects;

public class Person {
	String name;
	int age;
	String job;

	public Person(String name, int age, String job) {

		this.name = name;
		this.age = age;
		this.job = job;
	}

	public Person() {

	}

	public String introduce() {
		String intro = "hello my name is ";
		intro += this.name;
		intro = "I am  ";
		intro += this.age;
		intro = "and I am a  ";
		intro += this.job;

		return intro;
	}
}
