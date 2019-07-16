import java.util.Scanner;

public class Temprature {
	
	//28*c = 82.4F  and  82F = 27.77777777777778c
	
	public double celToFar(double a){
		double res = (a * 1.8)+32;
		return res;
	}
	
	public double farToCel(double b) {
		double res1 = ((b-32)*5/9);
		return res1;
	}
	

	public static void main(String[] args) {
		Temprature temp=new Temprature();
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the value of celcius : ");
		double cel =a.nextDouble();
		System.out.println("Enter the value of Farenheit : ");
		double far = a.nextDouble();
		double farenheit = temp.celToFar(cel);
		System.out.println(farenheit);
		double celcius= temp.farToCel(far);
		System.out.println(celcius);
	}

}
