#include<bits/stdc++.h>
using namespace std;
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
int findGCD(int arr[]) 
{ 
    int result = arr[0]; 
    for (int i = 1; i < 3; i++) 
        result = gcd(arr[i], result); 
  
    return result; 
} 
int main()
{
  //Type your code here.
  int a[3];
  for(int i=0;i<3;++i)
    cin>>a[i];
  sort(a,a+3);
  cout<<"The treasure is in box which has number "<<a[1]<<endl;
  cout<<"The code to open the box is "<<findGCD(a);
  return 0;
}