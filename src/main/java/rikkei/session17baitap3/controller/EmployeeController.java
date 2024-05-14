package rikkei.session17baitap3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import rikkei.session17baitap3.entity.Employee;
import rikkei.session17baitap3.ultil.DaoEmployee;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class EmployeeController
{
//    @InitBinder
//    public void initBinder(WebDataBinder binder){
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(sf,true));
//    }

    @Autowired
    private DaoEmployee daoEmployee;

    @RequestMapping(value = {"addEmployee"})
    public String addEmployee(Model model)
    {
        model.addAttribute("addEmployee", new Employee());
        return "add";

    }

    ;

    @RequestMapping(value = {"updateEmployee"})
    public String updateEmployee(Model model)
    {
        model.addAttribute("employee", new Employee());
        return "update";

    }

    @RequestMapping({"/", "views"})
    public String views(Model model)
    {
        model.addAttribute("employee",daoEmployee.findAll() );
        return "views";
    }


}
