#include<bits/stdc++.h>
using namespace std; 
int main()
{ int n;
 cin>>n;
 int sum=6;
 cout<<sum<<" ";
 for(int i=1;i<=n-1;++i)
 {
   sum+=5*i;
   cout<<sum<<" ";
 }
}