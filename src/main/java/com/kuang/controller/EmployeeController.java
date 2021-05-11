package com.kuang.controller;

import com.kuang.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("/emps")
    public String list(Model model) {
        Collection<com.kuang.pojo.Employee> all = employeeDao.getAll();
        model.addAttribute("emps", all);
        return "emp/list";
    }
}
