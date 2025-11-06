class LL{
Node head;
private int size;

LL(){
    this.size=0;
}
class Node{
    int data;
    Node next; // next b node ho ge tu 

   
    Node(int data ){

            this.data = data;
            this.next=null;
             size=size+1;

    }
}

//add ,first, last

public void addFirst (int data){
    
    Node  newNode = new Node(data);
    
    if (head==null) {
    head= newNode;
    return;
}
 newNode.next = head;
 head=newNode;

}


public void addLast(int data){
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
//delete first
public void deleteFirst(){
    if (head==null) {
System.out.println("The list is empty");
        return;
    }
    size--;
    head=head.next;
}

public void deletelast(){
    if (head==null) {
System.out.println("The list is empty");
        return;
    }
if (head.next==null) {
    head=null;
    return;
    
}

Node secondLast = head;
Node lastNode= head.next; //head.next = null -> lastNode=null
    while (lastNode.next!=null) {//null.next so error
        lastNode=lastNode.next;
        secondLast=secondLast.next;
        
    }
    size--;
    secondLast.next=null;
}



//size
public int getSize(){
    return size;
}
//print
public void printList(){
if (head==null) {
    System.out.println("List is empty");
    return;
}
    Node currNode = head;
    while (currNode!=null) {
        System.out.print(currNode.data+ " -> " );
        currNode=currNode.next;
        
    }

    System.out.println("NULL");
}

// reverse
public void reverseLinkedList(){
    Node currNode= head.next;
    Node prevNode=head;
    while (currNode!=null) {
        Node nextNode= currNode.next;
        currNode.next=prevNode;
    

        //update
        prevNode=currNode;
        currNode=nextNode;
        
    }
}

    public static void main(int[] args){
        //To make a linkedList we have to make a object of our own class
        
        LL list = new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

}
}