#include <iostream>
#include <list>
using namespace std;
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    list<char> L;
    string input;
    cin >> input;

    for (auto c: input) L.push_back(c);

    int n;
    cin >> n;
    auto cursor = L.end();
    while (n--) {
        char  input2;
        cin >> input2;

        if (input2 == 'L') {
            if (cursor != L.begin()) cursor--;
        } else if (input2 == 'D') {
            if (cursor != L.end()) cursor++;
        } else if (input2 == 'B') {
            if (cursor != L.begin()) {
                cursor--;
                cursor = L.erase(cursor);
            }
        } else if (input2 == 'P') {
            char c;
            cin >> c;
            L.insert(cursor, c);
        }
    }
    for (auto l: L) cout << l;
}