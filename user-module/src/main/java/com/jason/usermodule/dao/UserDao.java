package com.jason.usermodule.dao;

import com.jason.usermodule.model.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2020/3/13 14:04
 * @modify 2020/3/13 14:04
 */
public interface UserDao {

    String FIRST_LEVEL = "first_level";
    String SECOND_LEVEL = "second_level";
    String THIRD_LEVEL = "third_level";

    int insert(UserInfo userInfo);

    int deleteByUserId(int userId);

    int deleteByUsername(String username);

    int updateSelective(UserInfo userInfo);

    /**
     * 动态查找
     * 1.username+password(+status)
     * 2.username(+status)
     * 3.userId(+status)
     * 4.phone
     * 5.email
     *
     * @param map
     * @return
     */
    UserInfo selectByUsername(Map map);

    List<UserInfo> selectUser(Map map);

}
