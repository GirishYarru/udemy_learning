package com.test;

public class LL {
	Node head;
	
	LL(){
		this.head = null;
	}
	
	public void add(int info) {
		if(head == null) {
			head = new Node(info);
			return;
		}
		
		Node p = head;
		while(p.next!=null) {
			p = p.next;
		}
		p.next = new Node(info);
		
	}

}
