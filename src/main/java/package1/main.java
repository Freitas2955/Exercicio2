package package1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class main {
    public static void main(String[] args) {
        Hello time=new Hello();
        System.out.println(time.getTimeByCountry("Europe/Lisbon"));
    }
}
