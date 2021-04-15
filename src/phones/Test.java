package phones;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone iphone = new Iphone("iphone 11", 50, "AT&T", "iphone classic ringtone");
		Galaxy note = new Galaxy("Pro", 75, "T-Mobile", "Samsung Galaxy harp");
		
		iphone.displayInfo();
		System.out.println(iphone.ring());
		System.out.println(iphone.unlock());
		System.out.println("========================");
		note.displayInfo();
		System.out.println(note.ring());
		System.out.println(note.unlock());
	}

}
