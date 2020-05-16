#include<bits/stdc++.h>
using namespace std; 
int main()
{ int n;
 cin>>n;
 for(int i=n;i<=n+3;++i)
 {
   for(int j=n-n;j<=n-2*n+i;++j)
   {
     cout<<i;
   }
   cout<<endl;
 }
  for(int i=n+3;i>=n;--i)
 {
   for(int j=n-2*n+i;j>=n-n;--j)
   {
     cout<<i;
   }
   cout<<endl;
 }
}