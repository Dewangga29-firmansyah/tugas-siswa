/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentproject.Class;

/**
 *
 * @author PANJI GILANG
 */
public class Student {
    private int studentNumber;
    private String score;
    private String major;

    public Student() {
        studentNumber = 0;
        score = "";
        major = "";
    }

    public Student(int studentNumber, String score, String major) {
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void print() {
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Score: " + score);
        System.out.println("Major: " + major);
    }
}

