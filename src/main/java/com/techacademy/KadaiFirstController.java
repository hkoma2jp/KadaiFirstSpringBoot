package com.techacademy;

import java.text.SimpleDateFormat;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{today}")
    public String dispDayOfWeek(@PathVariable int today) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEEEEE", Locale.US);
        return sdf.format(today);
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
