package com.chevrolet.core.ao;

import java.util.List;

public interface CarLoanOrderSearchAO {

    List<String> filterCarLoanNoByFuzzyField(List<String> orderNos, String fuzzyField);


    List<Long> queryCarIdsByFuzzyField(List<String> orderNos, String carUnique, String modelName);

    List<String> queryCarLoanNosByFuzzyField(List<String> orderNos, String carUnique, String modelName, String fuzzyField);


}
