#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        int cnt;
        char ch[20];
        scanf("%d %s", &cnt, ch);
        for (int j = 0; j < strlen(ch); j++) {
            for (int k = 0; k < cnt; k++) {
                printf("%c", ch[j]);
            }
        }
        printf("\n");
    }
}