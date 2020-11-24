#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

int pickingNumbers(vector<int> a) {
    int max=0,ans=0;
    sort(a.begin(),a.end());
    cout<<"start";
    for(int i=0;i<a.size()-1;i++){
        max=0;
        cout<<a[i]<<" "<<a[i+1]<<endl;
        if(a[i] == a[i+1]){
            cout<<"1";
            for(int j=i;j<a.size()-1;j++){
                int least=a[i];
                if(a[j] ==least || a[j]==least+1){
                    max++;
                }
            }
        }
        else if(a[i] == a[i+1]-1){
            
            cout<<"2";
            max++;
            for(int j=i+1;j<a.size()-1;j++){
                int least=a[i];
                if(a[j] ==least || a[j]==least+1){
                    max++;
                }
            }
        }
        if(a[0] == a[a.size()-1]) max++;
        if(max>ans){
            ans=max;
        }
    }
    return ans;
}
//2

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string n_temp;
    getline(cin, n_temp);

    int n = stoi(ltrim(rtrim(n_temp)));

    string a_temp_temp;
    getline(cin, a_temp_temp);

    vector<string> a_temp = split(rtrim(a_temp_temp));

    vector<int> a(n);

    for (int i = 0; i < n; i++) {
        int a_item = stoi(a_temp[i]);

        a[i] = a_item;
    }

    int result = pickingNumbers(a);

    fout << result << "\n";

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}

vector<string> split(const string &str) {
    vector<string> tokens;

    string::size_type start = 0;
    string::size_type end = 0;

    while ((end = str.find(" ", start)) != string::npos) {
        tokens.push_back(str.substr(start, end - start));

        start = end + 1;
    }

    tokens.push_back(str.substr(start));

    return tokens;
}
