#include<iostream>
#include<cmath>
using namespace std;

int sum(int a)
{
    int s=0,r;
    while(a>0)
    {
       r=a%10;
       s+=r;
       a=a/10;
    }
    return s;
}
int main()
{
    int a[100],b[100],c[100],i,n,j,rem,s=0,cn=0;
    cin>>n;
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n;i++)
    {
        j=0;
        while(a[i]>0)
        {
            rem=a[i]%6;
            s=s+(rem*pow(10,j));
            a[i]=a[i]/6;
            j++;
        }
        b[i]=s;
        s=0;
    }
    for(i=0;i<n;i++)
    {
    c[i]=sum(b[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(c[i] >c[j])
                cn++;
        }
    }
    cout<<cn;
    return 0;
}