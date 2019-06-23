package com.sanketkd;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * Date range domain class to hold start and end date
 *
 * @author Sanket Kudalkar (sanket.4857@gmail.com)
 * @see <a href="https://github.com/SanketKD">SanketKD GitHub</a>
 */
public class DateRange {

  private LocalDate startDate;

  private LocalDate endDate;

  public DateRange(LocalDate startDate, LocalDate endDate) {
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public static final Comparator<DateRange> START_DATE_COMPARATOR = (DateRange o1, DateRange o2) -> {
    if (o1.getStartDate() != null && o2.getStartDate() != null) {
      if (o1.getStartDate().isBefore(o2.getStartDate())) {
        return -1;
      }
      else {
        return o1.getStartDate().isAfter(o2.getStartDate()) ? 1 : 0;
      }
    }
    else if (o1.getStartDate() != null && o2.getStartDate() == null) {
      return -1;
    }
    else if (o1.getStartDate() == null && o2.getStartDate() != null) {
      return 1;
    }
    else {
      return 0;
    }
  };

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
    result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    DateRange other = (DateRange) obj;
    if (endDate == null) {
      if (other.endDate != null)
        return false;
    }
    else if (!endDate.equals(other.endDate))
      return false;
    if (startDate == null) {
      if (other.startDate != null)
        return false;
    }
    else if (!startDate.equals(other.startDate))
      return false;
    return true;
  }
}
