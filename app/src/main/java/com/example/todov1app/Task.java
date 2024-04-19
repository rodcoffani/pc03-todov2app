package com.example.todov1app;

import java.io.Serializable;
import java.util.Objects;

public class Task implements Serializable {
    String name, description, priority;

    public Task(String name, String description, String priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
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

    public String getPriority() { return priority; }

    public void setPriority(String priority) { this.priority = priority; }

    public boolean updatePriority() {
        if (Objects.equals(getPriority().toLowerCase(), "low")) {
            setPriority("Medium");
        } else if (Objects.equals(getPriority().toLowerCase(), "medium")) {
            setPriority("High");
        } else {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getName();
    }
}
