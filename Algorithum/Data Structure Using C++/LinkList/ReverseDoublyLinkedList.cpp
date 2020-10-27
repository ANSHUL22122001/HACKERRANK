// Complete the reverse function below.

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
DoublyLinkedListNode* reverse(DoublyLinkedListNode* head) {
    
    DoublyLinkedListNode* head1 = new DoublyLinkedListNode(head->data);
        cout<<"hello";
    DoublyLinkedListNode* temp11=head->next;
    while(temp11){
        DoublyLinkedListNode* temp = new DoublyLinkedListNode(temp11->data);
        temp->prev=nullptr;
        temp->next=head1;
        head1->prev=temp;
        head1=temp;
        while(temp){
            cout<<temp->data;
            temp=temp->next;
        }
        temp11=temp11->next;
    }
    return head1;
}
