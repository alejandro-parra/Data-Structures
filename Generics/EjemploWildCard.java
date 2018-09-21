import java.util.ArrayList;

public class EjemploWildCard {

	
	public static double suma(ArrayList<Number> numeros) {
		double suma=0;
		for(int i=0;i<numeros.size();i++){
			suma+=numeros.get(i).doubleValue();
		}
		return suma;
	}
	
	public static void main(String[] args) {
		ArrayList<Number> numeros= new ArrayList<>();
		numeros.add(15);
		numeros.add(57);
		numeros.add(3.3);
		numeros.add(2.2);
		System.out.println(suma(numeros));
	}
}
