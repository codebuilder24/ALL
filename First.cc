#include <iostream>
using namespace std;
int main () {
    //This code  is used to swap two values of a variable
    int num1 , num2, num3;
    cout<<"Please enter the first number";
    cin>>num1;
    cout<<"Please enter the second number";
    cin>>num2;
    num3 = num1;
    num1 = num2;
    num2 = num3;
    cout<<"The First Number Is Now :"<<num1<<endl;
    cout<<"The Second Number Is Now :"<<num2<<endl;
    
    return 0;
}