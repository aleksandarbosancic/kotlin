package com.example.demo.domain.models;

import java.util.Objects;

/**
 * A Breed.
 */
public class Breed extends AbstractAuditingEntity
{

    private Long id;

    private String image;

    private String name;

    private String localizationKey;

    private String imagePath;

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

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public String getImagePath()
    {
        return imagePath;
    }

    public void setImagePath(String imagePath)
    {
        this.imagePath = imagePath;
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

    public String getLocalizationKey()
    {
        return localizationKey;
    }

    public void setLocalizationKey(String localizationKey)
    {
        this.localizationKey = localizationKey;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        Breed breed = (Breed) o;

        if (!Objects.equals(id, breed.id))
        {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(id);
    }

    @Override
    public String toString()
    {
        StringBuilder toStringBuilder;
        toStringBuilder = new StringBuilder("Breed{");
        toStringBuilder.append("id=").append(this.id);
        toStringBuilder.append(",femaleWeight=").append(this.femaleWeight);
        toStringBuilder.append(",maleWeight=").append(this.maleWeight);
        toStringBuilder.append(",femaleHeight=").append(this.femaleHeight);
        toStringBuilder.append(",maleHeight=").append(this.maleHeight);
        toStringBuilder.append(",image=").append(this.image);
        toStringBuilder.append(",imagePath=").append(this.imagePath);
        toStringBuilder.append('}');
        return toStringBuilder.toString();
    }

}
