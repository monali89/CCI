package linkedLists;

public class Linklist<E> {
	
	Node[] ll;
	int ctr;
	
	Linklist(){
		ll = new Node[10];
		ctr = -1;
	}
	
	public boolean addNode(E obj){
		if(ctr>10){
			return false;
		}
		ll[++ctr] = new Node(obj);
		return true;
	}
	
	public Node getNode(int index){
		if(index<0 || index>10){
			return null;
		}
		return ll[index];
	}

	public boolean deleteNode(){
		if(ctr<0){
			System.out.println("LOG: List is empty");
			return false;
		}
		ctr--;
		return true;
	}
}
