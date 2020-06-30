package org.jxiao.vhrself.controller.system.basic;

import org.jxiao.vhrself.model.JobLevel;
import org.jxiao.vhrself.model.RespBean;
import org.jxiao.vhrself.serice.JobLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/joblevel")
public class JobLevelController {


    @Autowired
    JobLevelService jobLevelService;

    @GetMapping("/")
    public List<JobLevel> getAllJobLevels(){
        return jobLevelService.getAllJobLevels();
    }

    @PostMapping("/")
    public RespBean addJobLevel(@RequestBody JobLevel jobLevel){
        if (jobLevelService.addJobLevel(jobLevel) == 1) {
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @PutMapping("/")
    public RespBean updateJobLevelById(@RequestBody JobLevel jobLevel){
        if (jobLevelService.updateJobLevelById(jobLevel)==1) {
            return RespBean.ok("更新成功@");
        }
        return RespBean.error("更新失败！");

    }

    @DeleteMapping("/")
    public RespBean deleteJobLevelById(@PathVariable Integer id){
        if (jobLevelService.deleteJobLevelById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }
}
