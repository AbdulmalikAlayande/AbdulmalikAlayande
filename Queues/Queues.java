package Chapter16.Queues;

import java.math.BigInteger;


public class Queues<Any> implements AQueue<Any> {
	
	int elementCount;
	private static int DEFAULT_CAPACITY = BigInteger.valueOf(10).intValue();
	private static int ABSOLUTE_CAPACITY;
	@SuppressWarnings("unchecked")
	Any[] objects = (Any[]) new Object[DEFAULT_CAPACITY];
	
	@SuppressWarnings("unchecked")
	public Queues(int capacity){
		if (capacity > DEFAULT_CAPACITY) {
			ABSOLUTE_CAPACITY = DEFAULT_CAPACITY += capacity;
			objects = (Any[]) new Object[ABSOLUTE_CAPACITY];
		}
	}
	public Queues(){}
	@Override public void enque(Object o) {
		if (elementCount == this.objects.length) {
			growCapacity();
			addElementsToQueue(o);
		}
		else addElementsToQueue(o);
	}
	
	@SuppressWarnings("unchecked")
	private void growCapacity() {
		ABSOLUTE_CAPACITY = this.objects.length + 10;
		Any[] newObjects = (Any[]) new Object[ABSOLUTE_CAPACITY];
		System.arraycopy(objects, 0, newObjects, 0, objects.length);
		objects = newObjects;
	}
	
	@SuppressWarnings("unchecked")
	private void addElementsToQueue(Object o) {
		this.moveIfSpaceIsFilled();
		if(o != null){
			if (elementCount == 0) {
				objects[elementCount] = (Any) o;
				elementCount++;
			} else for (int i = objects.length - 1; i >= 0; i--) {
				if (objects[i] != null) {
					objects[i + 1] = (Any) o;
					elementCount++;
					break;
				}
			}
		}
	}
	
	@Override public void addAll(AQueue<Any> theQueue) {
	
	}
	
	@Override
	public void deque(Object o) {
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] == o) {
				objects[i] = null;
				elementCount--;
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	private void moveIfSpaceIsFilled() {
		Any[] newObjectCollection = (Any[]) new Object[objects.length];
		for (int i = 0, count = 0; i < objects.length; i++) {
			if (objects[i] != null) {
				newObjectCollection[count] = objects[i];
				count++;
			}
		}
		objects = newObjectCollection;
	}
	
	@Override
	public Any remove() {
		Any objectToBeReturned = null;
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] != null) {
				objectToBeReturned = objects[i];
				objects[i] = null;
				elementCount--;
				break;
			}
		}
		return objectToBeReturned;
	}
	
	@Override
	public Object peekElementAtLastIndex() {
		Any objectAtLastPositionInTheQueue = null;
		for (int i = objects.length - 1; i >= 0; i--) {
			if (objects[i] != null) {
				objectAtLastPositionInTheQueue = objects[i];
				break;
			}
		}
		return objectAtLastPositionInTheQueue;
	}
	
	@Override
	public Any peek() {
		Any obj = null;
		for (Any object : objects) {
			if (object != null) {
				obj = object;
				break;
			}
		}
		return obj;
	}
	
	@Override
	public Any peek(Object o) {
		return null;
	}
	
	@Override
	public int size() {
		return elementCount;
	}
	
	@Override
	public Integer getDefaultCapacity() {
		return DEFAULT_CAPACITY;
	}
	
	@Override
	public Integer getAbsoluteCapacity() {
		if (this != null) {
			return ABSOLUTE_CAPACITY;
		}
		return null;
	}
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (Any object : objects) {
			builder.append(object);
		}
		builder.append("]");
		return builder.toString();
	}
}
