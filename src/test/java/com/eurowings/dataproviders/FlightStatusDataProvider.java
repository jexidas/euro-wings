package com.eurowings.dataproviders;

import java.util.List;
import org.testng.annotations.DataProvider;

public class FlightStatusDataProvider {

    @DataProvider()
    public static Object[][] flightRoutesPositiveDataProvider() {
        return new Object[][]{
                {"CGN", "BER", "2023-04-22", List.of(List.of("11:25 AM", "12:35 PM", "EW6"))},
                {"CGN", "BER", "2023-04-24", List.of(
                        List.of("6:20 AM", "7:30 AM", "EW12"),
                        List.of("10:05 AM", "11:15 AM", "EW14"),
                        List.of("5:30 PM", "6:40 PM", "EW50"),
                        List.of("6:45 PM", "7:55 PM", "EW8055"),
                        List.of("8:25 AM", "9:35 AM", "EW8059"),
                        List.of("4:15 PM", "5:25 PM", "EW8071")
                )}
        };
    }

    @DataProvider()
    public static Object[][] flightRoutesNegativeDataProvider() {
        return new Object[][]{
                {"BER", "ADA", "2023-04-23"}
        };
    }
}
