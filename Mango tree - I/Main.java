#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  if(c<=b)
    cout<<"Yes";
  else if(c>=b&&(c%b==1||c%b==0))
    cout<<"Yes";
  else
    cout<<"No";
}