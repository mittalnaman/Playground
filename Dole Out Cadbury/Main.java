#include <iostream> 
#include <bits/stdc++.h> 
using namespace std;
int squares(float r) 
{ 
	return (floor(sqrt(r)) - ceil(sqrt(1)) + 1);
} 
int main()
{
    int min_len, max_len;
    int min_width, max_width;
    cin>>min_len>>max_len;
    cin>>min_width>>max_width;
    int total=0, sum=0;
    for(int i=min_len; i<=max_len; i++)
	{
		total = i*min_width;
		sum = sum + squares(total);
		total = i*max_width;
		sum = sum + squares(total);
	}
	cout<<sum;
    return 0;
}