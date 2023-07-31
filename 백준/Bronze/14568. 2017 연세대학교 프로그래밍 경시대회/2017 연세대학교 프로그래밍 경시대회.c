#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);

    int count = 0;
    for (int a = 0; a < n; a++) {
        for (int b = 0; b < n; b++) {
            for (int c = 0; c < n; c++) {
                if (a + b + c == n && c >= b + 2 && a % 2 == 0 && a != 0 && b != 0 && c!= 0) {
                    count++;
                }
            }
        }
    }
    printf("%d\n", count);
}