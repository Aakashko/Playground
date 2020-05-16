#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float a,b,c,d,e,f,g,h,i;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int x=a+c-(b/100)*a;
  int y=d+f-(e/100)*d;
  int z=g+i-(h/100)*g;
  cout<<"In Flipkart Rs."<<x<<endl;
  cout<<"In Snapdeal Rs."<<y<<endl;
  cout<<"In Amazon Rs."<<z<<endl;
  if(x<=y&&x<=z)
    cout<<"He will prefer Flipkart";
  else if(y<x&&y<z)
    cout<<"He will prefer Snapdeal";
  else if(z<x&&z<y)
    cout<<"He will prefer Amazon";
  return 0;
}