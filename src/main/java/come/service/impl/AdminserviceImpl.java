package come.service.impl;

import come.bean.Admin;
import come.dao.AdminDao;
import come.service.Adminservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xyz on 2017/9/21.
 */
@Service
public class AdminserviceImpl implements Adminservice{
    @Resource
    private AdminDao adminDao;

    public Admin getByphone(String phone) {
        return adminDao.getByPhone(phone);
    }
    /*
    * @param admin 对象
    * create by xyz 2017/9/25
    * */
    public void updateAdmin(Admin admin) {
        adminDao.update(admin);
    }
}
