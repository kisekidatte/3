package dsd_manual;

public class zad3_3 {

    public static Node createHead(int n){
        Node head = null;
        for (; n>=1; n--){
            head = new Node(n,head);
        }
        return head;
    }

    public static Node createTail(int n){
        Node head = new Node(0,null);
        Node tail = head;
        for (int i = 1; i < n; i++){
            tail.next = new Node(i+1,null);
            tail = tail.next;
        }
        return head;
    }

    public static Node firstNode(Node head, Node newHead){
        newHead.next = head;
        return newHead;
    }

    public static Node lastNode(Node head, Node newTail){
        Node ref = head;
        while(ref.next != null){
            ref = ref.next;
        }
        ref.next = newTail;
        return head;
    }

    public static Node insertNode(Node head, Node insrtElement, int index){
        Node ref = head;
        int i = 1;
        while (i != index){
            ref = ref.next;
            i++;
        }
        insrtElement.next = ref.next;
        ref.next = insrtElement;
        return head;
    }

    public static Node ersFirst(Node head){
        head = head.next;
        return head;
    }

    public static Node ersLast(Node head){
        Node ref = head;
        while(ref.next.next != null){
            ref = ref.next;
        }
        ref.next = null;
        return head;
    }

    public static Node deleteNode(Node head, int n){
        Node ref = head;
        int i = 1;
        while(i != n){
            ref = ref.next;
            i++;
        }
        ref.next = ref.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(0,null);
        Node node2 = new Node(1,null);
        Node node3 = new Node(2,null);
        node1.next = node2;
        node2.next = node3;
        System.out.println("node1");
        Node nodeOne = new Node(0,new Node(1,new Node(2, null)));
        System.out.println("nodeOne");
        Node head = createHead(3);
        System.out.println(head);
        head = firstNode(head, new Node(-10,null));
        System.out.println(head);
        head = lastNode(head,new Node(5, null));
        System.out.println(head);
        head = insertNode(head, new Node(-20,null),3);
        System.out.println(head);
        head = ersFirst(head);
        System.out.println(head);
        head = ersLast(head);
        System.out.println(head);
        head = deleteNode(head, 2);
        System.out.println(head);

    }
}