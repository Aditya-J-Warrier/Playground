#include <iostream>
using namespace std;

int main() 
{
    int N;
	int p=0;
  	cin>>N;
  	for(int i=2; i<=N; i++)
    {for(int j=1; j<i; j++)
     {
      if(i%j==0)
        p++;
      else
        ;
     }
     if(p>1)
      p=0;
  	else
      cout<<i<<" ";
      p=0;
    }
  	
    return 0;
}