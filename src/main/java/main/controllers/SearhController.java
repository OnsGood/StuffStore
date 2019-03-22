package main.controllers;

import main.data.Case;
import main.data.Thing;
import main.repos.CaseRepo;
import main.repos.ThingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
public class SearhController {
    @Autowired
    ThingRepo thingRepo;
    @Autowired
    CaseRepo caseRepo;

    @GetMapping("/")
    public String greeting(Model model) {
        //System.out.println("complete 0");
        //thingRepo.save(new Thing("a","b"));
        return "main";
    }

    @PostMapping("path")
    public String path(){
        return "full_path_to_thing";
    }

    @PostMapping("/")
    public String find(@RequestParam String type, @RequestParam @Nullable String act, @RequestParam String wind, Map<String,Object> model) {
        // System.out.println("Type - " + type + " Act - " + act + " Wind - " + wind);
        List<Thing> things;
        List<Case> cases;
        if (type.equals("Thing")) {
            if(!wind.isEmpty() && wind!=null) {
                things = thingRepo.findByName(wind);
                model.put("things", things);
            }else{
                things = thingRepo.findAll();
                model.put("things", things);
            }
            return "main_output_things";
        }
        return "main";
    }

    @GetMapping("/addthing")
    public String addThing(){
        return "addthing";
    }
    @GetMapping("addcase")
    public String addCase(){
        return "addcase";
    }
}
