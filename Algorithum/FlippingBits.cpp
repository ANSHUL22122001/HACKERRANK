#include <bits/stdc++.h>

using namespace std;

// Complete the flippingBits function below.
long flippingBits(long n) {
    int arr[32],i;
    long ans=0;
    for(i=0;i<32;i++) arr[i]=0;
    while(n){
        i--;
        arr[i]=n%2;
        n=n/2;
    }
    long check=1;
    for(i=31;i>=0;i--){
        if(arr[i]==0) ans=ans+check;
        check=check*2;
        cout<<ans<<endl;
    }
    return ans;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int q;
    cin >> q;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int q_itr = 0; q_itr < q; q_itr++) {
        long n;
        cin >> n;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');

        long result = flippingBits(n);

        fout << result << "\n";
    }

    fout.close();

    return 0;
}
