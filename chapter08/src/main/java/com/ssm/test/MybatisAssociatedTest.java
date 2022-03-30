package com.ssm.test;

import com.ssm.po.Banji;
import com.ssm.po.Course;
import com.ssm.po.Student;
import com.ssm.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2022年03月20日 17:47
 */
public class MybatisAssociatedTest {
    /*
     * @Author: LiGuotao
     * @Description: 嵌套查询
     * @Date: 5:47 下午 2022/3/20
     **/
    @Test
    public void findStudentByIdTest() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        Student student = sqlSession.selectOne("com.ssm.mapper.StudentMapper.findStudentById2", 1);
        System.out.println(student.toString());
        sqlSession.close();
    }

    @Test
    public void findBanjiTest() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        Banji banji = sqlSession.selectOne("com.ssm.mapper.BanjiMapper.findBanjiWithStudent", 1);
        System.out.println(banji.toString());
        sqlSession.close();
    }

    @Test
    public void findCourseByIdTest() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        Course course = sqlSession.selectOne("com.ssm.mapper.CourseMapper.findCourseWithStudent2",1);
        System.out.println(course.toString());
        sqlSession.close();
    }
}
