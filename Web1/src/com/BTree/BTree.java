package com.BTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BTree {

	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Node root;
	
	public void deleteNode(int key){
		root = deleteRec(root, key);
	}
	
	public Node deleteRec(Node root, int key){
		if(root == null){
			return null;
		}
		else if(key < root.key){
			root.leftChild = deleteRec(root.leftChild, key);
		}
		else if(key > root.key){
			root.rightChild = deleteRec(root.rightChild, key);
		}
		else{
			if(root.leftChild == null){
				return root.rightChild;
			}
			else if(root.rightChild == null){
				return root.leftChild;
			}
			else{
				root.key = minValue(root.leftChild);
				root.rightChild = deleteRec(root.rightChild, root.key);
			}
		}
		return root;
	}
	
	public int minValue(Node root){
		int min = root.leftChild.key;
		while(root.leftChild != null){
			min = root.leftChild.key;
			root = root.leftChild;
		}
		return min;
	}
	
	public void addNode(int key, String data){
		Node newNode = new Node(key, data);
		if(root == null){
			root = newNode;
		}
		else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				if(key < focusNode.key){
					focusNode = focusNode.leftChild;
					if(focusNode ==  null){
						parent.leftChild = newNode;
						return;
					}
				}
				else if(key > focusNode.key){
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public Node getNode(int key){
		Node focusNode = root;
		if(root != null){
			while(key != focusNode.key){
				if(key < focusNode.key){
					focusNode = focusNode.leftChild;
				}
				else if(key > focusNode.key){
					focusNode = focusNode.rightChild;
				}
				if(focusNode == null){
					return null;
				}
			}
		}
		return focusNode;
	}
	
	public void inOrder(Node newNode){
		if(newNode != null){
			inOrder(newNode.leftChild);
			System.out.println(newNode);
			inOrder(newNode.rightChild);
		}
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BTree tree = new BTree();
		tree.addNode(10, "CEO");
		tree.addNode(20, "Director");
		tree.addNode(30, "VP");
		tree.addNode(40, "Emp");
		
		System.out.println("Enter key: ");
		int key = Integer.parseInt(br.readLine());
		Node node = tree.getNode(key);
		if(node == null){
			System.out.println("Invalid key");
		}
		else{
			System.out.println(node.toString());
		}
	}

}
