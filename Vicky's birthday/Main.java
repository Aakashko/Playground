#include<bits/stdc++.h>
using namespace std;
int main()
{
 int a;
 cin>>a;
 if (a % 4 == 0)
 {
   if(a % 100 == 0)
     {
      if(a % 400 == 0)
        cout<<"Vicky can celebrate his birthday.";
      else
        cout<<"Vicky can't celebrate.";
     }
     else
       cout <<"Vicky can celebrate his birthday.";
       
 }
  else
        cout<<"Vicky can't celebrate.";
  return 0;
}