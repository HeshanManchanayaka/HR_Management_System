package edu.icet.config;

import edu.icet.dto.Employee;
import edu.icet.entity.EmployeeEntity;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public ModelMapper getMapper(){
        ModelMapper mapper = new ModelMapper();
        mapper.typeMap(EmployeeEntity.class, Employee.class)
                .addMapping(EmployeeEntity::getCreatedAt, Employee::setCreateAt)
                .addMapping(EmployeeEntity::getUpdatedAt, Employee::setUpdateAt);
        return mapper;
    }
}
