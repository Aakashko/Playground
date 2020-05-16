#include<bits/stdc++.h>
using namespace std; 
int main()
{ int n;
 cin>>n;
 int sum=2;
 if(n==1)
   cout<<"0";
 else if(n==2)
   cout<<"0 2";
 else
 {
   cout<<"0 2 ";
   for(int i=3;i<=n;i+=2)
   {
     if(n==3)
     {
       sum+=i*2;
     cout<<sum<<" ";
     }
     else
     {
       
     sum+=i*2;
     cout<<sum<<" ";
     sum+=i*2;
     cout<<sum<<" ";
     }
   }
 }
}