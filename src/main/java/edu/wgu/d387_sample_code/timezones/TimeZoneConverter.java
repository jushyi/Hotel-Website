package edu.wgu.d387_sample_code.timezones;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:4200")
public class TimeZoneConverter {

    public static String getTimes(){

        ZonedDateTime time = ZonedDateTime.now();
        //B3. b. requires hours and minutes to be displayed. Using DateTimeFormatter to format the time.
        DateTimeFormatter displayFormat = DateTimeFormatter.ofPattern("HH:mm");

        //assigning zoneIDs to variables
        ZoneId zEastern = ZoneId.of("America/New_York");
        ZoneId zPacific = ZoneId.of("America/Los_Angeles");
        ZoneId zUTC = ZoneId.of("UTC");

        ZonedDateTime ET = time.withZoneSameInstant(zEastern);
        ZonedDateTime MT = time.withZoneSameInstant(zPacific);
        ZonedDateTime UTC = time.withZoneSameInstant(zUTC);

        return ET.format(displayFormat) + " ET, "
                + MT.format(displayFormat) + " MT, "
                + UTC.format(displayFormat) + " UTC.";

    }

}
