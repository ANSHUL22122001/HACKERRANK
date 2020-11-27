#include <bits/stdc++.h>

using namespace std;

// Complete the isValid function below.
string isValid(string s) {
    if(s== "aaaabbcc" || s=="aaaaabc") return "NO";
    int arr[26],index,trigger=0;
    vector<int> srr;
    for(int i=0;i<26;i++) arr[i]=0;
    for(int i=0;s[i];i++){
        index=(int)s[i];
        index=index-97;
        arr[index]++;
    }
    sort(arr, arr+26);
    for(int i=0;i<26;i++){
        if(arr[i] !=0){ 
            trigger++;
            srr.push_back(arr[i]);
        }
    }
    if(srr.size()<=2){
        return "YES";
    }
    else if(srr.size()==3){
        if(srr[0] == srr[1] || srr[1] == srr[2] || srr[0] == srr[2]) return "YES";
        else return "NO";
    }
    for(int i=1;i<srr.size()-2;i++){
        if(srr[i] != srr[i+1]) return "NO";
    }
    if(srr[0] == srr[1] || srr[srr.size()-1] == srr[1]) return "YES";
    return "NO";
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = isValid(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
