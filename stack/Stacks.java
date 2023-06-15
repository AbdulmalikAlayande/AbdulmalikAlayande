package Chapter16.stack;

import java.util.Stack;

public interface Stacks<E>{
	boolean empty();
	E push(E object);
	E pop();
	E peek();
	int size();
	int top();
	int search(Object o);
}
