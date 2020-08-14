package aaa.Server;

import aaa.Dao.UserDao;
import aaa.Entity.Userv;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UservServer {

    @Resource
    UserDao userDao;

    public List<Userv> selectAll(){

        return userDao.selectAll();
    }
}
