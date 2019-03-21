package main.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;

import java.util.List;

@Data
@NoArgsConstructor
public class Type {


    private String id;

    private String name;

    @Nullable
    private List<Thing> things;

    public Type(String name) {
        this.name = name;
    }

    public Type(String name, @Nullable List<Thing> things) {
        this.name = name;
        this.things = things;
    }
}
