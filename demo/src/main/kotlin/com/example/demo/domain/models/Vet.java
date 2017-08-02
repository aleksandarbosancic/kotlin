package com.example.demo.domain.models;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Vet.
 */
public class Vet extends AbstractAuditingEntity implements Serializable
{

    private Long id;

    private String name;

    private String email;

    private String address;

    private Double latitude;

    private Double longitude;

    private String phone;

    private String placeId;

    private String website;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public void setLatitude(Double latitude)
    {
        this.latitude = latitude;
    }

    public Double getLongitude()
    {
        return longitude;
    }

    public void setLongitude(Double longitude)
    {
        this.longitude = longitude;
    }

    public String getPlaceId()
    {
        return placeId;
    }

    public void setPlaceId(String placeId)
    {
        this.placeId = placeId;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
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

        Vet vet = (Vet) o;

        return Objects.equals(id, vet.id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(id);
    }

    @Override
    public String toString()
    {
        return "Vet{"
                + "id=" + id
                + ", name='" + name + "'"
                + ", email='" + email + "'"
                + ", address='" + address + "'"
                + ", latitude='" + latitude + "'"
                + ", longitude='" + longitude + "'"
                + ", phone='" + phone + "'"
                + '}';
    }
}
