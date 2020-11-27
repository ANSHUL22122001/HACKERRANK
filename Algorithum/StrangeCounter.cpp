#include <bits/stdc++.h>

using namespace std;

// Complete the strangeCounter function below.
long strangeCounter(long t) {
    long den=3,start=1;
    if(t>3){
        do{
            start=start+den;
            den=den*2;
            cout<<start<<" "<<den;
        }while(start+den < t);
    }
    return den-(t-start);
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    long t;
    cin >> t;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    long result = strangeCounter(t);

    fout << result << "\n";

    fout.close();

    return 0;
}
