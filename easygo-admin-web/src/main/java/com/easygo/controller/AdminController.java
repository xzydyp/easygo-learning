package com.easygo.controller;

import com.easygo.api.AdminClient;
import com.easygo.api.LoginLogClient;
import com.easygo.pojo.Admin;
import com.easygo.pojo.LoginLog;
import com.easygo.utils.MessageResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.controller
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 11:39
 * @Description: TODO
 */
@Controller
@Scope("prototype")
public class AdminController {

    @Autowired
    AdminClient adminClient;

    @Autowired
    LoginLogClient loginLogClient;

    /**
     * 异步获取登录日志
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/admin_getLoginLogs")
    public List<LoginLog> getLoginLogs(HttpSession session){
        //登录哟用户
        Admin admin= (Admin) session.getAttribute("adminLogin");
        List<LoginLog> myLoginLogs = loginLogClient.getMyLoginLogs(admin.getUsername());
        return myLoginLogs;
    }

    @RequestMapping("/admin_logout")
    public String adminLogout(HttpSession session){
        session.invalidate();
        return "login";
    }

    @ResponseBody
    @RequestMapping("/admin_login")
    public MessageResults adminLogin(Admin admin,String ip,String city,HttpSession session){
        System.out.println("IP:"+ip);
        System.out.println("city:"+city);
        //获取到用户登录的真实IP和登录的城市,多种做法：
        //1.获取到IP之后，调用WebService, 查询IP对应的城市（功能更强大一些）
        //2.直接JS前端调用接口 (目前这个位置正好可以使用)
        MessageResults results=null;
        Admin adminLogin = adminClient.adminLogin(admin);
        System.out.println("当前登录的用户是:"+adminLogin);
        if(adminLogin!=null){
            if("1".equals(adminLogin.getStatus())){
                System.out.println("登录成功");

                //登录的日志对象(登录日志新增)
                LoginLog loginLog=new LoginLog(ip,admin.getUsername(),city);
                loginLog.setCreatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                System.out.println("要新增的日志对象:"+loginLog);
                int count = loginLogClient.addLoginLog(loginLog);

                session.setAttribute("adminLogin",adminLogin);
                results=new MessageResults(200,"登录成功");
            }else{
                results=new MessageResults(303,"该用已经被冻结,请联系管理员!");
            }
        }else{
            //登录页面
            System.out.println("登录失败");
            results=new MessageResults(500,"登录失败");
        }
        return results;
    }
}
