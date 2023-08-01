#include <stdio.h>
int arr[10];
int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    int result = a * b * c;
    for (int i = result; i > 0; i /= 10) {
        arr[i % 10]++;
    }
    for (int i = 0; i < 10; i++) {
        printf("%d\n", arr[i]);
    }
}