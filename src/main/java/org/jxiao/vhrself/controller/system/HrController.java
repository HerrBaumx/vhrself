package org.jxiao.vhrself.controller.system;

import org.jxiao.vhrself.model.Hr;
import org.jxiao.vhrself.serice.HrSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
