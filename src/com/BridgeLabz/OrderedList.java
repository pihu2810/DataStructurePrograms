package com.BridgeLabz;

public class OrderedList<T extends Comparable<T>>
{
	Node<T> head;
	Node<T> tail;
	int size = 0;
	public void add(T data) {

		Node<T> n = head;
		Node<T> temp = new Node<>(data);
		size++;
		if (head == null) {
			
			head = temp;
			head.setNext(tail);
			tail = head;
		} else if (data.compareTo((T) head.getData()) < 0) {
			temp.setNext(head);
			head = temp;
		} else {
			if (data.compareTo((T) tail.getData()) > 0) {
				tail.setNext(temp);
				tail = temp;
				return;
			}
			Node<T> prev = null;
			while (data.compareTo((T) n.getData()) > 0 && n.getNext() != null) {
				prev = n;
				n = n.getNext();
			}
			prev.setNext(temp);
			temp.setNext(n);
		}
	}
	public void remove(T item) {
		Node<T> n = head;
		Node<T> prev = null;
		if (head.getData().equals(item)) {
			head = head.getNext();
			size -= 1;
			return;
		}
		while (!n.getData().equals(item)) {
			prev = n;
			n = n.getNext();
		}
		n = n.getNext();
		prev.setNext(n);
		n = null;
		size -= 1;
	}
	public boolean search(T item) {
		Node<T> n = head;
		while (n.getNext() != null) {
			if (n.getData().equals(item)) {
				System.out.println("The string is present: " + n.getData());
				return true;
			}
			n = n.getNext();
		}
		System.out.println("The string is not present");
		return false;
	}
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public int size() {
		System.out.println("The Size of the List: " + size);
		return size;
	}
	public int index(T item) {
		int index = 0;
		Node<T> n = head;
		while (!n.getData().equals(item)) {
			n = n.getNext();
			index++;
			}
		System.out.println("The index number of " + item + " is " + index);
		return index;

	}

	public T pop() {
		if(head==null) {
			 System.out.println("Empty");
		 }else if(size==1) {
			 head=null;
			 size--;
			}else {
				Node<T> t;
				t=head;
				for(int i=1; i<size-1 ;i++) 
					t=t.getNext();
					t.setNext(null);
					size--;
			}
		return null;
		}
	public T pop(int pos) {
		int index = 0;
		Node<T> n = head;
		if (pos == 0) {
			head = head.getNext();
			size--;
			return (T) n.getData();
		}
		Node<T> prev = null;
		while (index != pos) {
			prev = n;
			n = n.getNext();
			index++;
		}
		 prev.setNext(n.getNext());
		size -= 1;
		return (T) n.getData();
	}
	public  void printList() {
		 Node<T> curr=head;
		 while(curr !=null) {
			 System.out.print(curr.getData()+"--->");
			 curr=curr.getNext();
		 }
		 System.out.println();
	}

}
