package DataStructure;

public class mergeTwoSortedNode{

    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
    //     ListNode root = list1;
    //     ListNode tmpNode = null;
        
    //     if(list1 == null){
    //         return list2;
    //     }
        
    //     if(list2 == null){
    //         return list1;
    //     }
        
    //     if(list1.val > list2.val){
    //         root = list2;
    //         list2 = list1;
    //         list1 = root;
    //     }
        
    //     while(list1 != null && list2 != null){
    //         while(list1 != null && list1.val <= list2.val){
    //             tmpNode = list1;
    //             list1 = list1.next;
    //         }
            
    //         if(tmpNode != null){
    //             tmpNode.next = list2;
    //             list2 = list1;
    //             list1 = tmpNode.next;
    //             tmpNode = list1;
    //         }
        
    //     }
    //     return root;
    // }

}