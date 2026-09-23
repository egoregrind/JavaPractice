package Zadachnik_1_1;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    private final int SECONDS_IN_HOUR = 3600;
    private final int SECONDS_IN_MINUTE = 60;
    private final int HOURS_IN_DAY = 24;

    public Time(int secondsFromStartOfDay) {
        hours = 0;
        minutes = 0;
        seconds = 0;
        if (secondsFromStartOfDay < 0) {
            addTime(0);
        } else {
            addTime(secondsFromStartOfDay);
        }
    }

    private void addTime(int secondsFromStartOfDay) {
        int remainder = secondsFromStartOfDay;

        hours += remainder / SECONDS_IN_HOUR;
        remainder -= hours * SECONDS_IN_HOUR;

        minutes += remainder / SECONDS_IN_MINUTE;
        remainder -= minutes * SECONDS_IN_MINUTE;

        seconds = remainder;
    }

    @Override
    public String toString() {
        String res = "";

        res += hours % HOURS_IN_DAY + ":";

        if (minutes < 10) {
            res += "0";
        }
        res += minutes + ":";

        if (seconds < 10) {
            res += "0";
        }
        res += seconds;

        return res;
    }
}
