import java.util.Scanner;

public class MarkValidator {
	
	public boolean isPass(int marks) {
		int num = marks;
		if(num >= 40) {
			System.out.println("Pass");
			return true;
		}else {
			System.out.println("Fail");
			return false;
		}
	}
	
	public void markGrade(int marks) {
		int num1 = marks;
		if(num1>90) {
			System.out.println("Grade A");
		}else if(num1>75){
			System.out.println("Grade B");
		}else if(num1>60) {
			System.out.println("Grade C");
		}else {
			System.out.println("Grade D");
		}
		
	} 

	public static void main(String[] args) {
		MarkValidator markvalidator = new MarkValidator();
		System.out.print("Enter the marks : ");
		Scanner a = new Scanner(System.in);
		int mark = a.nextInt();
		if(markvalidator.isPass(mark)!=false) {
			markvalidator.markGrade(mark);
		}
	}

}
