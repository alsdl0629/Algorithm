#include <iostream>
using namespace std;
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int input[3];
    for (int i = 0; i < 3; i++) cin >> input[i];

    for (int i = 0; i < 3; i++) {
        for (int j = i + 1; j < 3; j++) {
            if (input[i] > input[j]) {
                int tmp = input[i];
                input[i] = input[j];
                input[j] = tmp;
            }
        }
    }
    cout << input[0] <<  ' ' <<input[1] <<  ' ' <<input[2];
}