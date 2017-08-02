/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author abosancic
 */
public class DateMapper
{

    public String asString(Date date)
    {
        return date != null ? new SimpleDateFormat("yyyy-MM-dd")
                .format(date) : null;
    }

    public String asString(LocalDate date)
    {
        return date != null ? new SimpleDateFormat("yyyy-MM-dd")
                .format(date) : null;
    }
    
    public String asString(LocalDateTime date)
    {
        return date != null ? new SimpleDateFormat("yyyy-MM-dd")
                .format(date) : null;
    }

    public Date asDate(String date)
    {
        try
        {
            return date != null ? new SimpleDateFormat("yyyy-MM-dd")
                    .parse(date) : null;
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    public LocalDateTime asLocalDateTime(String date)
    {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
            return date != null ? dateTime : null;
    }
}
