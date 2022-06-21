package com.me.mybatis.test;

import com.me.mybatis.mapper.DeptMapper;
import com.me.mybatis.mapper.EmpMapper;
import com.me.mybatis.mapper.UserMapper;
import com.me.mybatis.pojo.Emp;
import com.me.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest2 {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.getUserById(1));
        System.out.println(mapper.checkLogin("张三", "123"));
    }

    @Test
    public void test2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        System.out.println(mapper.getEmpAndDept(1));
    }

    @Test
    public void test3(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        System.out.println(mapper.getDeptAndEmp(1));
    }
}
