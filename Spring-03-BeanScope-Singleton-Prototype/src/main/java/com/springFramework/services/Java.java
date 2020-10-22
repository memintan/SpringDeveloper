package com.springFramework.services;

import com.springFramework.interfaces.Course;
import lombok.Data;


public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : 20");
    }
}
