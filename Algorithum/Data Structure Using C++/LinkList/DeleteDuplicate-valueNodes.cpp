
// Complete the removeDuplicates function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
SinglyLinkedListNode* removeDuplicates(SinglyLinkedListNode* head) {

    SinglyLinkedListNode* temp;
    x:temp=head;
    while(temp->next!=nullptr){
        if(temp->data == temp->next->data){
            temp->next=temp->next->next;
            goto x;
        }
        temp=temp->next;   
    }
     return head;

}
