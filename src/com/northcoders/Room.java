package com.northcoders;

import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private ArrayList<Choice> choices = new ArrayList();

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
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

    public ArrayList<Choice> getChoices() {
        return choices;
    }

    public void addChoice (Choice newChoice) {
        choices.add(newChoice);
    }

}
