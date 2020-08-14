package aaa.Controller;

import aaa.Entity.Userv;
import aaa.Server.UservServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller

public class UservController2 {

    @Resource
    UservServer uservServer;

    @RequestMapping("selectAlll")
    public String selectAll(Model model) {

        List<Userv> list = uservServer.selectAll();
        model.addAttribute("name","张三");
        model.addAttribute("course",list.get(0));
        model.addAttribute("list",list);
        return "course";

    }


}
