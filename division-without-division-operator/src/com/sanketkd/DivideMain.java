package com.sanketkd;

/**
 * Divide two integers without using division, multiplication and mod operator.
 *
 * @author Sanket Kudalkar (sanket.4857@gmail.com)
 * @see <a href="https://github.com/SanketKD">SanketKD GitHub</a>
 */
public class DivideMain {

  public static void main(String[] args) throws Exception {

    System.out.println("-->> 100 / 5   = " + divide(1000, 5));
    System.out.println("-->> 10 / 3    = " + divide(10, 3));
    System.out.println("-->> 43 / 8    = " + divide(43, 8));
    System.out.println("-->> 43 / -8   = " + divide(43, -8));

  }

  /**
   * Perform division without using division, multiplication and mod operator.
   * 
   * @param numerator dividend
   * @param denominator divisor
   * @return Answer with no decimal places
   */
  private static Integer divide(Integer numerator, Integer denominator) {
    Integer answer = 0;

    Integer sign = ((numerator < 0) ^ (denominator < 0)) ? -1 : 1;
    numerator = Math.abs(numerator);
    denominator = Math.abs(denominator);

    while (numerator >= denominator) {
      numerator = numerator - denominator;
      answer++;
    }

    return answer * sign;
  }
}
