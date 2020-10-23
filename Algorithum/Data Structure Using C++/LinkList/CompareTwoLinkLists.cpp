// Complete the compare_lists function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
bool compare_lists(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) {

    SinglyLinkedListNode* temp1;
    SinglyLinkedListNode* temp2;
    temp1=head1;
    temp2=head2;
    int count1=0,count2=0;
    while(temp1) {
        count1++;
        temp1=temp1->next;
    }
    while(temp2) {
        count2++;
        temp2=temp2->next;
    }
    temp1=head1;
    temp2=head2;
    if(count1==count2){
        while(temp1 && temp2) {
            
            if(temp1->data != temp2->data) return false;
            temp1=temp1->next;
            temp2=temp2->next;
        }
    }
    else{
        return false;
    }
    return true;
}
