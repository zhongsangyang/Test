package come.controller;

import come.bean.Admin;
import come.service.Adminservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by xyz on 2017/9/21.
 */
@Controller
@RequestMapping("/test")
public class AdminController {
    @Resource
    private Adminservice adminservice;
    private Logger logger= LoggerFactory.getLogger(AdminController.class);
    @GetMapping("/queryphone")
    @ResponseBody
    public Admin checkphone(){
        Object o =null;
        logger.info("queryphone函数正在运行",o);
        Admin admin=adminservice.getByphone("15779720313");
        return admin;
    }
    @GetMapping("/updateById/{id}")
    @ResponseBody
    public String updateById(@PathVariable("id") Integer id,Admin admin){
       admin.setId(1);
        //admin.setPassword("12345678");
        admin.setPhone("15779720313");
        adminservice.updateAdmin(admin);
        return "\"update\":\"success\"";
    }

}
