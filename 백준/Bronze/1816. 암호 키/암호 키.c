#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        long long int input;
        scanf("%lld", &input);

        for (int j = 2; j <= 1000000; j++) {
            if (input % j == 0) {
                printf("NO\n");
                break;
            }
            if (j == 1000000) {
                printf("YES\n");
            }
        }
    }
}