#include <iostream>
#include <stack>
using namespace std;
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n, sum = 0;
    cin >> n;
    stack<int> S;
    while (n--) {
        int input;
        cin >> input;
        if (input == 0) {
            sum -= S.top();
            S.pop();
        } else {
            sum += input;
            S.push(input);
        }
    }
    cout << sum;
}