package main.repos;


import main.data.Case;
import main.data.Thing;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Set;

public interface CaseRepo extends MongoRepository<Case,String> {
    public Set<Case> findByIncase(Case incase); //коробки которые лежат этой коробке
    public Set<Case> findByThing(Thing thing); //Не понял как искать коробку, по вещи которая лежит в ней.
    public Set<Case> findByName(String name);
}
