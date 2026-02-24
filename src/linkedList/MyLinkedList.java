package linkedList;

public class MyLinkedList {

    Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        var newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            var current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addFirst(int data) {
        var newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int data) {
        if (head.data == data) {
            head = head.next;
        }
        if (head == null) {
            return;
        }
        var current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public void printList() {
        var current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void update(int index, int data){
       int count=0;
      Node current = head;
      while (current!= null){
          if(index==count){
              current.data=data;
          }
          count++;
          current=current.next;
      }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList();
        list.addFirst(5);
        list.printList();
        list.delete(3);
        list.printList();
        list.delete(5);
        list.printList();
        list.update(0,22);
        list.printList();
    }
}
