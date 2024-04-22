class Node
{
    int key;
    int value;
    Node next;
    Node(int key, int value)
    {
        this.key = key;
        this.value = value;
    }
    int getValue()
    {
        return this.value;
    }
    int getKey()
    {
        return this.key;
    }
    void setValue(int value)
    {
        this.value = value;
    }
}

public class HashMap
{
    Node table[];
    int size;

    HashMap(int size)
    {
        this.size = size;
        table = new Node[size];
    }

    void put(int key, int value)
    {
        int hash = key % size;
        Node node = table[hash];
        if (node == null)
        {
            table[hash] = new Node(key, value);
        }
        else
        {
            while (node.next != null)
            {
                if (node.getKey() == key)
                {
                    node.setValue(value);
                    return;
                }
                node = node.next;
            }

            if (node.getKey() == key)
            {
                node.setValue(value);
                return;
            }
            node.next = new Node(key, value);
        }
    }

    int get(int key)
    {
        int hash = key % size;
        Node node = table[hash];

        if (node == null)
        {
            return -1;
        }

        while (node != null)
        {
            if (node.getKey() == key)
            {
                return node.getValue();
            }
            node = node.next;
        }
        return -1;
    }

    void delete(int key)
    {
        
    }
}
