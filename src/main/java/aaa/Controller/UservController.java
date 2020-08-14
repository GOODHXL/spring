package aaa.Controller;


import aaa.Entity.Userv;
import aaa.Server.UservServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("Userv")
public class UservController {

@Resource
    UservServer uservServer;

    @RequestMapping("selectAll")

    @ResponseBody


        public List<Userv>selectAll()
    {
        return uservServer.selectAll();
    }


    @RequestMapping("login")
    @ResponseBody
    public int login(@RequestBody Map map) {
        System.out.println("Map:" + map);
        System.out.println("Map:" + map.get("uname"));
        System.out.println("Map:" + map.get("pwd"));
        return 1;
    }


    @RequestMapping("deleteById")
    @ResponseBody
    public void deleteById(Integer id) {
        System.out.println("deleteById: " + id);
    }

    @RequestMapping("find")
    @ResponseBody
    public void find(@RequestBody Userv userv) {
        System.out.println("userv: " + userv);
    }


}
