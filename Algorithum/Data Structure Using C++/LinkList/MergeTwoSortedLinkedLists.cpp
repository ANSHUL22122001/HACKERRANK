#include <bits/stdc++.h>

using namespace std;

class SinglyLinkedListNode {
    public:
        int data;
        SinglyLinkedListNode *next;

        SinglyLinkedListNode(int node_data) {
            this->data = node_data;
            this->next = nullptr;
        }
};

class SinglyLinkedList {
    public:
        SinglyLinkedListNode *head;
        SinglyLinkedListNode *tail;

        SinglyLinkedList() {
            this->head = nullptr;
            this->tail = nullptr;
        }

        void insert_node(int node_data) {
            SinglyLinkedListNode* node = new SinglyLinkedListNode(node_data);

            if (!this->head) {
                this->head = node;
            } else {
                this->tail->next = node;
            }

            this->tail = node;
        }
};

void print_singly_linked_list(SinglyLinkedListNode* node, string sep, ofstream& fout) {
    while (node) {
        fout << node->data;

        node = node->next;

        if (node) {
            fout << sep;
        }
    }
}

void free_singly_linked_list(SinglyLinkedListNode* node) {
    while (node) {
        SinglyLinkedListNode* temp = node;
        node = node->next;

        free(temp);
    }
}

// Complete the mergeLists function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */

SinglyLinkedListNode* add(SinglyLinkedListNode* head , int num) {

    SinglyLinkedListNode* temp;
    SinglyLinkedListNode* temp1=new SinglyLinkedListNode(num);
    temp=head;
    while(temp) temp=temp->next;
    temp1->next=nullptr;
    temp->next=temp1;
    return head;
}
SinglyLinkedListNode* mergeLists(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) {

    if(head1 == NULL && head2 == NULL)
        return NULL;
    if(head1 == NULL)
        return head2; 
    if(head2 == NULL)
        return head1; 
    if(head1->data <= head2->data){
        head1->next = mergeLists(head1->next, head2); 
        return head1;       
    }
    else{
        head2->next = mergeLists(head1, head2->next);     
        return head2; 
    }
}

int main()