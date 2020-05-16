#include<bits/stdc++.h>
using namespace std; 
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  if(b<a)
    cout<<100+b-a;
  else
    cout<<b-a;
  return 0;
}