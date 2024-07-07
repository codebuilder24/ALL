#include <iostream>
#include <vector>
using namespace std;

int main() {
    int arraySize;
    cout << "Enter the number of elements you want to store: ";
    cin >> arraySize;

    vector<int> numArray(arraySize); // Declare the vector with the specified size

    cout << "Enter " << arraySize << " numbers: ";
    for (int i = 0; i < arraySize; ++i) {
        cin >> numArray[i];
    }

    cout << "Please, enter the number whose position you want to check: ";
    int num;
    cin >> num;

    // Find the last occurrence of the number
    for (int i = (9); i >= 0; i--) {
        if (num == numArray[i]) {
            cout << "The position of the last occurrence is in the index " << i 
                 << " and that's the " << (i + 1) << " position." << endl;
            break;
        }
    }

    return 0;
}
