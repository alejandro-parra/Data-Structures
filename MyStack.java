import java.util.NoSuchElementException;

public class MyStack<E> {
	private LinkedList<E> list;
	
	public MyStack() {
		this.list = new LinkedList<>();
	}
	
	public void push(E data) {
	this.list.insertAtFirst(data);
	}
	
	public E top() throws NoSuchElementException {
		try {
			this.list.first();
		} catch(NoSuchElementException e) {
			throw new NoSuchElementException("You cant retrieve the top from an empty stack");
		}
	}
	
	public E pop() throws NoSuchElementException {
		try {
			return this.list.removeFirst();
		}catch(NoSuchElementException e) {
			throw new NoSuchElementException("You cant pop in an empty stack");
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
		MyStack<Integer> pila = new MyStack<>();
		for(int i=0;i<10;i++) {
			pila.push(i);
		}
		
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
	}
}
