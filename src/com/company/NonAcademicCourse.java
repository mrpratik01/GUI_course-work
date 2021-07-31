package com.company;
public class NonAcademicCourse extends Course
{
    private String instructorName, startDate, completionDate, examDate, prerequisite;
    int duration;
    boolean isRegistered;
    boolean isRemoved;
    
//passing the parameter to the constructor and calling the courseID, courseName, duration using super keyword.
//Start date, completion date, exam date are assigned as a empty string and is registered and is removed are assigned as a false
public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite){
    super(courseID, courseName, duration);
    instructorName = "";
    startDate = "";
    completionDate = "";
    examDate = "";
    prerequisite = "";
    isRegistered = false;
    isRemoved = false;
}

//getter method for all the attribute
public String getinstructorName() {
        return instructorName;
    }

public String getstartDate(){
        return startDate;
    }
    
public String getcompletionDate() {
        return completionDate;
    }
    
public String getexamDate() {
        return examDate;
    }

public String getprerequisite(){
    return prerequisite;
}

public int getduration(){
    return duration;
}

public boolean getisRegistered() {
        return isRegistered;
    }

public boolean getisRemoved(){
    return isRemoved;
}


//setter method for istructor name which accepts new name as a parameter if only the isregistered is false otherwise suitably annoted message is printed 
public void setinstructorName(String instructorName) {
    if(isRegistered == false){
        this.instructorName = instructorName;
        
    }else {
        System.out.println("The Instructor name cannot be changed. Try again later");
    }
}

//The isRegistered method accepts total 5 parameters and if is registered is true then the appropritate meassage is displayed here .
public void isRegistered(String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
    if (isRegistered ==false){
        setcourseleader(courseLeader);
        this.instructorName = instructorName;
        this.startDate = startDate;
        this.completionDate = completionDate;
        this.examDate = examDate;
        isRegistered = false;
    }else{
        System.out.println("The course is already Registered");
    }
}


// While non academic course is removed then suitably annoted message is printed here or if it is not removed then all the instances are set to empty string 
public void isRemoved(){
    if(isRemoved == true){
        System.out.println("The non-academic has been already removed");
        
    }else{
        setcourseleader("");
        instructorName = "";
        startDate = "";
        completionDate = "";
        examDate = "";
        isRegistered = true;
        isRemoved = true;
        
        
    }
}


//All the output is diplayed with suitably annotated message
public void Displayfull(){
    super.displayfull();
    
    System.out.println("The Instructor name is: " + instructorName);
    System.out.println("Started from: " + startDate);
    System.out.println("Completed in: " + completionDate);
    System.out.println("Exam date: " + examDate);
    
}
}
