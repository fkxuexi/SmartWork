package top.fkxuexi.utils.time;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class TimeUtils {

    public static String format(DateTime dateTime,TimeConstants.Fromat format){
        DateTimeFormatter df = DateTimeFormat.forPattern(format.getPattern());
        return dateTime.toString(df);
    }



}
