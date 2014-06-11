
/**
 * @author q797557
 */

public class Date {

    private int month;
    private int day;
    private int year;

    public void setDay(int num1) {

        day = day + num1;
    }
    public void setMonth(int num2) {

        if (num2 < 12)
        month = month + num2;
        else System.out.println("Out of range");
    }    
    public void setYear(int num3) {

        year = year + num3;
    }
    
    public int getDay(){
        
        return day;
    }
    public int getMonth(){
        
        return month;
    }
    public int getYear(){
        
        return year;
    }    
}
