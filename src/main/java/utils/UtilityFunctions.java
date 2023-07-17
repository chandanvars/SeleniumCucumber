package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilityFunctions {

    public static String getTodaysDateInyyyymmddFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }
}
