package com.company;

public class Switch {

    public static String jdk14(Month month) {
        var result = switch (month) {
            case FEB -> "february";
            case MAR -> "march";
            case APR -> "april";
            case MAY -> "may";
            case JUN -> "juny";
            case JUL -> "july";
            case AUG -> "august";
            case SEP -> "september";
            case OCT -> "october";
            case NOV -> "november";
            case DEC -> "december";
            default -> "january";
        };

        var time = "";
        switch(month){
            case DEC, JAN, FEB ->{time = "winter";}
            case MAR, APR, MAY ->{time = "spring";}
            case JUN, JUL, AUG ->{time = "summer".toUpperCase();}
            case SEP, OCT, NOV ->{time = "autumn";}
        }

        return String.valueOf(result.charAt(0)).toUpperCase() +
                result.substring(2) + String.format("(is %s)", time);
    }

}
    enum Month{
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }

