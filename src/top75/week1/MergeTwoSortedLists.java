package top75.week1;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

        ListNode test11 = new ListNode(1);
        ListNode test12 = new ListNode(2);
        ListNode test13 = new ListNode(4);

        test11.next = test12;
        test12.next = test13;

        ListNode test21 = new ListNode(1);
        ListNode test22 = new ListNode(3);
        ListNode test23 = new ListNode(4);

        test21.next = test22;
        test22.next = test23;

        mergeTwoLists(test11, test21);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
//            System.out.println(current.next.val);
            current = current.next;
        }

        if (list1 != null) {
//            System.out.println(current.val);
            current.next = list1;
        }
        if (list2 != null) {
//            System.out.println(current.val);
            current.next = list2;
        }
        return dummyHead.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
