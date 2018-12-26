package com.BTree;

public class Node {
	
	int key;
	String data;
	Node leftChild;
	Node rightChild;
	
	public Node(int key, String data){
		this.key = key;
		this.data = data;
	}
	
	public String toString(){
		return this.key + " has data " + this .data;
	}
}
