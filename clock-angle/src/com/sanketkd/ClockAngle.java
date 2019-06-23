package com.sanketkd;

/**
 * Find angle between hour and minute hands of clock
 *
 * @author Sanket Kudalkar (sanket.4857@gmail.com)
 * @see <a href="https://github.com/SanketKD">SanketKD GitHub</a>
 */
public class ClockAngle {

  public static void main(String[] args) {
    Integer hour = 12;
    Integer minute = 30;

    System.out.println("## INPUT--->");
    System.out.println(hour + ":" + minute);

    Integer angle = findAngle(hour, minute);

    System.out.println("## OUTPUT-->");
    System.out.println("ANGLE = " + angle + "°");
  }

  /**
   * Find angle between hour and minute hands
   * 
   * @param hour of the time
   * @param minute of the time
   * @return angle
   */
  public static Integer findAngle(Integer hour, Integer minute) {
    Integer hourHandAngle = (hour * 30);
    Integer hourMinuteAssociateAngle = minute != 0 ? (30 / (60 / minute)) : 0;
    Integer minuteHandAngle = (minute * 6);

    Integer angle = Math.abs((hourHandAngle + hourMinuteAssociateAngle) - minuteHandAngle);

    if (angle > 180) {
      angle = 360 - angle;
    }
    return angle;
  }
}