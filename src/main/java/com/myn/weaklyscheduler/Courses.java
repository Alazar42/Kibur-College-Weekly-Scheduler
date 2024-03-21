package com.myn.weaklyscheduler;

import java.util.ArrayList;
import java.util.Random;

public class Courses {
    public String courseName; 
    public String instructorName;
    public String classRoom; 
    
    public ArrayList<Courses> CoursesList = new ArrayList<>();
    
    public static ArrayList<Courses> monday = new ArrayList<>();
    public static ArrayList<Courses> tuesday = new ArrayList<>();
    public static ArrayList<Courses> wednesday = new ArrayList<>();
    public static ArrayList<Courses> thursday = new ArrayList<>();
    public static ArrayList<Courses> friday = new ArrayList<>();
    
    // Track the number of times each course has been scheduled in a week
    private ArrayList<String> scheduledCourses = new ArrayList<>();

    public void addCourse(String cn, String in, String cr) {
    Courses course = new Courses();
    course.classRoom = cr;
    course.courseName = cn;
    course.instructorName = in;

    // Check if the course already exists in any day of the week
    if (!isCourseAlreadyScheduled(course)) {
        // Check if adding this course would exceed the weekly limit
        if (countWeeklyOccurrences(course) < 2) {
            CoursesList.add(course);
            System.out.println("Course added successfully: " + course.courseName);
        } else {
            System.out.println("Cannot add course. Weekly limit reached for: " + course.courseName);
        }
    } else {
        System.out.println("Cannot add course. Already scheduled for the day: " + course.courseName);
    }
}

    private boolean isCourseAlreadyScheduled(Courses course) {
    for (ArrayList<Courses> day : new ArrayList[]{monday, tuesday, wednesday, thursday, friday}) {
        if (day.contains(course)) {
            return true;
        }
    }
    return false;
}

private int countWeeklyOccurrences(Courses course) {
    int count = 0;
    for (String scheduledCourse : scheduledCourses) {
        if (scheduledCourse.equals(course.courseName)) {
            count++;
        }
    }
    return count;
}
    
    public void populateSchedule() {
    // Count the number of courses scheduled for each day
    int[] dayCounts = {monday.size(), tuesday.size(), wednesday.size(), thursday.size(), friday.size()};
    
    for (Courses course : CoursesList) {
        Random random = new Random();
        int count = countWeeklyOccurrences(course); // Count occurrences of this course in the week
        if (count < 2) { // Ensure the course is not scheduled more than twice
            int minCount = Integer.MAX_VALUE;
            int minIndex = 0;
            
            // Find the day with the minimum number of scheduled courses
            for (int i = 0; i < dayCounts.length; i++) {
                if (dayCounts[i] < minCount) {
                    minCount = dayCounts[i];
                    minIndex = i;
                }
            }
            
            // Schedule the course on the day with the minimum count
            switch (minIndex) {
                case 0:
                    if (monday.size() < 3 && !monday.contains(course)) {
                        monday.add(course);
                        scheduledCourses.add(course.courseName);
                        dayCounts[minIndex]++;
                    }
                    break;
                case 1:
                    if (tuesday.size() < 3 && !tuesday.contains(course) && !isCourseScheduledOnDay(course, tuesday)) {
                        tuesday.add(course);
                        scheduledCourses.add(course.courseName);
                        dayCounts[minIndex]++;
                    }
                    break;
                case 2:
                    if (wednesday.size() < 3 && !wednesday.contains(course) && !isCourseScheduledOnDay(course, wednesday)) {
                        wednesday.add(course);
                        scheduledCourses.add(course.courseName);
                        dayCounts[minIndex]++;
                    }
                    break;
                case 3:
                    if (thursday.size() < 3 && !thursday.contains(course) && !isCourseScheduledOnDay(course, thursday)) {
                        thursday.add(course);
                        scheduledCourses.add(course.courseName);
                        dayCounts[minIndex]++;
                    }
                    break;
                case 4:
                    if (friday.size() < 3 && !friday.contains(course) && !isCourseScheduledOnDay(course, friday)) {
                        friday.add(course);
                        scheduledCourses.add(course.courseName);
                        dayCounts[minIndex]++;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}


private boolean isCourseScheduledOnDay(Courses course, ArrayList<Courses> day) {
    int count = 0;
    for (Courses c : day) {
        if (c.equals(course)) {
            count++;
        }
    }
    return count > 0;
}
    
    public ArrayList<Courses> getMonday() {
        return Courses.monday;
    }
    
    public ArrayList<Courses> getTuesday() {
        return Courses.tuesday;
    }
    
    public ArrayList<Courses> getWednesday() {
        return Courses.wednesday;
    }
    
    public ArrayList<Courses> getThursday() {
        return Courses.thursday;
    }
    
    public ArrayList<Courses> getFriday() {
        return Courses.friday;
    }
}
