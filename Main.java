

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N= sc.nextInt();
        while (N != 1) {
            System.out.print(N + " ");
            if (N %#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    int value = 2;

    if (n == 2 || n == 3) {
      cout << "NO SOLUTION";
      return 0;
    }

    while(value <= n) {
      cout << value << " ";
      value += 2;
    }

    value = 1;

    while(value <= n) {
      cout << value << " ";
      value += 2;
    }

    return 0;
} 2 != 0)
                N = N * 3 + 1;
            else
                N /= 2;
        }
        System.out.print(1);
    }
}