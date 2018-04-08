package com.jk.mapper;

import com.jk.model.Tree;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreeMapper {

    List<Tree> getTree();
}
