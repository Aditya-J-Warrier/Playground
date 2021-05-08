//Factors of a Number (O(Sqrt(n))
#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n , i ;
    cin >> n ;
    for(i = 1 ; i*i<n ; i++)
    {
        if(n % i == 0)
            cout << i << ' ' << n/i << ' ' ;
    }
    if(i*i == n)
        cout << i ;
    
    return 0;
}