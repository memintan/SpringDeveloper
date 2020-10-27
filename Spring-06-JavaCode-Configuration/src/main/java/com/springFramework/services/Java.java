package com.springFramework.services;

import com.springFramework.interfaces.Course;
import com.springFramework.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



public class Java implements Course {

    private ExtraSessions extraSessions;


    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: "+(30+extraSessions.getHours()));
    }

    @Value("JD1")
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String[] days;

    @Override
    public String toString() {
        return "Java{" +
                "extraSessions=" + extraSessions +
                ", batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
