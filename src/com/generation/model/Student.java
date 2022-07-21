package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course ){

        if(!isAttendingCourse(course.getCode())) //From Adam -- logic - if stdt is not enrolled in chosen course, add it to schedule/array List I believe
        courses.add(course);
        //TODO implement this method
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    //returns true if this student is attending the course specified by the argument courseCode
    public boolean isAttendingCourse( String courseCode )
    {
        //logic-- uses an enhanced for loop to iterate over class (the entry of courses) and we are checking to see if this code is equal to the code passed in the method call
        for(Course class : courses){
            if(class.getCode().equals(courseCode)) {
                return true;

                //TODO implement this method
            }
         }

        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
