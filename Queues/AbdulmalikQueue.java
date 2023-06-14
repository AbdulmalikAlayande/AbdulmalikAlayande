package Chapter16.Queues;

import java.math.BigInteger;


public class AbdulmalikQueue<Any> implements AlayandeQueue<Any>{
	private static int DEFAULT_CAPACITY = BigInteger.valueOf(10).intValue();
	
	@SuppressWarnings("unchecked")
	Any[] objects = (Any[]) new Object[DEFAULT_CAPACITY];
	
	public AbdulmalikQueue(int capacity){
		if (capacity > DEFAULT_CAPACITY) DEFAULT_CAPACITY+=capacity;
	}
	public AbdulmalikQueue(){}
	@Override public void enque(Object o) {
		
	}
	
	@Override public void addAll(AlayandeQueue<Object> theQueue) {
	
	}
	
	@Override
	public void enque(Object o, int indx) {
	
	}
	
	@Override
	public void deque(Object o) {
	
	}
	
	@Override
	public void deque(Object o, int index) {
	
	}
	
	@Override
	public Object remove() {
		return null;
	}
	
	@Override
	public Object peek() {
		return null;
	}
	
	@Override
	public Object peek(Object o) {
		return null;
	}
	
	@Override
	public Object peek(Object o, int index) {
		return null;
	}
	
	@Override
	public int size() {
		return 0;
	}
}
