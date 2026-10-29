package Lab;
public class linkedlist {
    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args){
        Node first = new Node(10);
        Node Second = new Node(20);
        Node third = new Node(30);

        first.next = Second;
        Second.next = third;

        System.out.println(first.data);
        System.out.println(first.next.data);
        System.out.println(Second.next.data);
        
    
    }
}
