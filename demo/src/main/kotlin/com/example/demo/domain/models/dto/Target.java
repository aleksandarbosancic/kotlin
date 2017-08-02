/*
 * Copyright (c) 2017
 * AlphaGate Automatisierungstechnik, Rankweil, Austria  * 
 * @author      original: abo, last edit: $Author$
 * @version     $Id$
 */
package com.example.demo.domain.models.dto;

/**
 *
 * @author abosancic
 */
public class Target extends BaseDTO
{

    private Long foo;
    private int bar;
    private Long baz;
    private int qax;
    private String zip;
    private String dateFormated;

    public Long getFoo()
    {
        return foo;
    }

    public void setFoo(Long foo)
    {
        this.foo = foo;
    }

    public int getBar()
    {
        return bar;
    }

    public void setBar(int bar)
    {
        this.bar = bar;
    }

    public Long getBaz()
    {
        return baz;
    }

    public void setBaz(Long baz)
    {
        this.baz = baz;
    }

    public int getQax()
    {
        return qax;
    }

    public void setQax(int qax)
    {
        this.qax = qax;
    }

    public String getZip()
    {
        return zip;
    }

    public void setZip(String zip)
    {
        this.zip = zip;
    }

    public String getDateFormated()
    {
        return dateFormated;
    }

    public void setDateFormated(String dateFormated)
    {
        this.dateFormated = dateFormated;
    }
}
