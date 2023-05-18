package com.cerbon.queen_bee.client.item.renderer;

import com.cerbon.queen_bee.client.item.model.AntennaArmorModel;
import com.cerbon.queen_bee.item.custom.AntennaArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AntennaArmorRenderer extends GeoArmorRenderer<AntennaArmorItem> {
    public AntennaArmorRenderer() {
        super(new AntennaArmorModel());

        this.headBone = "bipedHead";
        this.bodyBone = null;
        this.rightArmBone = null;
        this.leftArmBone = null;
        this.rightLegBone = null;
        this.leftLegBone = null;
        this.rightBootBone = null;
        this.leftBootBone = null;
    }

}
