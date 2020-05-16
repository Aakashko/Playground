#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,num,sum=0,c=0;
  cin>>n;
  do
  {
    cin>>num;
    sum+=num;
    ++c;
    if(sum>=n)
    {
      cout<<"The number of turns is "<<c;
      break;
    }
  }while(c);
  
}