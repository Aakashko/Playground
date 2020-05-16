#include<bits/stdc++.h>
using namespace std; 
int main()
{ int n,j,k;
 cin>>n;
 for(int i=1;i<=n;++i)
 {
   k=i;
   if(i%2!=0)
   {
     for(j=1;j<n;++j)
        cout<<i;
     cout<<++k<<endl;
   }
   else
   {
     k=i+1;
     cout<<k;
     for(j=1;j<n;++j)
       cout<<i;
     cout<<endl;
   }
 }
}
       