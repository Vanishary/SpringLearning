package com.ssm.test;

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
        Student student = sqlSession.selectOne("com.ssm.mapper.StudentMapper.findStudentById", 1);
        System.out.println(student.toString());
        sqlSession.close();
    }
}
