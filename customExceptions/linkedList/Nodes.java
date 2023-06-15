package Chapter16.customExceptions.linkedList;

public class Nodes<Any> {
	
	Nodes<Any> next;
	Any data;
	
	public Nodes<Any> getNext() {
		return next;
	}
	
	public void setNext(Nodes<Any> next) {
		this.next = next;
	}
	
	public Any getData() {
		return data;
	}
	
	public void setData(Any data) {
		this.data = data;
	}
}
