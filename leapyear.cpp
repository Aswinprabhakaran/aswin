#include<iostream>
#include<conio.h>
using namespace std;
int  main()
{
int year;
cout<<"enter the year to  check weather it is leap year or not:";
cin>>year;
if(((year%4)==0)||((year%400)==0)||((year%100)==0))
cout<<"it is an leap year";
else
cout<<"not an leap year";

}
