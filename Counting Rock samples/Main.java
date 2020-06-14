#include<iostream>
using namespace std;
int main()
{
    
    long long int size,totalRange,i,j,count=0;
    cin>>size>>totalRange;
  	long long int S[size],range[totalRange*2];
    for(i=0;i<size;i++){
        cin>>S[i];
    }
    totalRange=totalRange*2;
    for(i=0;i<totalRange;i=i+2)
    {
        cin>>range[i]>>range[i+1];
        for(j=0;j<size;j++)
        {
            if((S[j]>=range[i])&&(S[j]<=range[i+1]))
                count++;
        }
        cout<<count<<" ";
        count=0;
    }
    return 0;
}