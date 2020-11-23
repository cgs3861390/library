package com.cgs.library.dao;

import com.cgs.library.pojo.LendInfo;

import java.util.List;
import java.util.Map;

public interface LendInfoMapper {
    //借阅书籍查询列表
    List<LendInfo> queryList(Map<String, Object> paramMap);
    //
    Integer queryCount(Map<String, Object> paramMap);
    //归还书籍
    void backbook(Map<String, Object> ret);
    //
    Integer isLended(LendInfo lendInfo);

    Integer cardState(Integer reader_id);
    //
    void addLead(LendInfo lendInfo);
}
