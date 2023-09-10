#include <iostream>
#include <queue>
using namespace std;
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

   queue<int> Q;
   int n;
   cin >> n;

   while (n--) {
       string str;
       cin >> str;

       if (str == "push") {
           int input;
           cin >> input;
           Q.push(input);
       } else if (str == "front") {
           if (!Q.empty()) cout << Q.front() << "\n";
           else cout << -1 << "\n";
       } else if (str == "back") {
           if (!Q.empty()) cout << Q.back() << "\n";
           else cout << -1 << "\n";
       } else if (str == "size") {
           cout << Q.size() << "\n";
       } else if (str == "empty") {
           cout << (int )Q.empty() << "\n";
       } else if (str == "pop") {
           if (!Q.empty()) {
               cout << Q.front() << "\n";
               Q.pop();
           } else cout << -1 << "\n";
       }
   }
}