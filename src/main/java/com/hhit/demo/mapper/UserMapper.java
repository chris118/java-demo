package com.hhit.demo.mapper;

import com.hhit.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangxiaopeng
 */
@Mapper
public interface UserMapper {
    /**
     * @param id 用户id
     * @return 返回用户对象
     */
    User getUser(Long id);
}
