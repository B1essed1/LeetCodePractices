package collections;

public class  SinglyLinkedList <T> {

    private Node head;
    private Node tail;
    class Node<T>{
        T data;
        Node next;

        public  Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data){
        Node newNode = new Node(data);

        if (head==null){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void display(){
        Node  current = head;

        if (current ==  null) System.out.println("This list is empty!");
        else {
            System.out.print("[");
            while (current != null){
                System.out.printf(" %s ",current.data);
                current = current.next;
            }
            System.out.print("]");

        }
    }

}
