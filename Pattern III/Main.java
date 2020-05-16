#include<bits/stdc++.h>
using namespace std; 
int main()
{ int n,j;
 cin>>n;
 for(int i=1;i<=n;++i)
 {
   for( j=1;j<i;++j)
   {
     cout<<i<<"*";
   }
   cout<<i<<endl;
 }
  for(int i=n;i>=1;--i)
 {
   for( j=i;j>1;--j)
   {
     cout<<i<<"*";
   }
   cout<<i<<endl;
 }
}