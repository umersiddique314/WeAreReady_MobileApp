package rk.apenex.flightapp.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class TimeUtils {

    public static String getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a", Locale.getDefault());
        return sdf.format(calendar.getTime());
    }

    public static String getCurrentTimeZone() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("z", Locale.getDefault());
        sdf.setTimeZone(TimeZone.getDefault()); // Set the default time zone
        return sdf.format(calendar.getTime());
    }
}
