package com.med.services.floor;

import com.med.interfaces.floorTypes.Floor;

public class LivingRoom implements Floor {

    @Override
    public String getFloorType() {
        return "rectangle";
    }
}
