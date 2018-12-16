package ru.job4j.inheritance;

public class Doctor extends Profession {
    public Diagnose heal (Patient patient) {
        return new Diagnose();
    }
}