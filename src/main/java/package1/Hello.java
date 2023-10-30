package package1;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class Hello {

public String getTimeByCountry(String country) {
  DateTimeZone zone = DateTimeZone.forID(country);
  DateTime hour = DateTime.now(zone);
  return hour.getHourOfDay()+":"+hour.getMinuteOfHour();}
}
