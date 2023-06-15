package Chapter16.customExceptions.linkedList;

import java.util.Collection;

public interface SinglyLinkedLists<Any> {
	
	Nodes<Any> insert(Nodes<Any> node);
	Nodes<Any> insertFirst(Nodes<Any> node);
	Nodes<Any> insertLast(Nodes<Any> node);
	Nodes<Any> insert(Nodes<Any> node, int index);
	void addAll(Collection<Any> collection);
	Nodes<Any> remove(Nodes<Any> node);
	Nodes<Any> removeFirst(Nodes<Any> node);
	Nodes<Any> removeLast(Nodes<Any> node);
	Nodes<Any> remove(Nodes<Any> node, int index);
	Any get(Nodes<Any> node);
	int size();
}