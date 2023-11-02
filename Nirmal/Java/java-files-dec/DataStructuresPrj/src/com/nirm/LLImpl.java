package com.nirm;

public class LLImpl {

	
	LLNode head;
	
	LLNode insertInBeg(int element, LLNode head) {
		
		LLNode tempNode = new LLNode(element);
		if (head == null) {
			head = tempNode;
		}
		else
		{
			tempNode.next = head;
			head = tempNode;
		}
		return head;
		
	}
	LLNode insertAtTheEnd(int element, LLNode head) {
		LLNode tempNode = new LLNode(element);
		LLNode currNode = head;
		if (currNode == null)
			head = tempNode;
		else
		{
			while(currNode.next !=null )
				currNode = currNode.next;
			currNode.next = tempNode;
			
		}
		return head;
	}
	
	void display(LLNode head) {
		LLNode currNode= head;
		
		while (currNode !=null) {
			System.out.println(currNode.data+ " ");
			currNode = currNode.next;
		}
	}
	
	int length(LLNode head) {
		LLNode currNode = head;
		int count = 0;
		if(head == null)
			return 0;
		else
		{
			while(currNode !=null)
			{
				currNode = currNode.next;
				count++;
			}
			return count;
		}
	}
	
}
