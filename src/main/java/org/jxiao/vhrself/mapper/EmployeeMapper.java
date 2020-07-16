package org.jxiao.vhrself.mapper;

import org.apache.ibatis.annotations.Param;
import org.jxiao.vhrself.model.Employee;

import java.util.Date;
import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> getEmployeeByPage(@Param("page") Integer page, @Param("size") Integer size,
                                     @Param("emp") Employee employee,
                                     @Param("beginDateScope") Date[] beginDateScope);

    Long getTotal(@Param("emp") Employee employee,
                  @Param("beginDateScope") Date[] beginDateScope);

    Integer maxWorkID();

    Integer addEmps(@Param("list") List<Employee> list);
}