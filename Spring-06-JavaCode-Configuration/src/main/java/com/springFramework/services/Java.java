package com.springFramework.services;

import com.springFramework.interfaces.Course;
import com.springFramework.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
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
}
