package com.jk.mapper;

import com.jk.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {

    List<User> querycount();
}
