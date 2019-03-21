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

/*
        Case case4 = new Case("Case4");
        caseRepo.save(case4);
        Case case3 = new Case("Case3",case4,null);
        caseRepo.save(case3);
        Case case2 = new Case("Case2",case3,null);
        caseRepo.save(case2);
        Case case1 = new Case("Case1",case2,null);
        caseRepo.save(case1);

        Thing thing1 = new Thing("Thing","3",case1);
        thingRepo.save(thing1);

        System.out.println("complete 1");

        Set<Case> s = thing1.findFullPath();
        System.out.println("complete 2");
        for(Iterator<Case> i = s.iterator(); i.hasNext();){
            System.out.println(i.next());
        }
*/
        return "main";
    }

    @PostMapping("/")
    public String find(@RequestParam String type, @RequestParam @Nullable String act, @RequestParam String wind, Map<String,Object> model) {
        // System.out.println("Type - " + type + " Act - " + act + " Wind - " + wind);
        Set<Thing> things;
        Set<Case> cases;

        if (type.equals("Thing")) {
            things = thingRepo.findByName(wind);

            for (Iterator<Thing> nt = things.iterator(); nt.hasNext(); ) {
                Thing t = nt.next();
                System.out.println(t);
            }
            model.put("things",things);
            return "main_output_things";
        }

        return "main";

    }
}
