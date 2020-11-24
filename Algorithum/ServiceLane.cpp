#include <bits/stdc++.h>
using namespace std;

int main()
{
    int limit,times;
    int check1,check2,least;
    cin>>limit>>times;
    int arr[limit];
    for(int i =0;i<limit;i++) cin>>arr[i];
    
    for(int i=0;i<times;i++){
        cin>>check1>>check2;
        least=arr[check1];
        for(int i=check1;i<=check2;i++){
            if(arr[i]<least) least=arr[i];
        }
        cout<<least<<endl;
    }    
    return 0;
}
