public class SortedLinkedList<E extends Comparable> {

    Node<E> head = null;

    public void addNode(E data) {

        Node<E> newNode = new Node<E>(data);

        if (head == null) {
            head = newNode;

        }
        else {
            newNode.next = head;
            head = newNode;

        }
        sortedList();
    }

    public void sortedList() {

        Node<E> current = head;
        Node<E> index ;
        E temp;

        if(head == null) {
            System.out.println("List Empty");

        }
        else {
            while(current != null) {
                index = current.next;

                while(index != null) {
                    if(current.data.compareTo(index.data) > 0) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;

                    }
                    index = index.next;

                }
                current = current.next;

            }
        }
    }

    public void display() {

        Node<E> temp=head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    public static void main(String[] args) {

        SortedLinkedList<Integer> list = new SortedLinkedList<>();

        list.addNode(50);
        list.addNode(30);
        list.addNode(70);
        list.addNode(40);

        list.display();
    }
}
