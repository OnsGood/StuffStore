package main;

import main.data.Case;
import main.data.Thing;
import main.repos.CaseRepo;
import main.repos.ThingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {
    /*@Autowired
    private ThingRepo repository;
    @Autowired
    private CaseRepo caseRep;*/


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception { // ручные тесты бд
        System.out.println("join into run mode");
        repository.deleteAll();
        caseRep.deleteAll();

        Case newcase = new Case("Main Box");
        Case smallcase = new Case("Small Box", newcase,null);
        Thing thing = new Thing("second","15",newcase);
        caseRep.save(newcase);
        caseRep.save(smallcase);
        repository.save(thing);

        System.out.println("box findby");

        for(Case incase : caseRep.findByIncase(newcase)){
            System.out.println("succes");
            System.out.println(incase);
        }

    }*/
}
