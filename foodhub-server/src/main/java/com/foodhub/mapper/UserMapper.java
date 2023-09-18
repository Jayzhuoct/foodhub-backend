package com.foodhub.mapper;

import com.foodhub.annotation.AutoFill;
import com.foodhub.enumeration.OperationType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.foodhub.entity.User;
import java.util.Map;

@Mapper
public interface UserMapper {
    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    User getById(String id);

    /**
     * 根据openid获取当前用户
     * @param openid
     * @return
     */
    User getByOpenId(@Param("openid") String openid);

    /**
     * 创建新用户
     * @param user
     */
    @AutoFill(OperationType.INSERT)
    void insert(User user);

    /**
     * 根据动态条件统计用户数量
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
