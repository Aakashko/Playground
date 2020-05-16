#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[10];
  int b;
  cin>>a>>b;
  if(strcmp(a,"front")==0) 
     { if(b==1)
       cout<<"Left Handed";
      else
        cout<<"Right Handed";
     }
     else
     {
       if(b==1)
         cout<<"Right Handed";
       else
         cout<<"Left Handed";
     }
}
     
     
     
   