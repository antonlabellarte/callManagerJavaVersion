package com.example.callManagerProjects.controller;

import com.example.callManagerProjects.model.CampaignModel;
import com.example.callManagerProjects.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CampaignController {

    @Autowired
    private CampaignRepository campaignRepository;

    // Recupera tutte le campagne
    @GetMapping("/campaigns")
    public String showAllCampaigns(Model model) {
        List<CampaignModel> campaigns = campaignRepository.findAll();
        model.addAttribute("campaigns", campaigns); // il nome deve corrispondere al template
        return "campaigns/campaignsIndex.html"; // nome del template senza .html
    }
}
