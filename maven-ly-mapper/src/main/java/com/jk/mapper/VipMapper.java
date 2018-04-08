package com.jk.mapper;

import com.jk.model.Vip;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VipMapper {
    List<Vip> queryviplist();
}
