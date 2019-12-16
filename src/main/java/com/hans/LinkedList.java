package com.hans;

/**
 * Linked List Implementation
 * 1. Add Nodes to List
 * 2. Print all nodes
 * 3. Find middle node
 * 4. Reverse list
 *
 */
public class LinkedList {
    private Node head;

    //----add Nodes
    public void addToTheLast(Node node){
        if(head == null){
            head = node;
        }else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    //----print List
    public void printList(){
        Node temp = head;
        while (temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println( );
    }

    //---Find middle node using two nodes
    public Node findMiddleNode(){
        Node slowPointer,fastPointer;
        slowPointer= fastPointer = head;
        while(fastPointer != null){
            fastPointer = fastPointer.next;
            if(fastPointer != null && fastPointer.next != null){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }
        return slowPointer;
    }

    public void printReversList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    //---Reverse list
    public static Node reversLinkList(Node currentNode){
        Node previousNode = null;
        Node nextNode = null;
        while (currentNode != null){
            nextNode = currentNode.next;
            //---reverse list
            currentNode.next = previousNode;
            //--Moving current Node and previous Node by 1
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //----Creating Link List
        Node head = new Node(8);
        list.addToTheLast(head);
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(1));

        list.printList();

        //-----Find Middle Element
        Node middleNode = list.findMiddleNode();
        System.out.println("Middle Node Value : "+ middleNode.data);

        //--Reversing LinkedList
        Node reverseHead=reversLinkList(head);
        System.out.println("After reversing");
        list.printReversList(reverseHead);
    }
}
