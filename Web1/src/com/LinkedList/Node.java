package com.LinkedList;

public class Node {

	Object data;
	Node nextNode;
	
	public Node(Object data){
		this.data = data;
		this.nextNode = null;
	}
	
	public Node(Object data, Node nextNode){
		this.data = data;
		this.nextNode = nextNode;
	}
	
	public Object getData(){
		return this.data;
	}
	
	public void setData(String data){
		this.data = data;
	}
	
	public Node getNext(){
		return this.nextNode;
	}
	
	public void setNext(Node nextNode){
		this.nextNode = nextNode;
	}
}
