/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package list;

/**
 * @author Ahmed Abuwarda, Date: Aug 30,2019.
 */
class LinkedList {

    private static Node head;

    static class Node {

        int data;
        Node next;

        /**
         * @param d Any int number.
         */
        Node(int d) {

            data = d;
            next = null;

        }

    }

    /**
     * Function to reverse the linked list.
     *
     * @param node Node.
     * @return Node.
     */
    private Node reverse(Node node) {

        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        node = prev;
        return node;

    }

    /**
     * prints content of double linked list.
     *
     * @param node Node.
     */
    private void printList(Node node) {

        while (node != null) {

            System.out.print(node.data + " ");
            node = node.next;

        }

    }

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        LinkedList list = new LinkedList();
        head = new Node(85);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);

    }

} 