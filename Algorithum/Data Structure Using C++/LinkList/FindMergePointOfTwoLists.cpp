// Complete the findMergeNode function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
int findMergeNode(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) { 
    SinglyLinkedListNode *temp1,*temp2;
    int ans=0;
    temp1=head1;
    while(temp1){
        temp2=head2;
        while(temp2){
            if(temp1 == temp2) return temp1->data; 
            temp2=temp2->next;
        }
        temp1=temp1->next;
    }
    return ans;  
}