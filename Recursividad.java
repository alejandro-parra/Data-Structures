//Alejandro Parra Altamirano
//A01229618
//Estructura de datos
//15 de agosto de 2018
//Comentarios:
public class Recursividad {
	public static int sumatoria(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n + sumatoria(n-1);
		}
	}
	
	public static String base10a2(int n) {
		if(n==1) {
			return "1";
		}
		else {
			if(n%2==0) {
				return base10a2(n/2) + "0";
			}
			else {
				return base10a2((n-1)/2) + "1";
			}
			
		}
	}
}
