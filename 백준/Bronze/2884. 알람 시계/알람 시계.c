#include <stdio.h>
int main() {
    int h, m;
    scanf("%d %d", &h, &m);
    int early = 45;
    if (m >= early) {
        m -= early;
    } else {
        m = 60 - (early - m);
        if (h == 0) {
            h = 23;
        } else {
            h--;
        }
    }
    printf("%d %d", h, m);
}