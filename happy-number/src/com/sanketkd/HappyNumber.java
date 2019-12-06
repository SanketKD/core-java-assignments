package com.sanketkd;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Check if given number is unhappy number or not
 *
 * @author Sanket Kudalkar (sanket.4857@gmail.com)
 * @see <a href="https://github.com/SanketKD">SanketKD GitHub</a>
 */
public class HappyNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("--UNHAPPY-NUMBER--");
    System.out.print("Enter an integer number : ");
    Integer number = input.nextInt();
    input.close();
    System.out.println("You entered : " + number);
    System.out.println(isHappyNumber(number, null) ? "Happy number" : "Unhappy number");
  }

  /**
   * Check if number is a happy number or not
   * 
   * @param number {@link Integer} number to check
   * @param checkedNumbers {@link Set} of checked numbers to be used in recursion
   * @return True, if number is a happy number or else false
   */
  private static boolean isHappyNumber(Integer number, Set<Integer> checkedNumbers) {
    if (checkedNumbers == null) {
      checkedNumbers = new HashSet<>();
    }
    Integer newNumber = 0;
    int length = number.toString().length();
    for (int index = 0; index < length; index++) {
      Integer currentDigit = number % 10;
      newNumber = newNumber + (currentDigit * currentDigit);
      number = number / 10;
    }
    if (newNumber.equals(1)) {
      return true;
    }
    else if (checkedNumbers.contains(newNumber)) {
      return false;
    }
    else {
      checkedNumbers.add(newNumber);
      return isHappyNumber(newNumber, checkedNumbers);
    }
  }
}
