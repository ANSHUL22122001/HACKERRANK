#include <bits/stdc++.h>

using namespace std;

class StackLinkedList
{
private:
    struct node
    {
        char data;
        node *next;
    }*head;

public:
    StackLinkedList() { head=NULL;}

    int isEmpty()
    {
        if(head==NULL) return 1;
        else return 0;
    }

    void push(char num)
    {
        node *temp=new node;
        temp->data=num;
        temp->next=head;
        head=temp;
    }

    void pop()
    {
        node *temp;
        temp=head;
        head=head->next;
        delete(temp);
    }

    char Top()
    {
        return head->data;
    }

    ~StackLinkedList(){}
};

string isBalanced(string Random) {
    int length=0;
    StackLinkedList ob;
    for(int i=0;Random[i];i++) length++;
    for(int i=0;Random[i];i++){
        cout<<Random[i];
        if(Random[i]=='('){
            ob.push(Random[i]);
        }
        else if(Random[i]==')'){
            if(ob.isEmpty()){ 
                cout<<endl;
                return "NO";
            }
            if(ob.Top() == '(') {
                ob.pop();
            }
            else {
                cout<<endl;
                return "NO";
            }
        }
        else if(Random[i]=='['){
            ob.push(Random[i]);
        }
        else if(Random[i]==']'){
            if(ob.isEmpty()){ 
                cout<<endl;
                return "NO";
            }
            if(ob.Top() == '[') {
                ob.pop();
            }
            else {
                cout<<endl;
                return "NO";
            }
        }
        else if(Random[i]=='{'){
            ob.push(Random[i]);
        }
        else if(Random[i]=='}'){
            if(ob.isEmpty()){ 
                cout<<endl;
                return "NO";
            }
            if(ob.Top() == '{') {
                ob.pop();
            }
            else {
                cout<<endl;
                return "NO";
            }
        }
    }
    cout<<endl;
    if(ob.isEmpty()) return "YES";
    else return "NO";
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int t;
    cin >> t;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int t_itr = 0; t_itr < t; t_itr++) {
        string s;
        getline(cin, s);

        string result = isBalanced(s);

        fout << result << "\n";
    }

    fout.close();

    return 0;
}
