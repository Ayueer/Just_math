package com.just.ti.service;

import com.just.ti.entity.Question;

import java.util.List;

/**
 * @author 贺文杰
 * 2019/3/9 20:47
 */
public interface QuestionService {
    /**
     * 根据ID查找题目
     * @param id 题目Id
     * @return 一个题目实体
     */
    Question selectById(Integer id);

    /**
     * 数据库中加一道题
     * @param question 题目实体
     * @return 1代表成功
     */
    int add(Question question);

    /**
     * 根据板块查找问题列表
     * @param ban 板块
     * @return 返回一个题目列表
     */
    List<Question> selectByBan(String ban);

}
