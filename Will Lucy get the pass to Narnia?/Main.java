#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a,b,c;
  cout<<"Enter first number : ";
  cin>>a;
    cout<<"Enter second number : ";
    cin>>b;
     cout<<"Menu"<<endl;
  cout<<"1.Addition"<<endl<<
"2.Subtraction"<<endl<<
"3.Multiplication"<<endl<<
"4.Division"<<endl<<
"5.Remainder"<<endl;
      cin>>c;
  switch(c)
  {
    case 1: cout<<a+b;
      break;
      case 2: cout<<a-b;
      break;
      case 3: cout<<a*b;
      break;
      case 4: cout<<a/b;
      break;
      case 5: cout<<a%b;
      break;
    default: cout<<"Invalid operation";
  }
  return 0;
}