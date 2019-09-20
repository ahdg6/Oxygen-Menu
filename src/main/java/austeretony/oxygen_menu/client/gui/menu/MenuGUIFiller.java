package austeretony.oxygen_menu.client.gui.menu;

import austeretony.alternateui.util.EnumGUIAlignment;
import austeretony.oxygen_core.client.gui.elements.BackgroundGUIFiller;
import austeretony.oxygen_core.client.gui.elements.CustomRectUtils;

public class MenuGUIFiller extends BackgroundGUIFiller {

    public MenuGUIFiller(int xPosition, int yPosition, int width, int height) {             
        super(xPosition, yPosition, width, height);
    }

    @Override
    public void drawBackground() {
        CustomRectUtils.drawGradientRect(0.0D, 0.0D, this.getWidth(), this.getHeight(), 0x00000000, this.getEnabledBackgroundColor(), EnumGUIAlignment.RIGHT);
    }
}