package org.example.spring_course.scope_lesson;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
