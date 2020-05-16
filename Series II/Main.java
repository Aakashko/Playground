#include<bits/stdc++.h>
using namespace std; 
int main()
{
  int n,sum;
  cin>>n;
  int a=11;
  sum=a*a;
  cout<<sum<<" ";
  for(int i=0;i<n-1;++i)
  {
    a+=4;
    sum=a*a;
    cout<<sum<<" ";
  }
}