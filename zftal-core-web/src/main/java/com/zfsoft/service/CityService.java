/** service 接口 */

package com.zfsoft.service;

import com.zfsoft.model.City;

import java.util.List;

public interface CityService {
    City getByProvinceId(Long provinceId);

    List<City> getAll();

    String createCity(City city);
    void updateCity(City city);
    void removeCity(String id);
}
