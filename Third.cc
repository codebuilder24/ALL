#include<iostream>
#include <vector>
using namespace std;
int main () {
    int i, arraySize,num;
    int numArray;
    cout<<"Enter The Number Of Elements You Want To Store In Your Array:"<<endl;
    cin>>arraySize;
    vector<int>numArray(arraySize);

    cout<<"Please,Enter " << arraySize << "numbers";
    for(i=0;i<arraySize; i++) {
        cin>>numArray[i];
    }
    cout<<"Please , Enter the number whose last position you want to check :"<<endl;
    cin>>num;
    for ( i = arraySize-1; i >=0 ; i--)
    {
        if(num == numArray[i]) {
            cout<<i;
            break;
        }
    }
    
    return 0;
}