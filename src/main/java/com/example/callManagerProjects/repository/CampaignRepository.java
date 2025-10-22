package com.example.callManagerProjects.repository;

import com.example.callManagerProjects.model.CampaignModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends JpaRepository<CampaignModel, Integer> {
    // Puoi aggiungere query personalizzate se necessario
}
