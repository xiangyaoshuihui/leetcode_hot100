

//Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



public class medium_19 {

    public static void main(String[] args){
        System.out.println("helloworld");
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode quick=head;
        ListNode slow=head;
        ListNode pre=null;
        for(int i=0;i<n-1;i++){
            quick=quick.next;
        }

        while(quick.next!=null){
            quick=quick.next;
            pre=slow;
            slow=slow.next;
        }

        if(pre==null){
            head=head.next;
        }
        else{
            pre.next=slow.next;
        }

        

        return head;
    }
    
}
