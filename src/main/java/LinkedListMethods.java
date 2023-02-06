public class LinkedListMethods {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public static LinkedListMethods addElement(LinkedListMethods list, int data){
            Node newNode = new Node(data);

            if (list.head == null) {
                list.head = newNode;
            } else {
                Node last = list.head;

                while (last.next != null) {
                    last = last.next;
                }

                last.next = newNode;
            }

            return list;
        }

        public static LinkedListMethods removeElement(LinkedListMethods list, int element){
            Node currentNode = list.head;
            Node previousNode = null;

            if (currentNode != null && currentNode.data == element) {
                list.head = currentNode.next;
                System.out.println(element + " элемент удален");
                return list;
            }

            while (currentNode != null && currentNode.data != element) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }

            if (currentNode != null) {
                previousNode.next = currentNode.next;
                System.out.println(element + " элемент удален");
            }

            if (currentNode == null) {
                System.out.println(element + " не удалось найти данный элемент");
            }

        return list;
        }

        public static LinkedListMethods indexOfElement(LinkedListMethods list, int index){
            Node currentNode = list.head;
            Node previousNode = null;

            if (index == 0 && currentNode != null) {
                System.out.println("Индекс элемента: " + "");
                return list;
            }

            int counter = 0;
            while(currentNode != null){

                if (counter == index) {
                    System.out.println("Элемент по индексу " + index + ": " + currentNode.data);
                    break;
                } else {
                    previousNode = currentNode;
                    currentNode = currentNode.next;
                    counter++;
                }

            }

            if(currentNode == null){
                System.out.println("Индекс элемента не найден: " + "");
            }

            return list;
        }

        public boolean elementContains(LinkedListMethods list, int data){
            Node newNode = list.head;

            while (newNode != null){
                if (newNode.data == data){
                    System.out.println("Элемент " + data + " найден");
                    return true;
                }
                newNode = newNode.next;
            }

            System.out.println("Данного элемента нет в списке");
            return false;
        }

        public void printList(){
            Node currentNode = head;

            System.out.println("Связанный список: ");

            while(currentNode != null){
                System.out.println(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }

    public static void main(String[] args) {
        LinkedListMethods myLinkedList = new LinkedListMethods();

        addElement(myLinkedList,8);
        addElement(myLinkedList,2);
        addElement(myLinkedList,54);
        addElement(myLinkedList,5);
        addElement(myLinkedList,86);


        removeElement(myLinkedList,3);
        indexOfElement(myLinkedList, 3);
        myLinkedList.elementContains(myLinkedList,54);

        myLinkedList.printList();
    }
}
