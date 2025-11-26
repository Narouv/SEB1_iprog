#include <stdlib.h>
#include <stdio.h>

void func() {
  printf("fortnite");
}

void func2() {
  return func();
}

int main() {
  func2();
}