
public class Main {

	public void imprimeArchivo(int[] x) {
		String lista="";
		for(int i=0;i<x.length;i++) {
			lista+=x+",";
		}
		
		System.out.println(x);
	}
	
	public void imprimeArchivo(String[] x) {
		String lista="";
		for(int i=0;i<x.length;i++) {
			lista+=x+",";
		}
		
		System.out.println(x);
	}
	
	public void imprimeArchivo(double[] x) {
		String lista="";
		for(int i=0;i<x.length;i++) {
			lista+=x+",";
		}
		
		System.out.println(x);
	}
	
	public static <E> void print(E[] x){
		String lista="";
		for(int i=0;i<x.length;i++) {
			lista+=x+",";
		}
		
		System.out.println(x);
	}
	
}
