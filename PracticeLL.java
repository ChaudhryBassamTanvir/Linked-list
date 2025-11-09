import java.util.LinkedList;

public class PracticeLL {
    Node head;
private int size;

PracticeLL(){
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


    //remove nth node from end
public Node removeNthFromEnd(Node head, int n){
    if (head.next==null) {
        return null;
    }
int size=0;
Node curr = head;
while (curr!=null) {
    curr=curr.next;
    size++;
    
}

if (n==size) {
    return head.next;
}
int indexToSearch= size-n;
Node prev=head;
int i =0;
while (i<indexToSearch) {
    prev=prev.next;

}

prev.next= prev.next.next;
return head;

}


    public static void main(String[] args) {
        PracticeLL list = new PracticeLL();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
list.addFirst(4);
list.addFirst(5);

        
removeNthFromEnd(list,4);


    }
}
