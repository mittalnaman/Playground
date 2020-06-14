#include <iostream> 
using namespace std; 

int main() 
{ 

	int num, star=0; 
	int space; 
	cin>>num;
	int i, j, lterm, rterm; 
	lterm = 1; 
	rterm = num * num + 1; 
	for (i = num; i > 0; i--) 
	{ 
		for (space = 1; space <= star ; space++) 
			cout << "*";
		star +=2; 
		for (j = 1; j <= i; j++) 
		{ 
			cout << lterm <<"0"; 
			lterm++; 
		} 
		for (j = 1; j <= i; j++) 
		{ 
			cout << rterm; 
			if (j < i) 
				cout<<"0"; 
			rterm++; 
		} 
		rterm = rterm - (i - 1) * 2 - 1; 
		cout << endl; 
	} 
}