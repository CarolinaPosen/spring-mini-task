package by.itacademy.mikhalevich.universe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Universe implements Printable {

    private List<Galaxy> galaxies;

    public void start(){
        System.out.println("Universe has been created");
    }

    public void finish(){
        System.out.println("Universe has been finished");
    }

}
