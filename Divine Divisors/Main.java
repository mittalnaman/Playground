#include<iostream>
using namespace std;
#include<cmath>
#include<vector>
void printDivisors(int n) 
{ 
    // Vector to store half of the divisors 
    vector<int> v; 
    for (int i=1; i<=sqrt(n); i++) 
    { 
        if (n%i==0) 
        { 
            if (n/i == i) // check if divisors are equal 
              cout<<i<<" "; 
            else
            { 
                cout<<i<<" "; 
  
                // push the second divisor in the vector 
                v.push_back(n/i); 
            } 
        } 
    } 
  
    // The vector will be printed in reverse 
    for (int i=v.size()-1; i>=0; i--) 
        cout<<v[i]<<" "; 
} 
int main()
{
int n;
  cin>>n;
  vector<int> v;
 printDivisors(n); 
  return 0;
}
