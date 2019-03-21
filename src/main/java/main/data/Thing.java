package main.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;

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
}
