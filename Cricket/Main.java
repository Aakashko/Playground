#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int b,r,s,w;
  cin>>b>>r>>s>>w;
  float o=(float)b/6;
  int f=w/6;
  int p=w%6;
  float k = ((float)f + (float)p/10);
  float cr=s/k;
  float tr=(float)r/o;
  cout<<o<<endl;
  cout<<fixed<<setprecision(1)<<k<<"\n";
  cout<<cr<<endl<<tr<<endl;
  if(cr>tr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  return 0;
      
}