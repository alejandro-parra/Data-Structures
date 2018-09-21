//A012229618 Alejandro Parra
//Estructura de Datos
//11 de Agosto de 2018
public class Fibonacci {
	public static long fibonacci(int x) {
		if(x==0 || x==1) {
			return 1;
		}
		else if(x>1) {
			return fibonacci(x-1)+fibonacci(x-2);
		}
		else{
			throw new IllegalArgumentException("No puedes ingresar variables negativas");
		}
	}
	
	
	
	
	public static long fibonacciDin(int n, long[] tabla) {
		
		if (tabla[n]==0){
			return tabla[n]=fibonacciDin(n-1, tabla)+fibonacciDin(n-2, tabla);
		}
		return tabla[n];
	}
	
	public static long fibonacci2(int n) {
		long[] tabla= new long[n+1];
		tabla[0]=tabla[1]=1L;
		return fibonacciDin(n, tabla);
	}
	
	public static void main (String[]args) {
		System.out.println(fibonacci(3));
	}
}
