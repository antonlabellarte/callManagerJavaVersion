package com.example.callManagerProjects.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "campaigns")
public class CampaignModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    public CampaignModel() {}

     public CampaignModel(String name, String description, LocalDate startDate, LocalDate endDate) {
        this.name = name;
    }

    // Getter e Setter
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
