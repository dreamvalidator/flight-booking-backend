package com.ps.flightbooking.utility;

import java.util.*;
public class Distance {

    public static final Map<String, Integer> CITY_PAIRS= new HashMap<>();

    static{
        CITY_PAIRS.put("MUMBAI-DELHI", 1500);

        CITY_PAIRS.put("MUMBAI-CHENNAI", 1500);

        CITY_PAIRS.put("CHENNAI-MUMBAI", 1500);

        CITY_PAIRS.put("DELHI-BANGLURU", 3200);

        CITY_PAIRS.put("BANGLURU-DELHI", 3200);

        CITY_PAIRS.put("DELHI-KOLKATA", 1300);

        CITY_PAIRS.put("KOLKATA-DELHI", 1300);

        CITY_PAIRS.put("DELHI-MUMBAI",2500);

        CITY_PAIRS.put("DELHI-CHENNAI", 4700);

    }

}
