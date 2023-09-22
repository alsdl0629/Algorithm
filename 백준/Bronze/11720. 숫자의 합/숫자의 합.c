#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);

    char b[n + 1];
    scanf("%s", b);
    int sum = 0;
    for (int i = 0; i < n; i++) {
        int a = b[i] - 48;
        sum += a;
    }
    printf("%d\n", sum);
}