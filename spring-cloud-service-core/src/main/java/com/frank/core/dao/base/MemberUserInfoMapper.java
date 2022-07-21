package com.frank.core.dao.base;

import com.frank.core.entity.MemberUserInfo;
import com.frank.core.entity.MemberUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberUserInfoMapper {
    long countByExample(MemberUserInfoExample example);

    int deleteByExample(MemberUserInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberUserInfo record);

    int insertSelective(MemberUserInfo record);

    List<MemberUserInfo> selectByExample(MemberUserInfoExample example);

    MemberUserInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberUserInfo record, @Param("example") MemberUserInfoExample example);

    int updateByExample(@Param("record") MemberUserInfo record, @Param("example") MemberUserInfoExample example);

    int updateByPrimaryKeySelective(MemberUserInfo record);

    int updateByPrimaryKey(MemberUserInfo record);
}