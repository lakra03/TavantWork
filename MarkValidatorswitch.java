import java.util.Scanner;

public class MarkValidatorswitch {

	public void markGrade(int mark) {
		int num = mark;
		switch(mark) {
		case 100: case 99: case 98: case 97: case 96:
		case 95: case 94: case 93: case 92: case 91:
			System.out.println("Grade A");
			break;
			
		case 90: case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82:
		case 81: case 80: case 79: case 78: case 77: case 76:
			System.out.println("Grade B");
			break;
			
		case 75: case 74: case 73: case 72: case 71: case 70: case 69: case 68: case 67:
		case 66: case 65: case 64: case 63: case 62: case 61:
			System.out.println("Grade C");
			break;
		
		case 60: case 59: case 58: case 57: case 56: case 55: case 54: case 53: case 52:
		case 51: case 50: case 49: case 48: case 47: case 46: case 45: case 44: case 43:
		case 42: case 41: case 40:
			System.out.println("Grade D");
			break;
			
		default: 
			System.out.println("NO matching Grades...");
			break;
			
		
		}
	}
	
	public static void main(String[] args) {
		MarkValidatorswitch c = new MarkValidatorswitch();
		Scanner a = new Scanner(System.in);
		int marks = a.nextInt();
		c.markGrade(marks);
	}

}
