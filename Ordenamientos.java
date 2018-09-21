//Alejandro Parra 
//A01229618
//Estructura de Datos
//Comentarios:

public class Ordenamientos {
	
	public static <E extends Comparable<E>> void swap(E[] elementos, int i, int j) {
		E tmp = elementos[i];
		elementos[i]=elementos[j];
		elementos[j]=tmp;
	}
	
	public static <E> void imprimeArreglo (E[] elementos) {
		for (E var:elementos) {
			System.out.print(var+",");
		}
		System.out.println();
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	public static <E extends Comparable<E>> void bubbleSort(E[] elementos) {
		boolean cambio;
		for(int j=0;j<elementos.length-1;j++) {
			cambio=false;
			for(int i=0;i<elementos.length-1-j;i++) {
				if(elementos[i].compareTo(elementos[i+1])>0) {
					swap(elementos, i, i+1);
					cambio=true;
				}
			}
			if(!cambio) {
				break;
			}
		}
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	
	public static <E extends Comparable<E>> void mergeSort(E[] elementos) {
		mergeSort(elementos,0,elementos.length-1);
	}
	
	public static<E extends Comparable<E>> void mergeSort(E[] elementos, int primero, int ultimo) {
		if(primero<ultimo) {
			int central=(primero+ultimo)/2;
			mergeSort(elementos,primero,central);
			mergeSort(elementos,central+1,ultimo);
			mezcla(elementos,primero,ultimo);
		}
	}
	
	public static <E extends Comparable<E>> void mezcla(E[] elementos, int primero, int ultimo) {
		int min=primero;
		int breakpoint;
		int medio = breakpoint = (primero+ultimo)/2+1;
		
		E[] tmp = (E[])new Comparable[(ultimo-primero)+1];
		
		for(int i=0;i<tmp.length;i++) {
			if(primero<breakpoint && medio<=ultimo) {
				if (elementos[primero].compareTo(elementos[medio])<0) {
					tmp[i]=elementos[primero];
					primero++;
				}
				else {
					tmp[i]=elementos[medio];
					medio++;	
				}
			}
			else if(primero<breakpoint) {
				tmp[i]=elementos[primero];
				primero++;
			}
			else {
				tmp[i]=elementos[medio];
				medio++;	
			}
			
		}
		System.arraycopy(tmp, 0, elementos, min, tmp.length);
		
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	
	public static <E extends Comparable<E>>void quickSort(E[] elementos) {
		quickSort(elementos,0,elementos.length-1);
	}
	
	private static <E extends Comparable<E>>void quickSort(E[] elementos, int left, int right) {
		if(left<right) {
			int p = particionar(elementos,left,right);
			quickSort(elementos,left,p-1);
			quickSort(elementos,p+1,right);
			
		}
	}
	
	private static <E extends Comparable<E>> int particionar(E[] elementos, int left, int right) {
		E p= elementos[left];
		int i= left+1;
		for(int j=left;j<=right;j++) {
			if(elementos[j].compareTo(p)<0) {
				swap(elementos,i,j);
				i++;
			}
		}
		swap(elementos,left,i-1);
		return i-1;
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	public static <E> void insertionSort(E[] elementos) {
		insertionSort(elementos,1)
	}
	
	
	
	
	
	
	
	
	
	
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public static void main(String[] args) {
		String[] palabras = "HOLA COMO ESTAS MUY BIEN GRACIAS BAI".split(" ");
		imprimeArreglo(palabras);
		bubbleSort(palabras);
		imprimeArreglo(palabras);
		bubbleSort(palabras);
		imprimeArreglo(palabras);
		
		Integer[] arreglo = {43,234,24,22,3,21,42,232,12};
		quickSort(arreglo);
		imprimeArreglo(arreglo);
		
	}
	
	
}
