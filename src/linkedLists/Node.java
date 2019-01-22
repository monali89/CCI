package linkedLists;

public class Node {
	
	Node next = null;
	int data;

	public static void main(String[] args) {
		
		Node list = new Node(2);
		list.appendToTail(3);
		list.appendToTail(6);
		list.appendToTail(9);
		list.appendToTail(1);
		
		list.printList(list);

	}
	
	Node(int d){
		data = d;
	}
	
	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	void printList(Node n){
		while(n.next != null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	

}


