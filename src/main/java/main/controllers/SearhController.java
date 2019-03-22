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

import java.util.*;

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

        if (type.equals("Thing") && act.equals("Name")) { // Thing to Name -----------------------------------------
            if(!wind.isEmpty() && wind!=null) {
                things = thingRepo.findByName(wind);
                model.put("things", things);
            }else{
                things = thingRepo.findAll();
                model.put("things", things);
            }
            return "main_output_things";
        }
        if (type.equals("Thing") && act.equals("inCase")) {// Thing to Case -----------------------------------------
            if(!wind.isEmpty() && wind!=null) {
                cases = caseRepo.findByName(wind);
                things = new ArrayList<>();
                for(Iterator<Case> it = cases.iterator(); it.hasNext();){
                    Set<Thing> a = it.next().getThing();
                    if(a != null)
                        for(Iterator<Thing> it2 = a.iterator(); it2.hasNext();) {
                            things.add(it2.next());
                        }
                }
                model.put("things",things);
            }else{
                things = thingRepo.findAll();
                model.put("things", things);
            }
            return "main_output_things";
        }
        if (type.equals("Case") && act.equals("Name")) {// Case to Name -----------------------------------------
            if(!wind.isEmpty() && wind!=null) {
                cases = caseRepo.findByName(wind);
                model.put("cases", cases);
                return "main_output_cases";
            }else{
                cases = caseRepo.findAll();
                model.put("cases", cases);
                return "main_output_cases";
            }
        }
        if (type.equals("Case") && act.equals("inCase")) {// Case to Case -----------------------------------------
            if(!wind.isEmpty() && wind!=null) {
                Case a = caseRepo.findByName(wind).get(0);
                cases = caseRepo.findByIncase(a);
                model.put("cases", cases);
                return "main_output_cases";
            }else{
                cases = caseRepo.findAll();
                model.put("cases", cases);
                return "main_output_cases";
            }
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
