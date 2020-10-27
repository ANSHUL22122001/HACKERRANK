// Complete the sortedInsert function below.

/*
 * For your reference:
 *
 * DoublyLinkedListNode {
 *     int data;
 *     DoublyLinkedListNode* next;
 *     DoublyLinkedListNode* prev;
 * };
 *
 */
DoublyLinkedListNode* sortedInsert(DoublyLinkedListNode* head, int data) {
    DoublyLinkedListNode* temp=new DoublyLinkedListNode(data);
    DoublyLinkedListNode* temp1;
    temp1=head;
    
    if(head->data > data){
        temp->prev=nullptr;
        temp->next=head;
        head=temp;
    }
    else{
        bool condition=true;
        temp1=head;
        while(temp1->next!=NULL){
            if((temp1->data <= data) && (temp1->next->data > data)){
                temp->next=temp1->next;
                temp1->next=temp;
                temp->prev=temp1;
                temp1=temp1->next;
                temp1=temp1->next;
                temp1->prev=temp;
                condition=false;
                break;
            }
            temp1=temp1->next;
        }
        if(condition){
            temp->next=NULL;
            temp1->next=temp;
            temp->prev=temp1;
        }
    }

    return head;

}
