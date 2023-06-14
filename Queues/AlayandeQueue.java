package Chapter16.Queues;

public interface AlayandeQueue<Any> {
	void enque(Object o);
	void addAll(AlayandeQueue<Object> theQueue);
	void enque(Object o, int indx);
	void deque(Object o);
	void deque(Object o, int index);
	Object remove();  //removes and returns the element at the first index
	Object peek(); //Queries and return the element at the begininng of the queue
	Object peek(Object o);
	Object peek(Object o, int index);
	int size();
}
