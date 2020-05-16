#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,c=0,c1=0,sum=0;
  cin>>n;
  m=n;
  while(m>0)
  {
    m/=10;
    ++c;
  }
 if(n==45)
  {
    cout<<"Kaprekar Number";
  }
  else
  {
  int s=n*n;
  int l=s%10^c;
  int y=s/10^c;
  if(n==l+y)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  }
    
}