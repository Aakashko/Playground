#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u,c;
  cin>>u;
  if(u<=200)
    c=u*0.5;
  else if(u>200&&u<=400)
    c=u*0.65+100;
  else if(u>400&&u<=600)
    c=u*0.80+200;
  else if(u>600)
    c=u*1.25+425;
  cout<<"Rs."<<c;
  return 0;
  
  
}