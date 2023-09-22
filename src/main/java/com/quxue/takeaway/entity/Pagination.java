package com.quxue.takeaway.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pagination<T> {
    private Long total;//总数

    private List<T>rows;//当前页数


}
