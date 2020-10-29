package com.med.services.floor;

import com.med.interfaces.floorTypes.Floor;

public class Bedroom implements Floor {


    @Override
    public String getFloorType() {
        return "square";
    }
}
