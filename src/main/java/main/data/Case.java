package main.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;

import java.util.List;

@Data
@NoArgsConstructor
public class Case {
    @Id
    private String id;

    private String name;

    @Nullable
    private Case incase;

    @Nullable
    private List<Thing> thing;

    public Case(String name) {
        this.name = name;
    }

    public Case(String name, List<Thing> thing) {
        this.name = name;
        this.thing = thing;
    }

    public Case(String name, @Nullable Case incase, @Nullable List<Thing> thing) {
        this.name = name;
        this.incase = incase;
        this.thing = thing;
    }

    @Override
    public String toString() {
        if (incase != null) {
            return String.format(
                    "Case[id=%s, name='%s', case='%s']",
                    id, name, incase.getName());
        } else {
            return String.format(
                    "Case[id=%s, name='%s', it's main case]",
                    id, name);
        }
    }
}
