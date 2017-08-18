package com.gorson.customerweb.service;

import com.gorson.customerweb.mapper.CustomerMapperAnnotation;
import com.gorson.customerweb.mapper.CustomerMapperXml;
import com.gorson.customerweb.vo.CustomerModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Gorson on 2017/08/06.
 */
@Service
public class CustomerService {

    @Resource
    private CustomerMapperAnnotation customerMapperAnnotation;
    @Resource
    private CustomerMapperXml customerMapperXml;

    public void insertByAnnotation(CustomerModel model) {
        customerMapperAnnotation.insert(model);
    }

    public void updateByAnnotation(CustomerModel model) {
        customerMapperAnnotation.update(model);
    }

    public void deleteByAnnotation(int uuid) {
        customerMapperAnnotation.delete(uuid);
    }

    public CustomerModel getByUuidByAnnotation(int uuid) {
        return customerMapperAnnotation.getByUuid(uuid);
    }

    public void insertByXml(CustomerModel model) {
        customerMapperXml.insert(model);
    }

    public void updateByXml(CustomerModel model) {
        customerMapperXml.update(model);
    }

    public void deleteByXml(int uuid) {
        customerMapperXml.delete(uuid);
    }

    public CustomerModel getByUuidByXml(int uuid) {
        return customerMapperXml.getByUuid(uuid);
    }

}
