package com.gorson.customerweb.api;

import com.gorson.customerweb.service.CustomerService;
import com.gorson.customerweb.vo.CustomerModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Gorson on 2017/08/06.
 */
@RestController()
public class CustomerApi {
    @Resource
    private CustomerService customerService;

    @RequestMapping("/customer/insertByAnnotation")
    public void insertByAnnotation(@RequestParam("customerId") String customerId,
                                   @RequestParam("pwd") String pwd,
                                   @RequestParam("showName") String showName,
                                   @RequestParam("trueName") String trueName,
                                   @RequestParam("registerTime") String registerTime) {
        customerService.insertByAnnotation(new CustomerModel(){{
            setCustomerId(customerId);
            setPwd(pwd);
            setShowName(showName);
            setTrueName(trueName);
            setRegisterTime(registerTime);
        }});
    }

    @RequestMapping("/customer/updateByAnnotation")
    public void updateByAnnotation(@RequestParam("uuid") Integer uuid,
                                   @RequestParam("customerId") String customerId,
                                   @RequestParam("pwd") String pwd,
                                   @RequestParam("showName") String showName,
                                   @RequestParam("trueName") String trueName,
                                   @RequestParam("registerTime") String registerTime) {
        customerService.updateByAnnotation(new CustomerModel() {{
            setUuid(uuid);
            setCustomerId(customerId);
            setPwd(pwd);
            setShowName(showName);
            setTrueName(trueName);
            setRegisterTime(registerTime);
        }});
    }

    @RequestMapping("/customer/deleteByAnnotation")
    public void deleteByAnnotation(@RequestParam("uuid") int uuid) {
        customerService.deleteByAnnotation(uuid);
    }

    @RequestMapping("/customer/getByUuidByAnnotation")
    public CustomerModel getByUuidByAnnotation(@RequestParam("uuid") int uuid) {
        return customerService.getByUuidByAnnotation(uuid);
    }

    @RequestMapping("/customer/insertByXml")
    public void insertByXml(@RequestParam("customerId") String customerId,
                            @RequestParam("pwd") String pwd,
                            @RequestParam("showName") String showName,
                            @RequestParam("trueName") String trueName,
                            @RequestParam("registerTime") String registerTime) {
        customerService.insertByXml(new CustomerModel(){{
            setCustomerId(customerId);
            setPwd(pwd);
            setShowName(showName);
            setTrueName(trueName);
            setRegisterTime(registerTime);
        }});
    }

    @RequestMapping("/customer/updateByXml")
    public void updateByXml(@RequestParam("uuid") Integer uuid,
                            @RequestParam("customerId") String customerId,
                            @RequestParam("pwd") String pwd,
                            @RequestParam("showName") String showName,
                            @RequestParam("trueName") String trueName,
                            @RequestParam("registerTime") String registerTime) {
        customerService.updateByXml(new CustomerModel(){{
            setUuid(uuid);
            setCustomerId(customerId);
            setPwd(pwd);
            setShowName(showName);
            setTrueName(trueName);
            setRegisterTime(registerTime);
        }});
    }

    @RequestMapping("/customer/deleteByXml")
    public void deleteByXml(@RequestParam("uuid") int uuid) {
        customerService.deleteByXml(uuid);
    }

    @RequestMapping("/customer/getByUuidByXml")
    public CustomerModel getByUuidByXml(@RequestParam("uuid") int uuid) {
        return customerService.getByUuidByXml(uuid);
    }
}
