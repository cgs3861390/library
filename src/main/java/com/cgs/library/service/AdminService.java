package com.cgs.library.service;

import com.cgs.library.pojo.Admin;

public interface AdminService {

    Admin select(Admin ad);

    void alterpwd(Admin ad);
}
