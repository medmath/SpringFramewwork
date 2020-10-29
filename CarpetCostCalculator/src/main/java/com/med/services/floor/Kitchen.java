package com.med.services.floor;

import com.med.interfaces.floorTypes.Floor;

public class Kitchen implements Floor {
    @Override
    public String getFloorType() {
        return "circle";
    }
}
