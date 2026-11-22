package top.xfunny.mod.client.screen.widget;

import org.mtr.mapping.holder.MutableText;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mapping.mapper.GuiDrawing;
import org.mtr.mapping.mapper.TransitUi;

public class CategoryItem extends BaseListItem {
    public final MutableText title;

    public CategoryItem(MutableText title, int height) {
        super(height);
        this.title = title;
    }

    public CategoryItem(MutableText title) {
        super();
        this.title = title;
    }

    @Override
    public void draw(GraphicsHolder graphicsHolder, GuiDrawing guiDrawing, int entryX, int entryY, int width, int height, int mouseX, int mouseY, boolean widgetVisible, float tickDelta) {
        TransitUi.rectangle(graphicsHolder, entryX + 1, entryY, width - 2, this.height, TransitUi.INSET);
        TransitUi.rectangle(graphicsHolder, entryX + 1, entryY + this.height - 1, width - 2, 1, TransitUi.BORDER);
        graphicsHolder.drawCenteredText(title, (entryX + width / 2), entryY - (8 / 2) + (this.height / 2), TransitUi.YTE_ACCENT);
    }

    @Override
    public void positionChanged(int entryX, int entryY) {
    }
}
