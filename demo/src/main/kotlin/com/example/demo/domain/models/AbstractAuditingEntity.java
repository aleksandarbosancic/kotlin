package com.example.demo.domain.models;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Base abstract class for entities which will hold definitions for created, last modified by and created,
 * last modified by date.
 */
public abstract class AbstractAuditingEntity implements Serializable {

    private String createdBy;

    private LocalDateTime createdDate;

    private String lastModifiedBy;

    private LocalDateTime lastModifiedDate = LocalDateTime.now();
    
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        throw new UnsupportedOperationException("It's not possible to edit 'createdBy' value for : " + this.getClass().getSimpleName());
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        throw new UnsupportedOperationException("It's not possible to edit 'createdDate' value for : " + this.getClass().getSimpleName());
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public boolean notEquals(Object obj)
    {
        return !equals(obj);
    }
    
    @Override
    public String toString() {
            StringBuilder toStringBuilder;
            toStringBuilder = new StringBuilder("AbstractAuditingEntity{");
            toStringBuilder.append("createdBy=").append(this.createdBy);
            toStringBuilder.append(",createdDate=").append(this.createdDate);
            toStringBuilder.append(",lastModifiedBy=").append(this.lastModifiedBy);
            toStringBuilder.append(",lastModifiedDate=").append(this.lastModifiedDate);
            toStringBuilder.append('}');
            return toStringBuilder.toString();
    }

}
