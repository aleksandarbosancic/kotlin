/*
 * Copyright (c) 2017
 * AlphaGate Automatisierungstechnik, Rankweil, Austria  * 
 * @author      original: abo, last edit: $Author$
 * @version     $Id$
 */
package com.example.demo.domain.models;

import java.time.LocalDateTime;

/**
 *
 * @author abosancic
 */
public class Source extends AbstractAuditingEntity
{

    private int foo;
    private Long bar;
    private int qax;
    private Long baz;
    private int zip;
    private LocalDateTime date;

    public int getFoo()
    {
        return foo;
    }

    public void setFoo(int foo)
    {
        this.foo = foo;
    }

    public Long getBar()
    {
        return bar;
    }

    public void setBar(Long bar)
    {
        this.bar = bar;
    }

    public int getQax()
    {
        return qax;
    }

    public void setQax(int qax)
    {
        this.qax = qax;
    }

    public Long getBaz()
    {
        return baz;
    }

    public void setBaz(Long baz)
    {
        this.baz = baz;
    }

    public int getZip()
    {
        return zip;
    }

    public void setZip(int zip)
    {
        this.zip = zip;
    }

    public LocalDateTime getDate()
    {
        return date;
    }

    public void setDate(LocalDateTime date)
    {
        this.date = date;
    }
}
