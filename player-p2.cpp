#include<iostream>
using namespace std;
#include<conio.h>
long factorial(int);
int main()
{
int counter,n;
cout<<"enter the no:";
cin>>n;
cout<<"factorial value"<<factorial(n);
getch();
return 0;
}
long factorial(int n)
{

if(n==0)
return 1;
else
return(n*factorial(n-1));
}

