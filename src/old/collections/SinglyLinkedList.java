package old.collections;

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

    public int findGCD(int[] nums) {
        int maximum = 0, minimum=0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maximum){
                maximum = nums[i];
            }
            if(nums[i] < minimum){
                minimum = nums[i];
            }
        }

        while(minimum!=0){
            int temp = minimum;

            minimum = maximum % minimum ;
            maximum = temp;
        }

        return maximum;

    }

}
