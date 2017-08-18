package com.gorson.customerweb.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

/**
 * Created by gcliscut on 2017/8/17.
 */
@Service
public class DaoConfig {
    private static final String TYPE_ALIASES_PACKAGE = "com.gorson.customerweb";
    private static final String MAPPER_LOCATION = "classpath:/mapper/*.xml";

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(TYPE_ALIASES_PACKAGE);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        return sqlSessionFactoryBean.getObject();
    }
}
