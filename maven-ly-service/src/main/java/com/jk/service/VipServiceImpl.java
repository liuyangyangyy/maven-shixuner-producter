package com.jk.service;

import com.jk.mapper.VipMapper;
import com.jk.model.Vip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private  VipMapper  vipMapper;

    public List<Vip> queryviplist() {
        return vipMapper.queryviplist();
    }
}
