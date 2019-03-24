package main.repos;
import main.data.Case;
import main.data.Thing;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CaseRepo extends MongoRepository<Case,String> {
    public List<Case> findByIncase(Case incase); //коробки которые лежат этой коробке
    public List<Case> findByThing(Thing thing); //Не понял как искать коробку, по вещи которая лежит в ней, этим занимается метод в контроллере.
    public List<Case> findByName(String name);
}
