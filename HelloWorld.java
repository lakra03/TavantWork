import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world!");
		HelloWorld hello = new HelloWorld();
		String result = hello.getMessage();
		System.out.println(result);
	}
	
	public String getMessage() {
		Scanner a = new Scanner(System.in);
		String message= a.nextLine();
		return message;
	}
}

