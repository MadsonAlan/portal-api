package com.portal.api.service;

import com.portal.api.dto.CarPostDTO;

import java.util.List;

public interface CarPostStoreService {
    List<CarPostDTO> getCarForSales();

    void changeCarForSale(CarPostDTO carPost, String is);

    void removeCarForSale(String id);


}
