package com.cgs.library.dao;


import com.cgs.library.pojo.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ReaderMapper {
    //根据学生ID，确认学生是否存在
    int checkReader(Integer reader_id);
    //添加学生
    void addReader(Reader reader);
    //确认学生登录正确
    Reader select(Reader rd);
    //读者借阅列表操作
    List<Reader> queryList(Map<String, Object> paramMap);
    //
    Integer queryCount(Map<String, Object> paramMap);
    //
    Reader selectById(Integer id);
    //
    void updateReader(Reader reader);

    //
    void delReader(Integer id);

    //修改学生密码
    void alterpwd(Reader reader);
}
