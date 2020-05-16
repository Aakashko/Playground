#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  float s=0.0;
  for(int i=0;i<3;)
  {
    cin>>num;
    if(num<0)
    {
      s-=1;
      
      break;
    }
    else if(num%2==0)
    { s-=0.5;
    }
   else
   {
     s+=1;
     ++i;
   }
    
  }
  cout<<s<<endl;
}