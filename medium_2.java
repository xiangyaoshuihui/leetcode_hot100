


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 

public class medium_2 {
    public static void main(String[] args){
        System.out.println("helloworld");
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre=new ListNode(0,null);
        ListNode now;
        ListNode result=pre;
        int zz=0;
        while(l1!=null&&l2!=null){
            now=new ListNode((zz+l1.val+l2.val)%10,null);
            pre.next=now;
            pre=now;
            zz=(zz+l1.val+l2.val)/10;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            now=new ListNode((zz+l1.val)%10,null);
            pre.next=now;
            pre=now;
            zz=(zz+l1.val)/10;
            l1=l1.next;
        }
        while(l2!=null){
            now=new ListNode((zz+l2.val)%10,null);
            pre.next=now;
            pre=now;
            zz=(zz+l2.val)/10;
            l2=l2.next;
        }
        if(zz!=0){
            now=new ListNode(zz,null);
            pre.next=now;
            pre=now;
        }
        return result.next;
    }
}
