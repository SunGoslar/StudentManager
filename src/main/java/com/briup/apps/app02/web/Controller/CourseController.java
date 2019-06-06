package com.briup.apps.app02.web.Controller;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.bean.extend.CourseExtend;
import com.briup.apps.app02.service.ICourseService;
import com.briup.apps.app02.utils.Message;
import com.briup.apps.app02.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @ApiOperation("通过Id查询")
    @GetMapping("findById")
    public Message findById(@ApiParam(value = "主键", required = true)
                                     @RequestParam(value = "id") long id){
        Course course= courseService.findById(id);
        return MessageUtil.success("success", course);
    }

    @ApiOperation("查询所有课程中有任课教师的课程")
    @GetMapping("findAllWithTeacher")
    public Message findAllTeacher(){
        List<CourseExtend> list=courseService.findAllWithTeacher();
        return MessageUtil.success("success", list);
    }

    @GetMapping("findAll")
    public Message findAll(){
        List<Course> list=courseService.findAll();
        return MessageUtil.success("success", list);
    }

    @GetMapping("query")
    public Message query(Course course){
        List<Course> list= courseService.query(course);
        return MessageUtil.success("success", list);
    }

}
