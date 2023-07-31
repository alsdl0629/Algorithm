#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);

    int test[n][3];
    for (int i = 0; i < n; i++) {
        scanf("%d %d %d", &test[i][0], &test[i][1], &test[i][2]);
    }

    int result = 0;
    for (int a = 1; a < 10; a++) {
        for (int b = 1; b < 10; b++) {
            for (int c = 1; c < 10; c++) {
                if (a == b || b == c || c == a) {
                    continue;
                }

                int count = 0;
                for (int i = 0; i < n; i++) {
                    int num = test[i][0];
                    int strike = test[i][1];
                    int ball = test[i][2];
                    int strike_count = 0;
                    int ball_count = 0;

                    int numA = num / 100, numB = (num / 10) % 10, numC = num % 10;

                    if (a == numA) strike_count++;
                    if (b == numB) strike_count++;
                    if (c == numC) strike_count++;

                    if (a == numB || a == numC) ball_count++;
                    if (b == numA || b == numC) ball_count++;
                    if (c == numA || c == numB) ball_count++;

                    if (strike == strike_count && ball == ball_count) {
                        count++;
                    }
                }
                if (count == n) {
                    result++;
                }
            }
        }
    }
    printf("%d\n", result);
}
