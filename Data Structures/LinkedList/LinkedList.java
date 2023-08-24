class Node {
    Node next;
    int val;
    Node(){
        next = null;
        System.out.println('Node class instantiated..')
    }
}

public class LinkedList {
    int length;
    LinkedList() {
        length = 0;
        System.out.println('LinkedList class instantiated..')
    }

    LinkedList(int[] arr) {
        length = arr.length;
    }

    public boolean add(int element) {
        return true;
    }

    public void add(int index, int element) {

    }

    public boolean addAll(int[] arr) {
        return true;
    }

    public void addFirst(int e) {

    }

    public void addLast(int e) {

    }

    public void clear() {

    }

    public boolean contains(int element) {
        return true;
    }

    public Node element() {
        return null;
    }

    public int get(int index) {
        return -1;
    }

    public int getFirst() {
        return -1;
    }

    public int getList() {
        return -1;
    }

    public int indexOf() {
        return -1;
    }

    public int lastIndexOf() {
        return -1;
    }

    public int remove() {
        return -1;
    }

    public int remove(int index) {
        return -1;
    }

    public int removeFirst() {
        return -1;
    }

    public int removeLast() {
        return -1;
    }

    public int size() {
        return -1;
    }

    public String toString() {
        return "";
    }
}