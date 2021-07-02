package introducao;

public class temperatura {

	public static void main(String[] args) {
		
		String nome= "Caroline";
		double celsius = 13.00;
		double fahrenheit = 0.00;
		double kelvin = 0.00;
       
         System.out.println(nome+ " a temperatura em ºC é :"+celsius);
         
		fahrenheit = (celsius*1.8)+32;
		System.out.printf("Então a temperatura em ºF é: %.2f \n",fahrenheit );
		kelvin = celsius+273.15;
		System.out.println("\nEntão a temperatura em ºK é: "+kelvin);
         

	}

}
