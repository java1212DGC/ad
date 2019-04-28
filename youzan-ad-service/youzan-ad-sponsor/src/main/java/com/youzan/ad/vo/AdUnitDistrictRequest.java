package com.youzan.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by baimugudu on 2019/3/29
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdUnitDistrictRequest {

    private List<UnitDistrict> unitDistrict;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UnitDistrict{



        private Long unitId;


        private String province;



        private String city;

    }


}
