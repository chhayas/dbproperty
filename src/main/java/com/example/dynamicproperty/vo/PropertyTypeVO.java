package com.example.dynamicproperty.vo;

import java.util.Date;

public class PropertyTypeVO {
    private Long id;
    private String propertyDataType;
    private String description;
    private Date createdOn;
    private Date updatedOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropertyDataType() {
        return propertyDataType;
    }

    public void setPropertyDataType(String propertyDataType) {
        this.propertyDataType = propertyDataType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
