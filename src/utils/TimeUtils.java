/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Date;

/**
 *
 * @author Vitor Tozzi
 */
public class TimeUtils {
    
    public static final long HOUR = 3600*1000; // in milli-seconds
    
    public static Date addHours(Date oldDate, int hours){
        Date newDate = new Date(oldDate.getTime() + hours * HOUR);
        return newDate;
    }
    
    public static Date getDate(){
        return new Date();
    }
    
}
