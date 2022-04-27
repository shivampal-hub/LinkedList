public class LinkedListUC7 {

    public static void main(String[] args) {

        LinkedListMethods<Integer> list = new LinkedListMethods<>();

        list.addNode(70);
        list.addNode(30);
        list.addNode(56);

        list.display();

        if(list.searchNode(30)){
            System.out.println("Value is present in the list");

        }
        else {
            System.out.println("Value is not present in the list");

        }
    }
}
