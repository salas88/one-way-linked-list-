public class Test {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(1));

        myLinkedList.remove(0);
        myLinkedList.remove(1);

        System.out.println(myLinkedList);
    }

}
