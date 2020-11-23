package com.cgs.library.dao;

import com.cgs.library.pojo.Admin;

public interface AdminMapper {
    //确认管理员用户
    Admin select(Admin ad);

    //修改管理员密码
    void alterpwd(Admin ad);
}
