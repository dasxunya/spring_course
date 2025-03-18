package org.example.spring_course.scope_lesson;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    public void doMyInitialization() {
        System.out.println("ClassicalMusic.doMyInitialization");
    }

    public void doMyDestruction() {
        System.out.println("ClassicalMusic.doMyDestruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
