package old.collections;

public class DoublyLinkedList<T> {


       class Node<T>{
           T data;
           Node next;
           Node prev;

           public  Node(T data){
               this.data = data;
           }
    }
}
