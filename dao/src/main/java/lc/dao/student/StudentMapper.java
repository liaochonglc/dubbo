package lc.dao.student;

import lc.entity.student.Student;

import java.util.List;

public interface StudentMapper {
    public List<Student> selectAll();
}
