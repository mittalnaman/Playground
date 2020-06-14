#include<iostream>
using namespace std;

int main()
{
 int n,one,two,five,tot;
  cin>>n;
  five=(n-4)/5;
  if((n-5*five)%2==0) one=2;
  else one=1;
  
  two=(n-five*5-one*1)/2;
  tot=one+two+five;
  cout<<tot<<" "<<five<<" "<<two<<" "<<one;
  return 0;
}