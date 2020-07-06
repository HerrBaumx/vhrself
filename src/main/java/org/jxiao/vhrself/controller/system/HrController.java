package org.jxiao.vhrself.controller.system;

import org.jxiao.vhrself.model.Hr;
import org.jxiao.vhrself.model.RespBean;
import org.jxiao.vhrself.serice.HrSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/hr")
public class HrController {

    @Autowired
    HrSerice hrSerice;

    @GetMapping("/")
    public List<Hr> getAllHrs() {
        return hrSerice.getAllHrs();
    }

    @PutMapping("/")
    public RespBean updateHr(@RequestBody Hr hr) {
        if (hrSerice.updateHr(hr) == 1) {
            return RespBean.ok("跟新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
