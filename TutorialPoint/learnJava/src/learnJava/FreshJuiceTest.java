package learnJava;

//Enums restrict a variable to have one of only a few predefined values.
class FreshJuice {
	enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
	FreshJuiceSize size;
}
public class FreshJuiceTest {
	public static void main(String args[]){
	FreshJuice juice = new FreshJuice();
	juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
	System.out.println("Size: " + juice.size);
	}
}
