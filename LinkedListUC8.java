public class LinkedListUC8 {

    public static void main(String[] args) {

        LinkedListMethods<Integer> list = new LinkedListMethods<>();

        list.addNode(70);
        list.addNode(30);
        list.addNode(56);

        list.searchNAdd(40, 30);

        list.display();
    }
}

