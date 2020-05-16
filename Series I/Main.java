#include<bits/stdc++.h>
using namespace std; 
int main()
{ int n;
 cin>>n;
 float sum=0.5;
 if(n==1)
 cout<<sum<<" ";
else{
  cout<<sum<<" ";
 for(int i=0;i<n-1;++i)
 {
   sum+=pow(3,i);
   cout<<sum<<" ";
 }
}
 return 0;
}