package com.gorson.customerweb.mapper;

import com.gorson.customerweb.vo.CustomerModel;
import org.apache.ibatis.annotations.*;

/**
 * 使用注解操作数据库
 *
 * Created by Gorson on 2017/08/06.
 */
@Mapper
public interface CustomerMapperAnnotation {

    @Insert("INSERT INTO tbl_customer (customerId,pwd,showName,trueName,registerTime) " +
            "VALUES (#{customerId},#{pwd},#{showName},#{trueName},#{registerTime})")
    int insert(CustomerModel model);

    @Update("UPDATE tbl_customer " +
            "SET customerId=#{customerId},pwd=#{pwd},showName=#{showName},trueName=#{trueName},registerTime=#{registerTime} " +
            "WHERE uuid=#{uuid}")
    void update(CustomerModel model);

    @Delete("DELETE FROM tbl_customer WHERE uuid=#{uuid}")
    void delete(int uuid);

    @Select("SELECT * FROM tbl_customer WHERE uuid=#{uuid}")
    CustomerModel getByUuid(int uuid);
}