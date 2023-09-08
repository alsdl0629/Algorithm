#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    string s;
    int count;
    while (1) {
        getline(cin, s);
        if (s == "#") {
            return 0;
        }
        count = 0;
        for (auto c : s) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        cout << count << "\n";
    }
}