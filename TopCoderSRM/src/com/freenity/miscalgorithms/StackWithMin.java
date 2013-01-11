package com.freenity.miscalgorithms;

import java.util.LinkedList;
import java.util.Stack;

/**
 * A stack implementation which knows the minimum element in O(1) time.
 * 
 * @author anton
 * 
 * @param <T>
 */
public class StackWithMin<T extends Comparable<T>> {

	private LinkedList<T> container;
	private Stack<T> minElements;

	public StackWithMin() {
		container = new LinkedList<T>();
		minElements = new Stack<T>();
	}

	public void push(T data) {
		container.addFirst(data);
		if (minElements.empty() || data.compareTo(minElements.peek()) <= 0) {
			minElements.push(data);
		}
	}

	public T peek() {
		return container.getFirst();
	}

	public T pop() {
		T element = container.removeFirst();
		if (element.compareTo(minElements.peek()) == 0) {
			minElements.pop();
		}
		return element;
	}

	public boolean isEmpty() {
		return container.size() == 0;
	}

	public T min() {
		return minElements.peek();
	}
}
