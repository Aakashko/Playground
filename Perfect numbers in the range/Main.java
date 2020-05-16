#include<bits/stdc++.h>
using namespace std; 
int main()
{ int i,n,sum;
 cin>>i>>n;
 for(int k = i;k<=n;++k)
 {
   sum=0;
   for(int j=1;j<=k/2;++j)
   {
     if(k%j==0)
        sum=sum+j;
   }
   if(sum==k)
     cout<<sum<<" ";
 }
 return 0;
}
 