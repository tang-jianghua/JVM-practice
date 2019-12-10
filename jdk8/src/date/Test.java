package date;

import java.text.DateFormat;
import java.text.Format;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Instant now = Instant.now();
        Date.from(now);
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        System.out.println(date);
        Instant instant1 = date.toInstant();
        System.out.println(instant1);
    }
}
