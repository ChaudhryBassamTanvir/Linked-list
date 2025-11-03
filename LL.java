class LL{

class Node{
    String data;
    Node next; // next b node ho ge tu 



    Node(String data ){

            this.data = data;
            this.next=null;
    }
}

//add ,first, last

public void addFirst (String data){
    
    Node  newNode = new Node(data);
    
    if (head==null) {
    head= newNode;
    return;
}
 newNode.next = head;
 head=newNode;

}


public void addLast(String data){
    Node newNode = new Node(data);

     if (head==null) {
    head= newNode;
    return;
}
    Node currNode = head;
    while (currNode.next!=null) {
        currNode=currNode.next;
        
    }
currNode.next = newNode;


}

//priny 
public void printList(){
        Node newNode = new Node(data);

    Node currNode = head;
    while (currNode.next!=null) {
        System.out.print(currNode.data+ " -> " );
        currNode=currNode.next;
        
    }
currNode.next = newNode;

}



    public static void main(String[] args){
        //To make a linkedList we have to make a object of our own class
        
        LL list = new LL();

 list.addFirst("This");
 list.addFirst("is");

    }
}