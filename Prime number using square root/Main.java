#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n;
	int p=0;
  	cin>>n;
  	for(int i=1; i<n; i++)
    {
      if(n%i==0)
        p++;
      else
        ;
    }
  	if(p>1)
      cout<<"Given number is not a prime number";
  	else
      cout<<"Given number is a prime number";
    return 0;
}