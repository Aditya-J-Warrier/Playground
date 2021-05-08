//Sum of prime factors of a given number
#include <bits/stdc++.h>
using namespace std;
int prime(int n)
{
    if(n==1)
        return 0;
    for(int i=2;i*i<=n;i++)
    {
        if(n%i==0)
        {
            return 0;
        }
    }
    return n;
}
int main()
{
    int n;
    cin>>n;
    int sum=0;
    for(int i=1;i*i<=n;i++)
    {
        if(i*i == n)
            sum += prime(i) ;
        else if(n%i==0)
            sum+=prime(i)+prime(n/i);
    }
    cout<<sum;
    return 0;
}

