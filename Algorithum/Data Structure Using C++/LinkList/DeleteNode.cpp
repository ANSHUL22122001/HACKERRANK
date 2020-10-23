// Complete the deleteNode function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
SinglyLinkedListNode* deleteNode(SinglyLinkedListNode* head, int position) {

    SinglyLinkedListNode* temp;
    temp=head;
    int count=1;
    if(position==0){
        head=head->next;
        return head;
    }
    while(temp!=nullptr){
        if(count==position){
            temp->next=temp->next->next;
            break;
        }
        else{
            count++;
        }
        temp=temp->next;   
    }
     return head;
}
