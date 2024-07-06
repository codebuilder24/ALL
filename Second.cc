#include <iostream>
using namespace std;
int main (){
    cout <<"This Code Is Used To Compute For The Net Pay Of Employees In A Particular Company"<<endl;
    double grossPay , netPay , incomeTax, nationalLevy, districtTax, payMent;
    // Starting the Main Code 
    int hours, children;
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
    cout<<"Please, enter the number of children"<<endl;
    cin>>children;
    if (children<=3) {
        payMent = children*10;
    } else {
        payMent = children*10 +(children-3)*20;
    }
    incomeTax = 0.15*grossPay;
    nationalLevy = 0.025*grossPay;
    districtTax = 0.01*grossPay;
    netPay = grossPay -(incomeTax+nationalLevy+districtTax+payMent);
    cout<<netPay;

    return 0;
}