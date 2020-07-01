package org.jxiao.vhrself.serice;

import org.jxiao.vhrself.mapper.RoleMapper;
import org.jxiao.vhrself.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleMapper roleMapper;
    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }
}
