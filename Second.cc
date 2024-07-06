#include <iostream>
using namespace std;
int main (){
    cout <<"This Code Is Used To Compute For The Net Pay Of Employees In A Particular Company"<<endl;
    double grossPay , netPay , incomeTax, nationalLevy, districtTax, payMent;
    // Starting the Main Code 
    int hours;
    string gender ;
    cout<<"Please enter the gender of ther person"<<endl;
    cin>>gender;
    cout<<"Please, enter the hours worked by the person:";
    cin>>hours;
    //Writing a nexted if statement 
    if (hours<=40) {
        cout<<"It's regular Hours"<<endl;
        if(gender =="male") {
            grossPay = 500*hours;
        } else {
            grossPay = 550*hours;
        }
    } else {
        cout<<"It is an overtime"<<endl;
        if (gender =="male") {
            grossPay = 1.5*500*hours;
        } else {
            grossPay = 1.5*550*hours;
        }
    }
    //Writing a code for the number of children


    return 0;
}