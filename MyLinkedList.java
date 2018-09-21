import java.util.NoSuchElementException;
//Alejandro Parra 
//A01229618
//Estructura de Datos
//Comentarios:
public class MyLinkedList<E> {
	private Node<E> head,tail;
	
	private int size;
	
	public MyLinkedList() {
		this.head=this.tail=null;
		this.size=0;
	}
	
	public MyLinkedList(E[] datos) {
		this.size=0;
		for(int i=0; i<datos.length-1;i++) {
			this.insertAtFirst(datos[datos.length-1-i]);
		}
	}
	
	public E first() throws NoSuchElementException{
		try {
			return this.head.getData();
		}catch(NullPointerException e){
			throw new NoSuchElementException("You cant access the first element if the list is empty");
		}
		
	}
	
	public E last() throws NoSuchElementException {
		try {
			return this.tail.getData();
		}catch(NullPointerException e){
			throw new NoSuchElementException("You cant access the last element if the list is empty");
		}
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size==0;
	}
	
	public void insertAtFirst(E data) {
		Node<E> nuevo= new Node<>(data,this.head);
		this.head=nuevo;
		this.size+=1;
		
		if(this.size==0) {
			this.tail=this.head;
		}
	}
	
	public void insertAtLast(E data) {
		
		if(this.size>0) {
			Node<E> nuevo= new Node<>(data);
			this.tail.setNext(nuevo);
			this.tail=nuevo;
			size++;
		}
		else {
			this.insertAtFirst(data);
		}
	}
	
	public E removeFirst() {
		try {
			E tmp= this.first();
			this.head=this.head.getNext();
			if(this.size==1) {
				this.tail=null;
			}
			size--;
			return tmp;
		}
		catch(NullPointerException e){
			throw new NoSuchElementException("Cant remove an element of an empty list");
		}
		
	}
	
	public E removeLast() throws NoSuchElementException {
		try {
			E tmp= this.last();
			Node<E> current = this.head;
			
			while(current.getNext() != this.tail) {
				current=current.getNext();
			}
			
			this.tail=current;
			this.tail.setNext(null);
			
			if(this.size==1) {
				this.head=null;
			}
			this.size--;
			
			return tmp;
		}
		catch(NullPointerException e){
			throw new NoSuchElementException("Cant remove an element of an empty list");
		}
	}
	
	public void insertAt(int pos, E data) throws IndexOutOfBoundsException {
		
		if(pos<0 || pos>=size) {
			throw new IndexOutOfBoundsException("The position cant be higher than the number of nodes in the list or it cant be negative");
		}
		else if(pos==0) {
			this.insertAtFirst(data);
		}else if(pos==this.size-1) {
			this.insertAtLast(data);
		}else {
			Node<E> current=this.head;
			int contador=0;
			while(contador!=pos-1) {
				current=current.getNext();
				contador++;
			}
			Node<E> next = current.getNext();
			
			Node<E> nuevo = new Node<>(data,next);
			
			current.setNext(nuevo);
			this.size++;
		}
	}
	
	public E removeAt(int pos) throws IndexOutOfBoundsException{
		if(pos<0 || pos>=size) {
			throw new IndexOutOfBoundsException("The position cant be higher than the number of nodes in the list or it cant be negative");
		}
		else if(pos==0) {
			return this.removeFirst();
		}
		else if(pos==this.size-1) {
			return this.removeLast();
		}
		else {
			Node<E> current=this.head;
			int contador=0;
			while(contador!=pos-1) {
				current=current.getNext();
				contador++;
			}
			
			Node<E> target = current.getNext();
			Node<E> next = target.getNext();
			current.setNext(next);
			System.gc();
			this.size--;
			return target.getData();
		}
		
	}
	
	public void setAt(int pos,E dato) throws IndexOutOfBoundsException{
		if(pos<0 || pos>=size) {
			throw new IndexOutOfBoundsException("The position cant be higher than the number of nodes in the list or it cant be negative");
		}
		else if(pos==0) {
			this.head.setData(dato);
		}
		else if(pos==this.size-1) {
			this.tail.setData(dato);
		}
		else {
			Node<E> current=this.head;
			int contador=0;
			while(contador!=pos) {
				current=current.getNext();
				contador++;
			}
			
			current.setData(dato);
		}
		
	}
	
	public E getAt(int pos) throws IndexOutOfBoundsException{
		if(pos<0 || pos>=size) {
			throw new IndexOutOfBoundsException("The position cant be higher than the number of nodes in the list or it cant be negative");
		}
		else if(pos==0) {
			return this.head.getData();
		}
		else if(pos==this.size-1) {
			return this.tail.getData();
		}
		else {
			Node<E> current=this.head;
			int contador=0;
			while(contador!=pos) {
				current=current.getNext();
				contador++;
			}
			
			return current.getData();
		}
		
	}
	
	

	
	public String toString() {
		String res="";
		Node<E> current=this.head;
		while(current!=null) {
			res+=current.getData()+",";
			current=current.getNext();
		}
		return res;
	}
	

	public static void main(String[] args) {
		
	}
	
}

class Node<E>{
	
	private E data;
	private Node<E> next;
	
	public Node(E data, Node<E> next) {
		this.data=data;
		this.next=next;
	}
	
	public Node(E data) {
		this(data,null);
	}
	
	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

}
