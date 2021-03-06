package com.cgs.library.service.impl;

import com.cgs.library.service.AdminService;
import com.cgs.library.dao.AdminMapper;
import com.cgs.library.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;



   @Override
    public Admin select(Admin ad) {
        return adminMapper.select(ad);
    }

    @Override
    public void alterpwd(Admin ad) {
        adminMapper.alterpwd(ad);
    }
}
