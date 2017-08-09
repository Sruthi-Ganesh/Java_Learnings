// BlueJ project: dayOfTheWeek
// Video: Day of the Week

public class WhatDayWillItBe
{
    public static void main(String[] args)
    {
    
        // Please do not change the name of this variable
        // We may change this value when we run your program
        // It will always be a date >= January 1, 1900
        Day birthday = new Day(1989,7,1);
        Day day = new Day(1900,1,1);
       
        // January 1, 1900 was a Monday
        // Compute the number of days from that day until the birthday
        int days =  birthday.daysFrom(day);
        // Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday
        int daysAfter = days+1;
        int weekday=  daysAfter % 7;
        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}
