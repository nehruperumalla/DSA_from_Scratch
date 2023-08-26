public class Solution {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        System.out.println(list);
        list.add(11);
        System.out.println(list);
        list.add(12);
        System.out.println(list);
        list.add(13);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}