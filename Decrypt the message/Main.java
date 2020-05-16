#include<bits/stdc++.h>
using namespace std; 
int main()
{
  int n,m,sum=0,div;
  cin>>n>>m;
  int num=n+m;
  for(int i=1;i<num;++i)
  {
    div=num%i;
    if(div==0)
    {
      sum+=i;
    }
  }
  if(num==sum)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}