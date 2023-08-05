#include <stdio.h>

int main() {
    int input1, input2;
    
    scanf("%d %d", &input1, &input2);
    int a[input1];
    for (int i = 0; i < input1; i++) {
        scanf("%d", &a[i]);
    }

    for (int i = 0; i < input1; i++) {
        if (input2 > a[i]) {
            printf("%d ", a[i]);
        }
    }

    return 0;
}