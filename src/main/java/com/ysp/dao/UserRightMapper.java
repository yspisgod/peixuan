package com.ysp.dao;

import com.ysp.entity.UserRight;
import com.ysp.entity.UserRightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRightMapper {
    long countByExample(UserRightExample example);

    int deleteByExample(UserRightExample example);

    int insert(UserRight record);

    int insertSelective(UserRight record);

    List<UserRight> selectByExample(UserRightExample example);

    int updateByExampleSelective(@Param("record") UserRight record, @Param("example") UserRightExample example);

    int updateByExample(@Param("record") UserRight record, @Param("example") UserRightExample example);
}