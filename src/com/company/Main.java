package com.company;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setTitle("Course Registration");

        frame.setLayout(null);
        frame.setSize(1000,900);
        frame.setResizable(false);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setBounds(0,0,500,900);
        panel1.setLayout(null);
        frame.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.DARK_GRAY);
        panel2.setBounds(500,0,500,900);
        panel2.setLayout(null);
        frame.add(panel2);

        //Academic Course Title

        JLabel labelTitle1 = new JLabel();
        labelTitle1.setText("Academic Course");
        labelTitle1.setBounds(85,10,400,25);
        labelTitle1.setForeground(Color.BLACK);
        labelTitle1.setFont(new Font("Arial", Font.BOLD, 32));
        panel1.add(labelTitle1);

        //Non-Academic Course Title

        JLabel labelTitle2 = new JLabel();
        labelTitle2.setText(" Non-Academic Course");
        labelTitle2.setForeground(Color.WHITE);
        labelTitle2.setFont(new Font("Arial", Font.BOLD, 32));
        labelTitle2.setBounds(70,10,400,25);
        panel2.add(labelTitle2);

        //Academic Course CourseID

        JLabel labelID1 = new JLabel();
        labelID1.setText("Course ID : ");
        labelID1.setForeground(Color.BLACK);
        labelID1.setFont(new Font("Arial", Font.BOLD, 24));
        labelID1.setBounds(40,80,150,20);
        panel1.add(labelID1);

        JTextField textFieldID1 = new JTextField();
        textFieldID1.setBounds(180,80,150,20);
        textFieldID1.setForeground(Color.BLACK);
        textFieldID1.setBackground(Color.WHITE);
        panel1.add(textFieldID1);

        //Non-Academic Course CourseID

        JLabel labelID2 = new JLabel();
        labelID2.setText("Course ID : ");
        labelID2.setForeground(Color.WHITE);
        labelID2.setFont(new Font("Arial", Font.BOLD, 24));
        labelID2.setBounds(40,80,150,20);
        panel2.add(labelID2);

        JTextField textFieldID2 = new JTextField();
        textFieldID2.setBounds(180,80,150,20);
        textFieldID2.setForeground(Color.BLACK);
        textFieldID2.setBackground(Color.WHITE);
        panel2.add(textFieldID2);

        //Academic Course CourseName

        JLabel labelName1 = new JLabel();
        labelName1.setText("Course Name : ");
        labelName1.setForeground(Color.black);
        labelName1.setFont(new Font("Arial", Font.BOLD, 24));
        labelName1.setBounds(40,130,300,20);
        panel1.add(labelName1);

        JTextField textFieldName1 = new JTextField();
        textFieldName1.setBounds(220,130,150,20);
        panel1.add(textFieldName1);

        //Non-Academic CourseName

        JLabel labelName2 = new JLabel();
        labelName2.setText("Course Name : ");
        labelName2.setForeground(Color.WHITE);
        labelName2.setFont(new Font("Arial", Font.BOLD, 24));
        labelName2.setBounds(40,130,300,20);
        panel2.add(labelName2);

        JTextField textFieldName2 = new JTextField();
        textFieldName2.setBounds(220,130,150,20);
        panel2.add(textFieldName2);

        //Academic Course Duration

        JLabel labelDuration1 = new JLabel();
        labelDuration1.setText("Duration : ");
        labelDuration1.setForeground(Color.BLACK);
        labelDuration1.setFont(new Font("Arial", Font.BOLD, 24));
        labelDuration1.setBounds(40,180,300,20);
        panel1.add(labelDuration1);

        JTextField textFieldDuration1 = new JTextField();
        textFieldDuration1.setBounds(170, 180,150,20);
        panel1.add(textFieldDuration1);

        //Non-Academic Course Duration

        JLabel labelDuration2 = new JLabel();
        labelDuration2.setText("Duration : ");
        labelDuration2.setForeground(Color.WHITE);
        labelDuration2.setFont(new Font("Arial", Font.BOLD, 24));
        labelDuration2.setBounds(40,180,300,20);
        panel2.add(labelDuration2);

        JTextField textFieldDuration2 = new JTextField();
        textFieldDuration2.setBounds(170, 180,150,20);
        panel2.add(textFieldDuration2);

        //Academic Course Level

        JLabel labelLevel = new JLabel();
        labelLevel.setText("Level : ");
        labelLevel.setForeground(Color.BLACK);
        labelLevel.setFont(new Font("Arial", Font.BOLD, 24));
        labelLevel.setBounds(40,230,300,20);
        panel1.add(labelLevel);

        JTextField textFieldLevel = new JTextField();
        textFieldLevel.setBounds(140, 230,150,20);
        panel1.add(textFieldLevel);

        //Academic Course Credit

        JLabel labelCredit = new JLabel();
        labelCredit.setText("Credit : ");
        labelCredit.setForeground(Color.BLACK);
        labelCredit.setFont(new Font("Arial", Font.BOLD, 24));
        labelCredit.setBounds(40,280,300,20);
        panel1.add(labelCredit);

        JTextField textFieldCredit = new JTextField();
        textFieldCredit.setBounds(140, 280,150,20);
        panel1.add(textFieldCredit);

        //Academic Course Number Assessments

        JLabel labelNumberOfAssessments = new JLabel();
        labelNumberOfAssessments.setText("NumberOfAssessments : ");
        labelNumberOfAssessments.setForeground(Color.BLACK);
        labelNumberOfAssessments.setFont(new Font("Arial", Font.BOLD, 24));
        labelNumberOfAssessments.setBounds(40,330,300,20);
        panel1.add(labelNumberOfAssessments);

        JTextField textFieldNumberOfAssessments = new JTextField();
        textFieldNumberOfAssessments.setBounds(340, 330,150,20);
        panel1.add(textFieldNumberOfAssessments);

        //Non-Academic Course prerequisite

        JLabel labelPrerequisite = new JLabel();
        labelPrerequisite.setText("Prerequisite : ");
        labelPrerequisite.setForeground(Color.WHITE);
        labelPrerequisite.setFont(new Font("Arial", Font.BOLD, 24));
        labelPrerequisite.setBounds(40,230,300,20);
        panel2.add(labelPrerequisite);

        JTextField textFieldPrerequisite = new JTextField();
        textFieldPrerequisite.setBounds(210, 230,150,20);
        panel2.add(textFieldPrerequisite);

        //Academic Course Button ADD

        ImageIcon buttonImage = new ImageIcon("img.png");

        JButton buttonAdd1 = new JButton();
        buttonAdd1.setText("Add");
        buttonAdd1.setFont(new Font("Arial", Font.BOLD, 24));
        buttonAdd1.setForeground(Color.BLACK);
        buttonAdd1.setBackground(Color.BLACK);
        buttonAdd1.setBounds(300, 380, 150,50);
        panel1.add(buttonAdd1);

        //Non-Academic Button ADD

        JButton buttonAdd2 = new JButton();
        buttonAdd2.setText("Add");
        buttonAdd2.setFont(new Font("Arial", Font.BOLD, 24));
        buttonAdd2.setForeground(Color.BLACK);
        buttonAdd2.setBackground(Color.BLACK);
        buttonAdd2.setBounds(300, 280, 150,50);
        panel2.add(buttonAdd2);

        //  Academic Course CourseLeader

        JLabel labelCourseLeader1 = new JLabel();
        labelCourseLeader1.setText("Course Leader : ");
        labelCourseLeader1.setFont(new Font("Arial", Font.BOLD, 24));
        labelCourseLeader1.setForeground(Color.BLACK);
        labelCourseLeader1.setBounds(40, 450,300,30);
        panel1.add(labelCourseLeader1);

        JTextField textFieldCourseLeader1 = new JTextField();
        textFieldCourseLeader1.setBounds(230, 455, 150,20);
        panel1.add(textFieldCourseLeader1);

        //Non-Academic Course CourseLeader

        JLabel labelCourseLeader2 = new JLabel();
        labelCourseLeader2.setText("Course Leader : ");
        labelCourseLeader2.setFont(new Font("Arial", Font.BOLD, 24));
        labelCourseLeader2.setForeground(Color.WHITE);
        labelCourseLeader2.setBounds(40, 350,300,30);
        panel2.add(labelCourseLeader2);

        JTextField textFieldCourseLeader2 = new JTextField();
        textFieldCourseLeader2.setBounds(230, 355, 150,20);
        panel2.add(textFieldCourseLeader2);

        //Academic Course LecturerName

        JLabel labelLecturerName = new JLabel();
        labelLecturerName.setText("Lecturer Name : ");
        labelLecturerName.setFont(new Font("Arial", Font.BOLD, 24));
        labelLecturerName.setForeground(Color.BLACK);
        labelLecturerName.setBounds(40, 500,300,30);
        panel1.add(labelLecturerName);

        JTextField textFieldLecturerName = new JTextField();
        textFieldLecturerName.setBounds(230, 505, 150,20);
        panel1.add(textFieldLecturerName);

        // Academic Course Starting Date

        JLabel labelStartingDate = new JLabel();
        labelStartingDate.setText(" Starting Date : ");
        labelStartingDate.setFont(new Font("Arial", Font.BOLD, 24));
        labelStartingDate.setForeground(Color.BLACK);
        labelStartingDate.setBounds(30, 550,300,30);
        panel1.add(labelStartingDate);

        JTextField textFieldStartingDate = new JTextField();
        textFieldStartingDate.setBounds(220, 555, 150,20);
        panel1.add(textFieldStartingDate);

        //Academic Course Completion Date

        JLabel labelCompletionDate = new JLabel();
        labelCompletionDate.setText(" Completion Date : ");
        labelCompletionDate.setFont(new Font("Arial", Font.BOLD, 24));
        labelCompletionDate.setForeground(Color.BLACK);
        labelCompletionDate.setBounds(30, 600,300,30);
        panel1.add(labelCompletionDate);

        JTextField textFieldCompletionDate = new JTextField();
        textFieldCompletionDate.setBounds(250, 605, 150,20);
        panel1.add(textFieldCompletionDate);

        //Non-Academic Instructor Name

        JLabel labelInstructorName = new JLabel();
        labelInstructorName.setText("Instructor Name : ");
        labelInstructorName.setFont(new Font("Arial", Font.BOLD, 24));
        labelInstructorName.setForeground(Color.WHITE);
        labelInstructorName.setBounds(40, 400,300,30);
        panel2.add(labelInstructorName);

        JTextField textFieldInstructorName = new JTextField();
        textFieldInstructorName.setBounds(250, 405, 150,20);
        panel2.add(textFieldInstructorName);

        //Non-Academic StartDate
        JLabel labelStartDate = new JLabel();
        labelStartDate.setText("Start Date : ");
        labelStartDate.setFont(new Font("Arial", Font.BOLD, 24));
        labelStartDate.setForeground(Color.WHITE);
        labelStartDate.setBounds(40, 450,300,30);
        panel2.add(labelStartDate);

        JTextField textFieldStartDate = new JTextField();
        textFieldStartDate.setBounds(180, 455, 150,20);
        panel2.add(textFieldStartDate);

        //Non-Academic CompletionDate

        JLabel labelCompletionDate2 = new JLabel();
        labelCompletionDate2.setText("Completion Date : ");
        labelCompletionDate2.setFont(new Font("Arial", Font.BOLD, 24));
        labelCompletionDate2.setForeground(Color.WHITE);
        labelCompletionDate2.setBounds(40, 500,300,30);
        panel2.add(labelCompletionDate2);

        JTextField textFieldCompletionDate2 = new JTextField();
        textFieldCompletionDate2.setBounds(260, 505, 150,20);
        panel2.add(textFieldCompletionDate2);

        //Non-Academic ExamDate
        JLabel labelExamDate = new JLabel();
        labelExamDate.setText("Exam Date : ");
        labelExamDate.setFont(new Font("Arial", Font.BOLD, 24));
        labelExamDate.setForeground(Color.WHITE);
        labelExamDate.setBounds(40, 550,300,30);
        panel2.add(labelExamDate);

        JTextField textFieldExamDate = new JTextField();
        textFieldExamDate.setBounds(180, 555, 150,20);
        panel2.add(textFieldExamDate);

        //Academic Course ButtonRegister

        JButton buttonRegister1 = new JButton();
        buttonRegister1.setText("Register");
        buttonRegister1.setFont(new Font("Arial", Font.BOLD, 24));
        buttonRegister1.setBounds(300, 650, 150,50);
        panel1.add(buttonRegister1);

        //Non-Academic Course Register Button

        JButton buttonRegister2 = new JButton();
        buttonRegister2.setText("Register");
        buttonRegister2.setFont(new Font("Arial", Font.BOLD, 24));
        buttonRegister2.setBounds(300, 600, 150,50);
        panel2.add(buttonRegister2);

        //Academic Course   Display Button

        JButton buttonDisplay1 = new JButton("Display");
        buttonDisplay1.setFont(new Font("Arial", Font.BOLD, 24));
        buttonDisplay1.setBounds(50,800,150,50);
        panel1.add(buttonDisplay1);

        //Non-Academic Course   Display Button

        JButton buttonDisplay2 = new JButton("Display");
        buttonDisplay2.setFont(new Font("Arial", Font.BOLD, 24));
        buttonDisplay2.setBounds(50,800,150,50);
        panel2.add(buttonDisplay2);

        //Academic Course Clear Button

        JButton buttonClear1 = new JButton("Clear");
        buttonClear1.setFont(new Font("Arial", Font.BOLD, 24));
        buttonClear1.setBounds(300, 800,150,50);
        panel1.add(buttonClear1);

        //Academic Course Clear Button

        JButton buttonClear2 = new JButton("Clear");
        buttonClear2.setFont(new Font("Arial", Font.BOLD, 24));
        buttonClear2.setBounds(300, 800,150,50);
        panel2.add(buttonClear2);



        frame.setVisible(true);


    }
}
