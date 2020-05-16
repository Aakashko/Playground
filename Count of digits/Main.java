#include<iostream>
using namespace std;
int main()
{
  // Type your code here
   long long int n,c=0;
  cin>>n;
  if(n==0)
  {
    n=1;
  }
  while(n>0)
  {
    int r=n%10;
    ++c;
    n=n/10;
    
  }
    cout<<c;
}