package com.hans;

/**
 * Find nth Node from end of linked list
 */
public class FindNnode {

    private Node head;

    public void addToLast (Node node){

        if(head ==null){
            head =node;
        }else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printList(){
        Node temp = head;
        while (temp !=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public Node findNodeFromEnd(Node head, int n){
        Node fNode = head;
        Node sNode = head;

        for (int i= 0; i<n;i++){
            fNode = fNode.next;
        }
        while (fNode != null){
            fNode = fNode.next;
            sNode = sNode.next;
        }
            return sNode;

    }

    public static void main(String[] args) {
        FindNnode findNnode = new FindNnode();
        Node head = new Node(5);
        findNnode.addToLast(head);
        findNnode.addToLast(new Node(2));
        findNnode.addToLast(new Node(8));
        findNnode.addToLast(new Node(1));
        findNnode.addToLast(new Node(4));
        findNnode.addToLast(new Node(9));

        findNnode.printList();

        Node nThNode = findNnode.findNodeFromEnd(head,3);
        System.out.println("Nth Node :"+ nThNode.data);

    }
}
