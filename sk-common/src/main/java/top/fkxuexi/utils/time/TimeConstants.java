package top.fkxuexi.utils.time;

import org.apache.http.HttpStatus;

public class TimeConstants {

    public enum Fromat{
        YMD("yyyyMMdd"),
        YMD_("yyyy-MM-DD"),
        YMD_ZH("yyyy年MM月dd日"),

        YMDHMS_("yyyy-MM-dd HH:mm:ss"),
        YMDHMS_ZH("yyyy年MM月dd日 HH时mm分ss秒"),
        HMS("HH:mm:ss"),
        HMS_ZH("HH时mm分ss秒");

        private String pattern;
        Fromat(String pattern){
            this.pattern = pattern;
        }


       public String getPattern(){
            return this.pattern;
       }


    }





}

