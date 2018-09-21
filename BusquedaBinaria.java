//Alejandro Parra Altamirano
//A01229618
//Estructura de Datos
//Comentarios: 
public class BusquedaBinaria {
	
	public static <E extends Comparable<E>>int binarySearchRec(E[] valores,E valor){
		
		return binarySearchRec(valores, valor, 0, valores.length-1);
	}
	
	private static <E extends Comparable<E>> int binarySearchRec(E[] valores,E valor,int min,int max) {
		int avg = (min+max)/2;
		
		if(min>max) {
    	   		return -1;
		}
		else if(valores[avg].equals(valor)) {
			return avg;
		}
		else if(valores[avg].compareTo(valor)>0) {
    	   		return binarySearchRec(valores, valor, min, avg-1);
		}
		else {
			return binarySearchRec(valores, valor, avg+1, max);
		}

	}

}
