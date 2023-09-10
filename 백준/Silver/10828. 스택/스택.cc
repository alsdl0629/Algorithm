#include <iostream>
#include <stack>
using namespace std;
int main() {
    stack<int> S;
    int n;
    cin >> n;
    while (n--) {
        string str;
        cin >> str;
        if (str == "push") {
            int input;
            cin >> input;
            S.push(input);
        } else if (str == "top") {
            if (!S.empty()) cout << S.top() << "\n";
            else cout << -1 << "\n";
        } else if (str == "size") {
            cout << S.size() << "\n";
        } else if (str == "empty") {
            cout << (int)S.empty() << "\n";
        } else if (str == "pop") {
            if (!S.empty()) {
                cout << S.top() << "\n";
                S.pop();
            } else cout << -1 << "\n";
        }
    }
}