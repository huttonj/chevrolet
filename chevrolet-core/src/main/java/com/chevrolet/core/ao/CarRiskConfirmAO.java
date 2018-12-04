package com.chevrolet.core.ao;

import com.chevrolet.api.dto.CarRiskConfirmDTO;

public interface CarRiskConfirmAO {

    /**
     * @param carRiskConfirmDTO
     * @return
     */
    Long saveCarRiskConfirmDTO(CarRiskConfirmDTO carRiskConfirmDTO);
}
