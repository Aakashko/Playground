#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s1=0,s2=0;
  cin>>n;
  while(n>0)
  {
    int r=n%10;
    if(r%2==0)
    {
      s1+=r;
    }
    else{
      s2+=r;
    }
    n/=10;
  }
  if(s1==s2)
    cout<<"Yes";
  else
    cout<<"No";
}