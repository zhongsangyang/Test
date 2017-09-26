package come.service;

import come.bean.Admin;


/**
 * Created by xyz on 2017/9/21.
 */
public interface Adminservice {
    Admin getByphone(String phone);
    void updateAdmin(Admin admin);
}
