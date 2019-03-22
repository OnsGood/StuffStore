package main.repos;

import main.data.Case;
import main.data.Thing;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Set;

public interface ThingRepo extends MongoRepository<Thing, String> {
    public List<Thing> findByIncase(Case incase);
    public List<Thing> findByName(String name);
}
