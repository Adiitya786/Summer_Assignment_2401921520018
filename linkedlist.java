
public class linkedlist {
    static class Node{
        char data;
        Node next;
        public Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addLast(char data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void arrange( Node  temp){
        Node vowel = new Node('A');
        Node dummyvow = vowel;
        Node constNode = new Node('A');
        Node  dummyconst= constNode;

        while(temp != null){
            if(temp.data=='a'||temp.data=='e'||temp.data=='i'||temp.data=='o'||temp.data=='u'){
                 dummyvow.next = temp;
                 dummyvow = dummyvow.next;
            }
            else {
                dummyconst.next = temp;
                dummyconst = dummyconst.next;
            }
            temp = temp.next;
        }
        dummyvow.next = constNode.next;
        dummyconst.next = null;
        vowel = vowel.next;
          while(vowel != null){
            System.out.print(vowel.data+"->");
            vowel = vowel.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        addLast('a');
        addLast('b');
        addLast('a');
        addLast('b');
        addLast('d');
        addLast('e');
        addLast('e');
        addLast('d');
      
        // addLast('a');
        // addLast('b');
        // addLast('c');
        // addLast('d');
        // addLast('e');
        // addLast('f');
        // addLast('g');
        // addLast('h');
        // addLast('i');
        
         arrange(head);
        
    }
}
