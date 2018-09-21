import java.util.NoSuchElementException;

public class MyQueue<E> {
	private MyLinkedList<E> lista;
	
	public MyQueue() {
		this.lista= new MyLinkedList<>();
	}
	
	public void enqueue(E data) {
		this.lista.insertAtLast(data);
	}
	
	public E dequeue() throws NoSuchElementException {
		try {
			return this.lista.removeFirst();
		} catch(NoSuchElementException e){
			throw new NoSuchElementException("Its not possible to do a dequeue in an empty queue");
		}
		
	}
	
	public E peek() throws NoSuchElementException {
		try{
			return this.lista.first();
		}catch(NoSuchElementException e){
			throw new NoSuchElementException("You cant do a peek of an empty queue");
		}
	}
	
	public int size() {
		return this.lista.size();
	}
	
	public boolean isEmpty() {
		return this.lista.isEmpty();
	}
	
	public void flush() {
		this.lista= new MyLinkedList<>();
		System.gc();
	}
	
	public String toString() {
		return this.lista.toString();
	}
	public static void main(String[] args) {
		MyQueue<String> palabras = new MyQueue<>();
		palabras.enqueue("Guido");
		palabras.enqueue("pene");
		palabras.enqueue("Diego");
		palabras.enqueue("parra");
		palabras.enqueue("oscar");
		palabras.enqueue("edgar");
		
		while(!palabras.isEmpty()) {
			System.out.println(palabras.dequeue());
		}
		
	}
}
