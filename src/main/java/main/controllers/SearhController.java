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

@Controller
public class SearhController {
    @Autowired
    ThingRepo thingRepo;
    @Autowired
    CaseRepo caseRepo;

    @GetMapping("/")
    public String greeting(Model model) {
        System.out.println("complete 0");

        return "main";
    }

    @PostMapping
    public String find(@RequestParam String type, @RequestParam @Nullable String act, @RequestParam String wind, Map<String,Object> model) {
        // System.out.println("Type - " + type + " Act - " + act + " Wind - " + wind);

        List<Thing> things;
        List<Case> cases;

        if (type.equals("Thing")) {
            things = thingRepo.findByName(wind);

            for (Iterator<Thing> nt = things.iterator(); nt.hasNext(); ) {
                Thing t = nt.next();
                System.out.println(t);

            }
            model.put("things",things);
            return "output";
        }
        if (type.equals("Case")) {
            cases = caseRepo.findByName(wind);

            for (Iterator<Case> nt = cases.iterator(); nt.hasNext(); ) {
                Case t = nt.next();
                System.out.println(t);

            }
        }
        return "main";

    }
}
