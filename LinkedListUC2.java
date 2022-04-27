public class LinkedListUC2<E> {

    public Node<E> head = null;

    public static void main(String[] args) {

        LinkedListMethods<Integer> list = new LinkedListMethods<>();

        list.addNode(56);
        list.addNode(30);
        list.addNode(70);

        list.display();
    }
}
