package learnJava;

public class Test {
	public void pupAge() {
		//age is a local variable, it's scope is limited to only this method.
		int age = 0;
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	}

	public static void main(String args[]) {
		Test test = new Test();
		test.pupAge();
	}
}
