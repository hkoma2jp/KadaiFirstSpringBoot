package com.techacademy;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{dateStr}")
    public String dispDayOfWeek(@PathVariable String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
            Date date = sdf.parse(dateStr);
            System.out.println(dateStr);
            String dayOfWeek = new SimpleDateFormat("EEEEEEE", Locale.ENGLISH).format(date);
            return dayOfWeek;
        } catch (ParseException e) {
            return "<h1>形式が違います。yyyymmddの形式でパラメータを送信してください。</h1>";
        }
    }

    @GetMapping("plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = val1 + val2;
        return "" + res;
    }

    @GetMapping("minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = val1 - val2;
        return "" + res;
    }

    @GetMapping("times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = val1 * val2;
        return "" + res;
    }

    @GetMapping("divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = val1 / val2;
        return "" + res;
    }

}
