#include<bits/stdc++.h>
using namespace std; 
int main()
{
  int n,f=0;
  cin>>n;
  int m=n/2;
  if(n==2)
    cout<<"Eligible";
  else if(n==1)
    cout<<"Not eligible";
  else
  {
    for(int i=2;i<=m;++i)
    {
      if(n%i==0&&n*1==n)
      {
        cout<<"Not eligible";
        f=1;
        break;
      }
    }
    if(f==0)
      cout<<"Eligible";
  }
}