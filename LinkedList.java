class Node
{
    public int data;
    public Node next;

    public Node(int data)
    {
        this.data = data;
    }
}

public class LinkedList {
    Node head;
    LinkedList()
    {
        this.head = null;
    }

    public void insertElement(int number)
    {
        Node node = new Node(number);
        if (this.head == null)
        {
            this.head = node;
        }
        else
        {
            Node currentNode = this.head;
            while(currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }

    public void print()
    {
        Node currentNode = this.head;

        while(currentNode != null)
        {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public Boolean search(int number)
    {
        Node currentNode = this.head;

        while (currentNode!=null)
        {
            if (currentNode.data == number)
            {
                return true;
            }
            else
            {
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    public void delete(int number)
    {
        

        if (this.head == null)
        {
            System.out.println("This linked list is empty");
            return;
        }

        if (head.data == number)
        {
            this.head = this.head.next;
        }

        //Node currentNode = this.head;
        Node previousNode = this.head;
        while(previousNode.next != null)
        {
            if (previousNode.next.data == number)
            {
                previousNode.next = previousNode.next.next;
                return;
            }
            else
            {
                previousNode = previousNode.next;
            }
        }


    }
    
}
