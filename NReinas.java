
public class NReinas {
	private int[] reinas;
	
	public NReinas(int n) {
		this.reinas= new int[n];
		for(int i=0;i<this.reinas.length;i++) {
			this.reinas[i]=-1;
		
		}
	}
	
	private boolean valida(int fila, int columna) {
		for(int i=0;i<fila;i++) {
			if(this.reinas[i]==columna) {
				return false;
			}
			
			if(Math.abs(fila-1)==Math.abs(columna-reinas[i])) {
				return false;
			}
		}
		
		return true;
	}
	
	private void imprimeSolucion() {
		for(int pos:this.reinas) {
			System.out.println(pos+",");
		}
	}
	
	private void busca(int fila) {
		for(int i=0;i<this.reinas.length;i++) {
			if(valida(fila,i)) {
				this.reinas[fila]=i;
				if(fila<this.reinas.length-1) {
					//se hace la recursion
					busca(fila+1);
				}
				else {
					imprimeSolucion();
				}
			}
		}
	}
	
	public void busca() {
		busca(0);
	}
	
	public static void main(String[] args) {
		NReinas tablero= new NReinas(4);
		tablero.busca();
	}
}
