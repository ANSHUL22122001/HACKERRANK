#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


int main() {
    int limit,random,check;
    cin>>limit;
    set<int> srr;
    for(int i=0;i<limit;i++){
        cin>>random;
        if(random==1){
            cin>>check;
            srr.insert(check);
        }
        else if(random==2){
            cin>>check;
            srr.erase(check);
        }
        else if(random==3){
            cin>>check;
            set<int>::iterator itr=srr.find(check);
            if(itr==srr.end()){
                cout<<"No"<<endl;
            }
            else{
                cout<<"Yes"<<endl;
            }
        }
    }   
    return 0;
}



