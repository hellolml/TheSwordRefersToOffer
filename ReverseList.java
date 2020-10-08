import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseList {
    public static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head!=null){
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }
    public static ListNode reverseList2(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head!=null){
            stack.push(head);
            head = head.next;
        }
        while (stack.isEmpty()){
            return null;
        }
        ListNode node = stack.pop();
        ListNode newHead = node;
        while (!stack.isEmpty()){
           ListNode temp = stack.pop();
           node.next = temp;
           node = node.next;
        }
        node.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        //reverseList2(node1);
        //System.out.println();
        ListNode node = reverseList2(node1);
        while (node!=null){
            System.out.print(node.val);
            node = node.next;
        }
    }
}