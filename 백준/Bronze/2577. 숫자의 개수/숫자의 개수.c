#include <stdio.h>
int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    long long int int_result = a * b * c;
    char string_result[10];
    sprintf(string_result, "%lld", int_result);
    
    int count[10] = {0};
    for (int i = 0; i < strlen(string_result); i ++) {
        if (string_result[i] == '0') {
            count[0]++;
        } else if (string_result[i] == '1') {
            count[1]++;
        } else if (string_result[i] == '2') {
            count[2]++;
        } else if (string_result[i] == '3') {
            count[3]++;
        } else if (string_result[i] == '4') {
            count[4]++;
        } else if (string_result[i] == '5') {
            count[5]++;
        } else if (string_result[i] == '6') {
            count[6]++;
        } else if (string_result[i] == '7') {
            count[7]++;
        } else if (string_result[i] == '8') {
            count[8]++;
        } else if (string_result[i] == '9') {
            count[9]++;
        }
    }
    for (int i = 0; i < 10; i ++) {
        printf("%d\n", count[i]);
    }
}