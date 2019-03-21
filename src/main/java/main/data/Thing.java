package main.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import main.repos.CaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
public class Thing {
    @Id
    private String id;

    private String name;

    private String count;

    @Nullable
    private Case incase;
    @Nullable
    private String description;

    public Thing(String name, String count) {
        this.name = name;
        this.count = count;
    }

    public Thing(String name, String count, @Nullable Case incase) {
        this.name = name;
        this.count = count;
        this.incase = incase;
    }

    public Thing(String name, String count, @Nullable Case incase, @Nullable String description, @Nullable Type type) {
        this.name = name;
        this.count = count;
        this.incase = incase;
        this.description = description;
        this.type = type;
    }

    @Nullable
    private Type type;

   /* @Override
    public String toString() {
        return String.format(
                "Thing[name=%s, count='%s']",
                name, count);
    }*/

   public Set<Case> findFullPath(){ //Метод получения дерева всех коробок, в которой лежит штука
       Set<Case> listofcases = new HashSet<>();
       System.out.println("    find all path 0");
       System.out.println("    " + this);
       if(incase != null)
       {
           System.out.println("    find all path 1");
           listofcases.add(incase);
           System.out.println("    find all path 2");
           recursiveFinder(listofcases,incase);
           System.out.println("    find all path 3");
       }
       return listofcases;
   }

   private void recursiveFinder(Set<Case> listofcases, Case case_){ //Рекурсивный обход дерева из коробок
        if(case_.getIncase() != null){
            System.out.println("        рекурсия пошла 0");
            System.out.println("        " + case_.getIncase());
            listofcases.add(case_.getIncase());
            recursiveFinder(listofcases,case_.getIncase());
        }
   }

}
