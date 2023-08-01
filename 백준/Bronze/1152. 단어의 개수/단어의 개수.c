#include <stdio.h>
#include <string.h>
int main() {
    char input[1000000];
    scanf("%[^\n]s", input);
    int len = strlen(input);
    if (len == 1 && input[0] == ' ') {
        printf("0\n");
        return 0;
    }
    int count = 1;
    for (int i = 1; i < len - 1; i++) {
        if (input[i] == ' ') {
            count++;
        }
    }
    printf("%d\n", count);
}