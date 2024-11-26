Kata - DNI

Task:
Model a console application that calculates the letter of the DNI (National Identity Document).

The algorithm to calculate the DNI letter is as follows:

The number must be between 0 and 99999999.
Take the complete 8-digit number of the DNI, divide it by 23, and keep the remainder of the division (modulo 23).
Based on the result (from 0 to 22), it corresponds to one of the following letters: (T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E).
If the entered data is not a number, display a message that says "The entered data is incorrect" and ask again.
The process should repeat until the user enters a valid number.
Requirements:
Unit tests must be performed (minimum 70% coverage).
