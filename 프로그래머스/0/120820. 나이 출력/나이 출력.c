#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int age) {
    int answer = 0;
    int year = 2022;
    int manAge = age - 1;
    answer = year - manAge;
    return answer;
}