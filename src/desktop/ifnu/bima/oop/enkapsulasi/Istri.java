package desktop.ifnu.bima.oop.enkapsulasi;

import java.time.LocalDate;

public class Istri {

    private String name;
    private LocalDate birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
