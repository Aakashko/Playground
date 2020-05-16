#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,sum=0;
  cin>>n;
  m=n;
  while(m>0)
  {
    int r=m%10;
    sum+=r;
    m/=10;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
    else
      cout<<"Not Harshad Number";
}