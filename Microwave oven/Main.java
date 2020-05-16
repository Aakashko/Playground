#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float b;
  cin>>a>>b;
  float h;
  if(a<=3)
  {
    if(a==2)
    { h=0.5*b+b;
      cout<<h;
    }
    else if(a==3)
    {
      h=2*b;
      cout<<h;
    }
  }
  else if(a>3)
    cout<<"Number of items is more";
  return 0;
}