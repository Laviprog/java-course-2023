package edu.hw5.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ParameterAssignment")
public class Fridays13th {
    private static final int DAY = 13;

    public List<LocalDate> fridays13th(int year) {
        LocalDate localDate = LocalDate.of(year, 1, DAY);
        List<LocalDate> fridays = new ArrayList<>();
        while (localDate.getYear() == year) {
            if (localDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
                fridays.add(localDate);
            }
            localDate = localDate.plusMonths(1);
        }
        return fridays;
    }

    public LocalDate nextFriday(LocalDate localDate) {
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.next(DayOfWeek.FRIDAY);
        do {
            localDate = localDate.with(temporalAdjuster);
        } while (localDate.getDayOfMonth() != DAY);
        return localDate;
    }
}
