package org.jxiao.vhrself.serice;

import org.jxiao.vhrself.mapper.HrMapper;
import org.jxiao.vhrself.model.Hr;
import org.jxiao.vhrself.utils.HrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrSerice implements UserDetailsService {

    @Autowired
    HrMapper hrMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在！");
        }
        hr.setRoles(hrMapper.getHrRolesById(hr.getId()));

        return hr;
    }

    public List<Hr> getAllHrs() {
        return hrMapper.getAllHrs(HrUtils.getCurrentHr().getId());
    }
}
