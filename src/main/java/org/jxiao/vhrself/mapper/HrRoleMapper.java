package org.jxiao.vhrself.mapper;

import org.apache.ibatis.annotations.Param;
import org.jxiao.vhrself.model.HrRole;

public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);

    void deleteByHrid( Integer hrid);

    Integer addRoles(@Param("hrid") Integer hrid, @Param("rids") Integer[] rids);
}