public class LinkedListUC4 {

    public static void main(String[] args) {

        LinkedListMethods<Integer> list = new LinkedListMethods<>();

        list.addNode(70);
        list.addNode(56);

        list.addBetween(30, list.head);

        list.display();
    }
}
