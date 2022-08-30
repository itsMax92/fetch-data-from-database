package com.fetch.data.fetchdatafromdatabase.model;

import javax.persistence.*;

@Entity
@Table(name = "brands")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brand_id")
    private int id;

    @Column(name = "brand_title")
    private String brandTitle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandTitle() {
        return brandTitle;
    }

    public void setBrandTitle(String brandTitle) {
        this.brandTitle = brandTitle;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandTitle='" + brandTitle + '\'' +
                '}';
    }
}
