package com.example.demo.Controller;

import com.example.demo.Entities.Campaign;
import com.example.demo.service.CampaignManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("campaign")
public class CampaignController {

    @Autowired
    CampaignManager campaignManager;

    @PostMapping("add")
    public Campaign save(@RequestBody Campaign campaign){
        return campaignManager.save(campaign);
    }

    @GetMapping("getAll")
    public List<Campaign> getAll(){
        return campaignManager.getAll();
    }

    @GetMapping("getById/{id}")
    public Campaign getById(@PathVariable Integer id){
        return campaignManager.getById(id);
    }

    @GetMapping("getByName/{name}")
    public Campaign getByName(@PathVariable String name){
        return campaignManager.getByName(name);
    }

    @PutMapping("update/{id}")
    public Campaign update(@PathVariable Integer id , @RequestBody Campaign campaign)throws Exception{
        return campaignManager.update(id,campaign);
    }

    @DeleteMapping("delete/{id}")
    public Boolean delete(@PathVariable Integer id){
        return campaignManager.delete(id);

    }

}