import java.util.Scanner;

public class Salarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double basepay = 0.0;
		double hours = 0.0;
		double payment = 0.0;
	
	
		Scanner fernanda = new Scanner (System.in);
		
		System.out.println("Ingresa salario base");
		basepay = fernanda.nextDouble();
		System.out.println("Ingresa las horas trabajadas");
		hours = fernanda.nextDouble();
		
		if (hours>60 || basepay<8){
			System.out.println("Error");
		}
		else{
			if(hours>40){
			payment = (40*basepay)+(hours-40)*1.5;
			System.out.println("Tu paga es:" + payment);
			}
			else{
				payment = basepay*hours;
				System.out.println("Tu paga es:"+payment);
			}
		}
		
		
	}

}
