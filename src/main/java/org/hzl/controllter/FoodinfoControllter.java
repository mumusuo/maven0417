package org.hzl.controllter;

import com.github.pagehelper.PageInfo;
import org.apache.commons.io.FileUtils;
import org.hzl.pojo.Foodinfo;
import org.hzl.pojo.Parames;
import org.hzl.service.FoodinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@Transactional
public class FoodinfoControllter {

    @Resource
    private FoodinfoService foodinfoService;

    @RequestMapping("/listfood")
    public  String listfood(Model model){

        List<Foodinfo> list=foodinfoService.allFood();

        if (list.size()>0){
            model.addAttribute("listf",list);
            return "listfood";
        }else {
            return "index";
        }
    }

    @RequestMapping("/findfood")
    public  String findfood(Model model,int foodId){

        Foodinfo foodinfo=foodinfoService.findFoodid(foodId);
        model.addAttribute("food",foodinfo);
        return "findfood";
    }
    @RequestMapping("/findUpdatefood")
    public  String findUpdatefood(Model model,int foodId){
        //间接跳转
        Foodinfo foodinfo=foodinfoService.findFoodid(foodId);
        model.addAttribute("food",foodinfo);
        return "update";
    }
    @RequestMapping( value ="/add",produces ="text/html;charset=utf-8")
    @ResponseBody
    public String add(@RequestParam("file") CommonsMultipartFile partFile, Foodinfo foodinfo, HttpServletRequest request){
        String path = request.getServletContext().getRealPath("/img");
//        String path ="D:\\MyGits";
        //文件名
        String filename =partFile.getOriginalFilename();
        filename=filename.substring(2);
        //拼接路径
        File file = new File(path+"/"+filename);

        //文件输入流
        try (InputStream inputStream = partFile.getInputStream()){
            //文件的拷贝
            FileUtils.copyInputStreamToFile(inputStream, file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //设置一下文件图片路径
        foodinfo.setFoodImage(filename);

        //业务方法
        int count= foodinfoService.insert(foodinfo);
        System.out.println(path+foodinfo.getFoodImage());
        //转发
        return "redirect:/listfood";
    }
    /**
     * 下载
     * @return
     */
    @RequestMapping(value = "/downs",produces ="text/html;charset=utf-8")
    @ResponseBody
    public String downs(HttpServletRequest request, HttpServletResponse response){

        //下载的路径:
//        String path ="D:\\MyGits";
        String path = request.getServletContext().getRealPath("/img");
        //文件对象
        File file=new File(path);
        //获得文件列表
        File[] files= file.listFiles();
        //随机获取一个文件，实际中按需编写代码
        //文件名
        String  fileName = files[0].getName();
        ///////////////
        // System.out.println("文件的名字："+fileName);

        //下载文件头信息必须写的！
        response.addHeader("content-disposition", "attachment;filename="+fileName);
        try {
            //文件拷贝
            FileUtils.copyFile(files[0], response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "下载成功哦！";
    }

    @RequestMapping("/del")
    public String del(int foodId){
        //业务方法
        int count= foodinfoService.delete(foodId);

        return "redirect:/listfood";
    }
    @RequestMapping("/findUpdate")
    public String findUpdate(Foodinfo foodinfo){
        //业务方法
        int count= foodinfoService.update(foodinfo);

        return "redirect:/listfood";
    }

    @RequestMapping("/list")
    public String list(ModelMap map, Parames parame, Foodinfo foodinfo){

        //业务方法
        PageInfo<Foodinfo> pageInfo= foodinfoService.findName(foodinfo,parame);

        //保存数据
        map.addAttribute("pageInfo",pageInfo);

        //用户数据
        map.addAttribute("foodinfo",foodinfo);


        return "redirect:/listfood"; //findfood.jsp
    }
}
