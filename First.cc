#include <iostream>
using namespace std;
int main () {
    int a , b, c;
    cout<<"Please enter the first number";
    cin>>a;
    cout<<"Please enter the second number";
    cin>>b;
    c = a;
    a = b;
    b = c;
    cout<<"The First Number Is Now"<<a;
    
    return 0;
}