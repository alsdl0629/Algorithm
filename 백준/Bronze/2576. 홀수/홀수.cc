#include <iostream>
using namespace std;
int main() {
    int input[7], sum = 0, min = 100;
    for(int i = 0; i < 7; i++) cin >> input[i];

    for(int i = 0; i < 7; i++) {
        if (input[i] % 2 != 0) {
            sum += input[i];
            if (input[i] < min) {
                min = input[i];
            }
        }
    }
    if (sum == 0) cout << sum - 1;
    else cout << sum << "\n" << min;
}