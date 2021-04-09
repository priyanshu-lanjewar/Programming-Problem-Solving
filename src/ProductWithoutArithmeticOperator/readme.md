#  COMPUTATION ( _X_ x _Y_ ) WITHOUT ARITHMETICAL OPERATORS

## Motivation : Sometimes the processors used in ultra low-power devices such as hearing aids do not have dedicated hardware for performing multiplication. A program that needs to perform multiplication must do so explicitly using lower-level primitives.

## Problem Statement : Write a program that multiplies two non-negative integers.
### The only operators you are allowed to use are
### • assignment,
### • the bitwise operators », «, |, &, “ and
### • equality checks and Boolean combinations thereof.
###You may use loops and functions that you write yourself. These constraints imply, for example, that you cannot use increment or decrement, or test if x < y.

##Test Case :
## Input : 
5<br>
4

## Output :
20

##The time complexity of addition is 0(n), where n is the width of the operands. Since we do n additions to perform a single multiplication, the total time complexity is 0(n<sup>2</sup>).
