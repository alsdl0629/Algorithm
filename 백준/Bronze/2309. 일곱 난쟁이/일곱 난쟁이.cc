#include <iostream>
#include <algorithm>
using namespace std;
int input[9], result[7];
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    for (int i = 0; i < 9; i++) cin >> input[i];

    for (int i = 0; i < 8; i++) {
        int total = 0;

        for (int j = i + 1; j < 9; j++) {
            total = 0;

            for (int k = 0, a = 0; k < 9; k++) {
                if (k != i && k != j) {
                    result[a++] = input[k];
                }
            }
            for (int k = 0; k < 7; k++) total += result[k];

            if (total == 100) break;
        }
        if (total == 100) break;
    }
    sort(result, result + 7);
    for (int i = 0; i < 7; i++) cout << result[i] << "\n";
}