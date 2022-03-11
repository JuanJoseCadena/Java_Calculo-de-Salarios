import java.util.Scanner;

public class Main {
	
	static Scanner leer = new Scanner(System.in);
	static Scanner valor = new Scanner(System.in);
	
	static int empleados = 0;
	static int salario = 0;
	static int pago = 0;
	static int aux = 0;
	static int numempleado = 1;
	static int retencion = 0;
	static int seguro = 0;
	static int pension = 0;
	static int neto = 0;
	
	static String cadena = "";
	static String valorpago = "";
	
	public static void LeerValor(int num1) 
	{
		try {
			System.out.println("Introduzca el número de empleados");
			cadena = leer.nextLine();
			
			if (cadena.trim().equals("")) 
			{
				System.out.println("No se ha detectado ningun valor, por favor, vuelve a intentarlo utilizando números enteros, sin comas, espacios ni puntos");
				System.exit(0);
			}
			
			empleados = Integer.parseInt(cadena);
		}
		catch(Exception e)
		{
			System.out.println("Se ha detectado un valor inesperado, por favor, vuelve a intentarlo utilizando números enteros, sin comas, espacios, símbolos ni puntos");
			System.exit(0);
		}
			
		try {	
			System.out.println("Introduzca el valor que ganará el primer empleado");
			valorpago = valor.nextLine();
			
			if (valorpago.trim().equals("")) 
			{
				System.out.println("No se ha detectado ningun valor, por favor, vuelve a intentarlo utilizando números enteros, sin comas, espacios, símbolos ni puntos");
				System.exit(0);
			}
			
			pago = Integer.parseInt(valorpago);		

		}
		catch(Exception e)
		{
			System.out.println("Se ha detectado un valor inesperado, por favor, vuelve a intentarlo utilizando números enteros, sin comas, espacios ni puntos");
			System.exit(0);
		}
	}
		
	public static void Descuentos(int num2) 
	{
		retencion = (pago*14)/100;
		seguro = (pago*4)/100;
		pension = (pago*4)/100;
		int descuento = retencion + seguro + pension;
		neto = pago - descuento;
	}
	
	public static void Imprimir(int num3) 
	{
		System.out.println("Empleado: #" + numempleado);
		System.out.println("Salario: $" + salario);
		System.out.println("Valor de Retención: $" + retencion);
		System.out.println("Valor de Seguro Social: $" + seguro);
		System.out.println("Valor de Pensión: $" + pension);
		System.out.println("Valor Neto a Pagar: $" + neto);
		System.out.println("");
	}
	
	public static void CalculoPago(int num4)
	{
		aux = empleados;
			
		while(aux > 0) 
		{
			salario = pago;
			pago = pago + ((pago*10) /100);
			Descuentos(pago);
			Imprimir(pago);
			aux--;
			numempleado++;
		}
	}
	
	
	public static void main(String[] args) 
	{
		LeerValor(pago);
		CalculoPago(pago);
	}
}
