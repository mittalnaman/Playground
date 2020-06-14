#include<iostream>
using namespace std;
int main(){
int n,arr[100000],ans=0;
  cin>>n;
   for(int i=0;i<n;i++){
   cin>>arr[i];
  }
  for(int i=0;i<n;i++){
    ans=ans^arr[i];
  }
  if(ans) cout<<"AMAN";
  else cout<<"JASBIR";
  return 0;
}