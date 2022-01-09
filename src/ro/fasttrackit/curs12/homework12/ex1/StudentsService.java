package ro.fasttrackit.curs12.homework12.ex1;

import java.util.*;

public class StudentsService {
    private List<Students> students;

    public StudentsService(Collection<Students> students) {
        this.students = students == null
                ? new ArrayList<>()
                : new ArrayList<>(students);
    }

    public Map<String, Integer> mapAllStudent() {
        Map<String, Integer> allStudents = new HashMap<>();
        for(Students student : students) {
            allStudents.put(student.getName(), student.getGrade());
        }
        return allStudents;
    }

    public Students getHighestGrade() {
        int max = 1;
        int index = 0;

        for (Students student : students) {
            if(student.getGrade() > max) {
                max = student.getGrade();
                index = students.indexOf(student);
            }
        }
        return students.get(index);
    }
}
