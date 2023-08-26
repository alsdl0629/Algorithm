#include <iostream>
using namespace std;
int arr[10];
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int input, total = 1;
    cin >> input;

    while (input) {
        arr[input % 10]++;
        input /= 10;
    }

    for (int i = 0; i < 10; i++) {
        if (i == 6 || i == 9) continue;
        total = max(total, arr[i]);
    }

    total = max(total, (arr[6] + arr[9] + 1) / 2);
    cout << total;
}