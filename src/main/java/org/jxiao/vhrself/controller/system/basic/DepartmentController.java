package org.jxiao.vhrself.controller.system.basic;

import org.jxiao.vhrself.model.Department;
import org.jxiao.vhrself.model.RespBean;
import org.jxiao.vhrself.serice.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping("/")
    public RespBean addDep(@RequestBody Department dep) {
        departmentService.addDep(dep);
        if (dep.getResult() == 1) {
            return RespBean.ok("添加成功！",dep);
        }
        return RespBean.error("添加失败！");
    }
}
