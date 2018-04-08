package com.jk.test;

import com.jk.mapper.TestMapper;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements  TestService {

    @Autowired
    private    TestMapper   testMapper;


    public List<User> querycount() {
        return testMapper.querycount();
    }
}
