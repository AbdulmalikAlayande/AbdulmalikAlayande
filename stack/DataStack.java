package Chapter16.stack;

import Chapter16.List.ArrayLists;
import Chapter16.List.Lists;

public class DataStack<E> implements Stacks<E>{
	
	private final Lists<E> elements = new ArrayLists<>();
	
	@Override
	public boolean empty() {
		return false;
	}
	
	@Override
	public E push(E object) {
		elements.add(object);
		return object;
	}
	
	@Override
	public Object pop() {
		System.out.println("size before: "+elements.size());
		Object lastElementInTheArray = elements.get(elements.size() - 1);
		elements.add(null, elements.size()-1);
		elements.removeExtraSpaceFromArray();
		return lastElementInTheArray;
	}
	
	@Override
	public Object peek() {
		Object elementInTheLastIndex = null;
		for (int i = 0; i < elements.size(); i++) {
			if(i == elements.size() - i)
				elementInTheLastIndex = elements.get(i);
		}
		return elementInTheLastIndex;
	}
	
	@Override
	public int size() {
		return elements.size();
	}
	
	@Override
	public int top() {
		int top = -1;
		if (elements.isEmpty()) return top;
		for (int i = 0; i < elements.size(); i++) if (elements.get(i) != null) top++;
		return top;
	}
	
	@Override
	public int search(Object o) {
		return 0;
	}
}
