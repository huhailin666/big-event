package com.itheima.pojo;

import jakarta.validation.groups.Default;
import lombok.Data;

import java.time.LocalDateTime;
@Data

public class Category {
    private Integer id;//主键ID
    private String categoryName;//分类名称
    private String categoryAlias;//分类别名
    private Integer createUser;//创建人ID
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
    public interface Add extends Default {

    }

    public interface Update extends Default{

    }
}
