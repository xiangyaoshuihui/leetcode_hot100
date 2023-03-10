
 //Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
}


public class easy_21 {
    public static void main(String[] args){
        System.out.println("helloworld");
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result=new ListNode();
        ListNode pre=new ListNode();
        result=pre;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                ListNode temp=new ListNode(list1.val);
                temp.next=null;
                pre.next=temp;
                pre=pre.next;
                list1=list1.next;
            }
            else{
                ListNode temp=new ListNode(list2.val);
                temp.next=null;
                pre.next=temp;
                pre=pre.next;
                list2=list2.next;
            }
        }
        while(list1!=null){
            ListNode temp=new ListNode(list1.val);
            temp.next=null;
            pre.next=temp;
            pre=pre.next;
            list1=list1.next;
        }
        while(list2!=null){
            ListNode temp=new ListNode(list2.val);
            temp.next=null;
            pre.next=temp;
            pre=pre.next;
            list2=list2.next;
        }

        

        return result.next;
    }

    //官方题解
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
}
