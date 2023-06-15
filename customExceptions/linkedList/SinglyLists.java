package Chapter16.customExceptions.linkedList;

import java.util.Collection;

public class SinglyLists<Any> implements SinglyLinkedLists<Any>{
	Nodes<Any> start = new Nodes<>();
	
	@Override
	public Nodes<Any> insert(Nodes<Any> node) {
		start.setNext(node);
		Nodes<Any> var = new Nodes<>();
		var.setNext(node);
		return null;
	}
	
	@Override
	public Nodes<Any> insertFirst(Nodes<Any> node) {
		return null;
	}
	
	@Override
	public Nodes<Any> insertLast(Nodes<Any> node) {
		return null;
	}
	
	@Override
	public Nodes<Any> insert(Nodes<Any> node, int index) {
		return null;
	}
	
	@Override
	public void addAll(Collection<Any> collection) {
	
	}
	
	@Override
	public Nodes<Any> remove(Nodes<Any> node) {
		return null;
	}
	
	@Override
	public Nodes<Any> removeFirst(Nodes<Any> node) {
		return null;
	}
	
	@Override
	public Nodes<Any> removeLast(Nodes<Any> node) {
		return null;
	}
	
	@Override
	public Nodes<Any> remove(Nodes<Any> node, int index) {
		return null;
	}
	
	@Override
	public Any get(Nodes<Any> node) {
		return null;
	}
	
	@Override
	public int size() {
		return 0;
	}
}
