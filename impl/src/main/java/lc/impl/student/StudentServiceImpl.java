package lc.impl.student;

import com.alibaba.dubbo.config.annotation.Service;
import lc.dao.student.StudentMapper;
import lc.entity.student.Student;
import lc.service.student.StudentService;


import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public List<Student> selectAll() {
        List<Student> students = studentMapper.selectAll();
        return students;
    }
}
