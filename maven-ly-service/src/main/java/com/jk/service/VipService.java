package com.jk.service;

import com.jk.model.Vip;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VipService {

    List<Vip> queryviplist();
}
