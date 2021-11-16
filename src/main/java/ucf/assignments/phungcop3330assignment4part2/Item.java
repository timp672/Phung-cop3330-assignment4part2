package ucf.assignments.phungcop3330assignment4part2;

import java.time.LocalDate;

public class Item {

    private String name;
    private String description;
    private LocalDate date;


    public Item(String name, String description, LocalDate date){
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public Item() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
