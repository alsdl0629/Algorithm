#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int arr[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int y = 0, m = 0;

    for (int i = 0; i < n; i++) {
        y += arr[i] / 30 + 1;
        m += arr[i] / 60 + 1;
    }

    y *= 10;
    m *= 15;

    if (y > m) {
        printf("%c %d", 'M', m);
    } else if (y < m) {
        printf("%c %d", 'Y', y);
    } else {
        printf("%c %c %d", 'Y', 'M', y);
    }
}