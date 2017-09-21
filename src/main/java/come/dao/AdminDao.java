package come.dao;

import come.bean.Admin;
import org.springframework.stereotype.Repository;

/**
 * Created by xyz on 2017/9/21.
 */
@Repository
public interface AdminDao {
    Admin getByPhone(String phone);
}
