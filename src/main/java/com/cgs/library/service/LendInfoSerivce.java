package com.cgs.library.service;

import com.cgs.library.pojo.LendInfo;
import com.cgs.library.util.PageBean;

import java.util.Map;

public interface LendInfoSerivce {
    PageBean<LendInfo> queryLeadInfoPage(Map<String, Object> paramMap);

    void backBook(Map<String, Object> ret);

    boolean isLended(LendInfo lendInfo);

    Integer cardState(Integer reader_id);

    void lendBook(LendInfo lendInfo);
}
