package com.gorson.customerweb.mapper;

import com.gorson.customerweb.vo.CustomerModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * 使用Xml的方式操作数据库，和Mapper配置文件的方法一致
 *
 * Created by Gorson on 2017/08/06.
 */
@Mapper
public interface CustomerMapperXml {
    void insert(CustomerModel model);
    void update(CustomerModel model);
    void delete(int uuid);

    CustomerModel getByUuid(int uuid);
//    List<CustomerModel> getByCondition(CustomerQueryModel model);
}
