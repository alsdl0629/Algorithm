#include <iostream>
#include <cstring>
using namespace std;
int freq[26];
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    string s;
    cin >> s;
    for (auto e: s) freq[e - 'a']++;
    for (int i = 0; i < 26; i++) cout << freq[i] << ' ';

}