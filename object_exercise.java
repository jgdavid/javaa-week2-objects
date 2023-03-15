package java_week2_objects;

public class object_exercise {
	public static void main(String[] args) {

		Person p1 = new Person("Tom", 26, "Mouse");
//		p1.name = "Tom";
//		p1.age = 26;
//		p1.job = "Mouse";

		Person p2 = new Person("Jerry", 34, "Cat");

		Person p3 = new Person("Ben", 68, "Flower pot guy");

		System.out.println("My name is " + p1.name + " I am " + p1.age + " I am a ");
		System.out.println(p2.introduce());
	}
}
