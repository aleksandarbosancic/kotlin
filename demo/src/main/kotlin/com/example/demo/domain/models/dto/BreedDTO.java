/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.domain.models.dto;

/**
 *
 * @author abosancic
 */
public class BreedDTO extends BaseDTO
{

    private Long id;

    private String name;

    private String localizationKey;

    private String image;

    private Double femaleWeight;

    private Double maleWeight;

    private Double femaleHeight;

    private Double maleHeight;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public Double getFemaleWeight()
    {
        return femaleWeight;
    }

    public void setFemaleWeight(Double femaleWeight)
    {
        this.femaleWeight = femaleWeight;
    }

    public Double getMaleWeight()
    {
        return maleWeight;
    }

    public void setMaleWeight(Double maleWeight)
    {
        this.maleWeight = maleWeight;
    }

    public Double getFemaleHeight()
    {
        return femaleHeight;
    }

    public void setFemaleHeight(Double femaleHeight)
    {
        this.femaleHeight = femaleHeight;
    }

    public Double getMaleHeight()
    {
        return maleHeight;
    }

    public void setMaleHeight(Double maleHeight)
    {
        this.maleHeight = maleHeight;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocalizationKey()
    {
        return localizationKey;
    }

    public void setLocalizationKey(String localizationKey)
    {
        this.localizationKey = localizationKey;
    }

}
