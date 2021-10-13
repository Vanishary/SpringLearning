package com.ssm.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年03月23日 15:55
 */
public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into user(username,password) value(?,?)";
        Object[] obj = new Object[]{
                user.getUsername(),
                user.getPassword()
        };
        int num = this.jdbcTemplate.update(sql, obj);
        return num;
    }

    @Override
    public int updateUser(User user) {
        String sql = "update user set username=?,password=? where id=?";
        Object[] params = new Object[]{
                user.getUsername(),
                user.getPassword(),
                user.getId()
        };
        int num = this.jdbcTemplate.update(sql, params);
        return num;
    }

    @Override
    public int deleteUser(int id) {
        String sql = "delete from user where id=?";
        int num = this.jdbcTemplate.update(sql, id);
        return num;
    }

    @Override
    public User findUserById(int id) {
        String sql = "select * from user where id=?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    @Override
    public List<User> findAllUser() {
        String sql = "select * from user";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    public void transfer(String outUser, String inUser, Integer jf) {
        //接收积分
        this.jdbcTemplate.update("update user set jf=jf+? where username=?",jf,inUser);
        //模拟系统运行时突发问题
        int i=1/0;
        this.jdbcTemplate.update("update user set jf=jf-? where username=?",jf,outUser);
    }
}
