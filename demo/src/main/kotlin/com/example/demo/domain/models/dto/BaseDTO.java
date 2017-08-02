/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.domain.models.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author abosancic
 */
public abstract class BaseDTO implements Serializable
{

    private String createdBy;

    private LocalDateTime createdDate;

    private String lastModifiedBy;

    private LocalDateTime lastModifiedDate;

    public BaseDTO()
    {
    }

    public String getCreatedBy()
    {
        return createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    public String getLastModifiedBy()
    {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy)
    {
        this.lastModifiedBy = lastModifiedBy;
    }

    public LocalDateTime getCreatedDate()
    {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate)
    {
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastModifiedDate()
    {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate)
    {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public String toString()
    {
        StringBuilder toStringBuilder;
        toStringBuilder = new StringBuilder("BaseDTO{");
        toStringBuilder.append("createdBy=").append(this.createdBy);
        toStringBuilder.append(",createdDate=").append(this.createdDate);
        toStringBuilder.append(",lastModifiedBy=").append(this.lastModifiedBy);
        toStringBuilder.append(",lastModifiedDate=").append(this.lastModifiedDate);
        toStringBuilder.append('}');
        return toStringBuilder.toString();
    }

}
