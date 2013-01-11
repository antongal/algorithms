package com.freenity.algorithmdesignmanual.chapter3.exercise2;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

	public class LinkedListForwardIterator<T> implements Iterator<T> {

		private LinkedList<T> list;
		private Node<T> currentNode;
		private int currentIndex;

		private LinkedListForwardIterator(LinkedList<T> list, Node<T> start) {
			this.list = list;
			this.currentNode = start;
			this.currentIndex = 0;
		}

		@Override
		public boolean hasNext() {
			return currentNode != null;
		}

		@Override
		public T next() {
			Node<T> next = currentNode;
			currentNode = currentNode.getNext();
			currentIndex++;
			return next.getData();
		}

		@Override
		public void remove() {
			currentNode = currentNode.getNext();
			list.remove(currentIndex);
		}

	}

	private class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setData(T data) {
			this.data = data;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}

	private int size;
	private Node<T> first;
	private Node<T> last;

	public LinkedList() {
		size = 0;
		first = null;
		last = null;
	}

	public void add(T data) {
		Node<T> node = new Node<T>(data, null);
		if (first == null) {
			first = node;
			last = node;
		} else {
			last.setNext(node);
			last = node;
		}

		size++;
	}

	private Node<T> findNode(int index) {
		Node<T> it = first;
		for (int i = 0; i < index; i++) {
			if (it.getNext() == null) {
				throw new IndexOutOfBoundsException();
			}
			it = it.getNext();
		}
		return it;
	}

	public T get(int index) {
		return findNode(index).getData();
	}

	private Node<T> internalReverse(Node<T> a, Node<T> b) {
		Node<T> last = a;
		if (b != null) {
			last = internalReverse(b, b.getNext());
			b.setNext(a);
		}

		return last;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListForwardIterator<T>(this, first);
	}

	public T remove(int index) {
		T data;

		if (index == 0) {
			data = first.getData();
			first = first.getNext();
		} else {
			Node<T> prev = findNode(index - 1);
			if (prev.getNext() == null) {
				throw new IndexOutOfBoundsException();
			}
			data = prev.getNext().getData();
			prev.setNext(prev.getNext().getNext());
		}

		size--;

		return data;
	}

	public void reverse() {
		last = first;
		first = internalReverse(null, first);
	}

	public void reverseIterative() {
		Node<T> a = first;
		Node<T> prev = null;
		while (a != null) {
			Node<T> next = a.getNext();
			a.setNext(prev);
			prev = a;
			a = next;
		}
		Node<T> temp = last;
		last = first;
		first = temp;
	}

	public int size() {
		return size;
	}

}
