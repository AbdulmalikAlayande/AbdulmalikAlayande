package Chapter16.Queues;

public interface AQueue<Any> {
	void enque(Object o);
	void addAll(AQueue<Any> theQueue);
	void deque(Object o);
	Object remove();
	Object peek();
	Object peekElementAtLastIndex();
	Object peek(Object o);
	int size();
	Integer getDefaultCapacity();
	Integer getAbsoluteCapacity();
}
