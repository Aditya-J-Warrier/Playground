#include <iostream>
using namespace std;

int main() 
{
    int n;
  	int sum=0;
  	cin>>n;
    while(n!=0)
    {
      sum=sum*10+n%10;
      n/=10;
    }
  	cout<<sum;
    return 0;
}
