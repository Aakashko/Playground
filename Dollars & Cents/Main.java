#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d,c,e,f;
  cin>>d>>c>>e>>f;
  int D=d+e;
  int C=c+f;
  if(C>100)
  {
    D=D+(C/100);
    C=C%100;
  }
  cout<<D<<endl<<C;
  return 0;
  
}