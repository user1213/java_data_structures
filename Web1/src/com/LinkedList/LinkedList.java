package com.LinkedList;

public class LinkedList {

	private Node head;
	private int count = 0;
	
	public void increment(){
		this.count++;
	}
	
	public void decrement(){
		this.count--;
	}
	
	public int getSize(){
		return this.count;
	}
	
	public int Count(){
		return this.getSize();
	}
	
	public void addNode(Object data){
		Node current = head;
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		else{
			while(current.getNext() != null){
				current = current.getNext();
			}
			current.setNext(newNode);
			increment();
		}
	}
	
	public void addNode(Object data, int index){
		Node newNode = new Node(data);
		Node current = head;
		if(head != null){
			for(int i = 0; i<index && current.getNext() != null; i++){
				current = current.getNext();
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);
			increment();
		}
	}
	
	public Object getData(int index){
		if(index < 0){
			return null;
		}
		Node current = head;
		if(head != null){
			current = head.getNext();
			for(int i = 0; i<index; i++){
				current = current.getNext();
				if(current == null){
					return null;
				}
			}
			return current.getData();
		}
		return current;
	}
	
	public boolean remove(int index){
		if(index < 0 || index > getSize()){
			return false;
		}
		Node current = head;
		if(head != null){
			for(int i = 0; i<index; i++){
				current = current.getNext();
				if(current == null){
					return false;
				}
			}
			current.setNext(current.getNext().getNext());
			decrement();
			return true;
		}
		return false;
	}
	
	public String toString(){
		String output = "";
		Node current = head;
		if(head != null){
			current = current.getNext();
			while(current.getNext() != null){
				output += "[" + current.getData() + "]";
				current = current.getNext();
			}
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
