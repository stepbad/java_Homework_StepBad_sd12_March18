# java_Homework_StepBad_sd12_March18
 java homework march 18

# java_Homework_StepBad_sd12_March18

 java homework march 18

# Exception Handling Enhancements Project

## Overview

This project involved modifying three Java programs to improve exception handling and ensure robust error management.

## Modifications

### **1. CountLetters.java**

- Added `try-catch` to handle `ArrayIndexOutOfBoundsException` for non-letter characters.
- Printed a message when an invalid character is encountered.
- Included **Javadocs** for documentation.

### **2. ParseInts.java**

- Wrapped `Integer.parseInt()` in a `try-catch` to handle `NumberFormatException`.
- Skipped non-integer values instead of crashing the program.
- Added **Javadocs** for clarity.

### **3. Factorials.java & MathUtils.java**

- Modified `MathUtils.factorial()` to throw `IllegalArgumentException` for:
  - Negative numbers (Factorial is undefined).
  - Numbers greater than 16 (Prevents integer overflow).
- Updated `Factorials.java` to **catch exceptions** and display appropriate messages.
- Added handling for **non-integer inputs** to prevent crashes.
- Included **Javadocs** for maintainability.

## Summary

**Exception Handling Added**  
**Javadocs Documentation Included**  
**Improved Input Validation & Error Messages**  
**Program Resilience Against Invalid Inputs**  