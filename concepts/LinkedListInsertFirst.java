package concepts;
class LinkedList
{
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size= 0;
    }






    public void insertFirst(int value)
    {
        Node node = new Node(value);
        node.next= head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }
        size ++;
    }

    public void insertLast(int value)
    {
        if(tail == null)
        {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next= node;
        tail= node;
        size++;
    }

    public void insert(int value, int index)
    {
        if(index == 0)
        {
            insertFirst(value);
            return;
        }
        if(index == size)
        {
            insertLast(value);
        }

        Node temp= head;
        for(int i =1;i < index; i++)
        {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    public void display()
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    class Node
    {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
public class LinkedListInsertFirst {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.insertFirst(5);
        obj.insertFirst(7);
        obj.insertFirst(11);
        obj.insertFirst(25);
        obj.insertLast(26);
        obj.insert(1, 3);
        obj.display();

    }
}
