package come.controller;

import come.service.Adminservice;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by xyz on 2017/9/21.
 */
@Controller
public class AdminController {
    @Resource
    private Adminservice adminservice;
}
