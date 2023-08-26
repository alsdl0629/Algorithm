#include <iostream>
using namespace std;
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int input1, input2;
    cin >> input1 >> input2;
    if (input1 > input2) swap(input1, input2);
    if (input1 == input2 || input2 - input1 == 1) {
        cout << 0;
    } else {
        cout << input2 - input1 - 1 << "\n";
        for (int i = input1 + 1; i < input2; i++) cout << i << " ";
    }
}