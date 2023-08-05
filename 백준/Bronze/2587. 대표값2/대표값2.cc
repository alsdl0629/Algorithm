#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    int input[5], sum = 0, avg = 0;
    for (int i = 0; i < 5; i++) {
        cin >> input[i];
        sum += input[i];
    }
    sort(input, input + 5);
    avg = sum / 5;
    cout << avg << "\n" << input[2];
}