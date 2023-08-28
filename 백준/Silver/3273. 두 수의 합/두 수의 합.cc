#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int input, x;
    cin >> input;

    int arr[input];
    for (int i = 0; i < input; i++) cin >> arr[i];

    cin >> x;
    sort(arr, arr + input);

    int start = 0, end = input - 1, total = 0;
    while (start < end) {
        int result = arr[start] + arr[end];
        if (result < x) start++;
        else if (result > x) end--;
        else {
            total++;
            start++;
            end--;
        }
    }
    cout << total;
}