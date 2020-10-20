package cc.mrbird.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author MrBird
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
// @Component
public class User {
    private String name;
    private Integer age;
}
