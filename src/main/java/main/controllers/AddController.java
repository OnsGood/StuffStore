package main.controllers;

import main.data.Thing;
import main.repos.CaseRepo;
import main.repos.ThingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class AddController {
    @Autowired
    ThingRepo thingRepo;

    @PostMapping("/addthing")
    public String addThing(@RequestParam String name, @RequestParam String count, Map<String, Object> model){
        Thing a = new Thing(name,count);
        System.out.println("start adding");
        thingRepo.save(a);
        return "addthing";
    }
}
