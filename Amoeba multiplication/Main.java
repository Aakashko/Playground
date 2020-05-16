#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum,a=0,b=1;
  cin>>n;
  for(int i=2;i<n;++i)
  {
    sum=a+b;
    a=b;
    b=sum;
  }
  if(n==1)
    cout<<"0";
  else
    cout<<sum;
  
}