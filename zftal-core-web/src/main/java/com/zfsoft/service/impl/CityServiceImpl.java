package com.zfsoft.service.impl;

import com.zfsoft.mapper.CityMapper;
import com.zfsoft.model.City;
import com.zfsoft.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityMapper cityMapper;

    @Override
    public City getByProvinceId(Long provinceId) {
        return cityMapper.findByProvinceId(provinceId);
    }
    @Override
    public List<City> getAll() {
        return cityMapper.findAll();
    }
    @Override
    public String createCity(City city) {
        cityMapper.createCity(city);
        return "success";
    }
    @Override
    public void updateCity(City city) {
        cityMapper.updateCity(city);
    }
    @Override
    public void removeCity(String id) {
        cityMapper.deleteCity(id);
    }
}