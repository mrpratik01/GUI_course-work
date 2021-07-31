package com.company;
public class Course
{
private String courseID, courseName, courseLeader;
private int duration;

//passing the parameter to the course constructor 
public Course(String courseID, String courseName, int duration){
    this.courseID = courseID;
    this.courseName = courseName;
    this.duration = duration;
    courseLeader = "";
    
}

//getter method for each attributes
public String getcourseID() {
        return courseID;
    }

public String getcourseName() {
        return courseName;
    }
    
public int getduration() {
        return duration;
    }

public String getcourseLeader() {
    return courseLeader;
}

//setter method which accepts the new name of the course leader as the parameter
public void setcourseleader(String courseLeader){
    this.courseLeader = courseLeader;
    }
    
//All the output is diplayed with suitably annotated message
public void displayfull(){
    System.out.println("The courseID is:"+courseID);
    System.out.println("The courseName is:"+courseName);
    System.out.println("Total duration:"+duration);
    if(!courseLeader.equals("")){
        System.out.println("courseLeader:"+courseLeader);
    }
}


}