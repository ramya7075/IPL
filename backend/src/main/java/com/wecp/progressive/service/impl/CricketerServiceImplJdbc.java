package com.wecp.progressive.service.impl;
import java.util.List;
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;
public class CricketerServiceImplJdbc implements CricketerService {
    @Override
    public List<Cricketer> getAllCricketers() {
        return List.of();
    }
    @Override
    public Integer addCricketer(Cricketer cricketer) {
        return -1;
    }
    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        return List.of();
    }
}