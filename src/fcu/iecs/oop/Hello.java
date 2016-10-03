package fcu.iecs.oop;

public class Hello {

	public static void main(String[] args) {
		String lyics = "Let it go! Let it go! Cannot hold it back anymore";
		lyics = lyics.replace("it","\"her\"");
		lyics = lyics.replace("Cannot","can't");
		System.out.println(lyics);
	}

}
