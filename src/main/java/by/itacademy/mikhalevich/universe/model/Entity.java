package by.itacademy.mikhalevich.universe.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entity implements Printable {
    protected int id;
    protected String name;
}