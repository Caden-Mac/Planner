//Date,Subject,Minutes,Complete,Grade,Comments
import java.time.LocalDate;
public class Assignment {

private LocalDate date;
private String subject;
private int minutes;
private boolean complete;
private double grade;
private String comments;

Assignment(LocalDate d, String s, int m, boolean c1, double g, String c2) {
  date = d;
  subject = s;
  minutes = m;
  complete = c1;
  grade = g;
  comments = c2;
}

public LocalDate getDate() {
  return date;
}
public String getSubject() {
  return subject;
}
public int getMinutes() {
  return minutes;
}
public boolean getComplete() {
  return complete;
}
public String getComments() {
  return comments;
}

public String toString() {
  return String.format("%d, %s, %d, %b, %s", date.toEpochDay(), subject, minutes, complete, comments);
}
}