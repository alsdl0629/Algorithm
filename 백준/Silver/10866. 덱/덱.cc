#include <iostream>
#include <deque>
using namespace std;
int main() {
    deque<int> DQ;

    int n;
    cin >> n;

    while (n--) {
        string str;
        cin >> str;

        if (str == "push_front") {
            int input;
            cin >> input;
            DQ.push_front(input);
        } else if (str == "push_back") {
            int input;
            cin >> input;
            DQ.push_back(input);
        } else if (str == "pop_front") {
            if (DQ.empty()) {
                cout << -1 << "\n";
            } else {
                cout << DQ.front() << "\n";
                DQ.pop_front();
            }
        } else if (str == "pop_back") {
            if (DQ.empty()) {
                cout << -1 << "\n";
            } else {
                cout << DQ.back() << "\n";
                DQ.pop_back();
            }
        } else if (str == "empty") {
            cout << (int )DQ.empty() << "\n";
        } else if (str == "size") {
            cout << DQ.size() << "\n";
        } else if (str == "front") {
            if (DQ.empty()) {
                cout << -1 << "\n";
            } else {
                cout << DQ.front() << "\n";
            }
        } else if (str == "back") {
            if (DQ.empty()) {
                cout << -1 << "\n";
            } else {
                cout << DQ.back() << "\n";
            }
        }
    }
}