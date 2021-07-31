package com.company;
 public class AcademicCourse extends Course
{
  private String lecturerName, level, credit, startingDate, completionDate;
  private int numberOfAssessments;
  private boolean isRegistered;
  
//passing the parameter to the constructor and calling the courseID, courseName, duration using super keyword.
//Empty string is assigned to the lecturerName, startingDate, completionDate. and isRegistered as false.
  
public AcademicCourse(String courseID, String courseName, int duration, String level, String credit, int numberOfAssessments){
         super(courseID,courseName,duration);
         this.lecturerName = lecturerName;
         this.level = level;
         this.credit = credit;
         lecturerName = "";
         startingDate = "";
         completionDate = "";
         isRegistered = false;
         
         }

//Getter method of each attribute
public String getlecturerName() {
        return lecturerName;
    }

public String getlevel() {
        return level;
    }

public String getcredit() {
        return credit;
    }

public String getstartingDate(){
        return startingDate;
    }
       
public String getcompletionDate() {
        return completionDate;
    }
    
public int getnumberOfAssessment() {
        return numberOfAssessments;
    }

public boolean getisRegistered() {
        return isRegistered;
    }

//setter method for lecturer name which accepts new lecturer name as a parameter.
public void setlecturerName(String lecturerName) {
    this.lecturerName = lecturerName;
    }

//setter method for number of assessments which accepts new number of assessments as a parameter.
public void setnumberOfAssessments(int numberOfAssessments){
    this.numberOfAssessments = numberOfAssessments;
    }
    
//The isRegistered method accepts total 4 parameters and if is registered is true then the appropritate meassage is displayed here.
public void isRegistered(String courseLeader, String lecturerName, String startingDate, String completionDate){
    if(isRegistered == false){
        setcourseleader(courseLeader);
        this.lecturerName = lecturerName;
        this.startingDate = startingDate;
        this.completionDate = completionDate;
        isRegistered = true;   
    }
    else{
        System.out.println("by" + lecturerName + "the course was started from" + startingDate + "and completed in" + completionDate);
        
        
    }
}

 public void Displayfull(){
    super.displayfull();
    if(isRegistered = true){
    System.out.println("The lecturername is: " + lecturerName);
    System.out.println("level: " + level);
    System.out.println("credit: " + credit);
    System.out.println("Started from: " + startingDate);
    System.out.println("Completed in" + completionDate);
    System.out.println("Total number of asssessments" + numberOfAssessments);
    } else {
        System.out.println("The A cademic course has not been registered yet.");
    }
}
         
     
     
    
     
      
  
  
  
}
