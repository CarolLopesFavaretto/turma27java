package introducao;

public class temperatura {

	public static void main(String[] args) {
		
		String nome= "Caroline";
		double celsius = 13.00;
		double fahrenheit = 0.00;
		double kelvin = 0.00;
       
         System.out.println(nome+ " a temperatura em �C � :"+celsius);
         
		fahrenheit = (celsius*1.8)+32;
		System.out.printf("Ent�o a temperatura em �F �: %.2f \n",fahrenheit );
		kelvin = celsius+273.15;
		System.out.println("\nEnt�o a temperatura em �K �: "+kelvin);
         

	}

}
