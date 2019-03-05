package lc.controller.student;

import com.alibaba.dubbo.config.annotation.Reference;
import lc.entity.student.Student;
import lc.service.student.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
public class StudentController {
    @Reference
    private StudentService studentService;
    @RequestMapping("/say.do")
    public String say(){
        System.out.println("3333333333");
        List<Student> students = studentService.selectAll();
        System.out.println(students.size());
        return null;
    }
}
