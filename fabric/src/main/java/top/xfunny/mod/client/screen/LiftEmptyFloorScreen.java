package top.xfunny.mod.client.screen;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.ButtonWidgetExtension;
import org.mtr.mapping.mapper.CheckboxWidgetExtension;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mapping.mapper.ScreenExtension;
import org.mtr.mapping.mapper.TextFieldWidgetExtension;
import org.mtr.mapping.mapper.TextHelper;
import org.mtr.mapping.mapper.TransitUi;
import org.mtr.mapping.tool.TextCase;
import top.xfunny.mod.client.InitClient;
import org.mtr.mod.client.IDrawing;
import org.mtr.mod.data.IGui;
import org.mtr.mod.generated.lang.TranslationProvider;
import top.xfunny.mod.packet.PacketUpdateLiftEmptyFloorConfig;
import top.xfunny.mod.block.EmptyFloor;

public class LiftEmptyFloorScreen extends ScreenExtension implements IGui {

    private static final MutableText TEXT_FLOOR_NUMBER = TranslationProvider.GUI_MTR_LIFT_FLOOR_NUMBER.getMutableText();
    private static final MutableText TEXT_FLOOR_DESCRIPTION = TranslationProvider.GUI_MTR_LIFT_FLOOR_DESCRIPTION.getMutableText();
    private static final int CARD_HEIGHT = 152;
    private final ButtonWidgetExtension save;
    private boolean initialized;
    private final TextFieldWidgetExtension textFieldFloorNumber;
    private final TextFieldWidgetExtension textFieldFloorDescription;
    private final CheckboxWidgetExtension checkboxShouldDing;
    private final BlockPos blockPos;
    private final String initialFloorNumber;
    private final String initialFloorDescription;
    private final boolean initialShouldDing;


    public LiftEmptyFloorScreen(BlockPos blockPos, EmptyFloor.BlockEntity blockEntity) {
        super();
        this.blockPos = blockPos;
        save = new ButtonWidgetExtension(0, 0, 0, SQUARE_SIZE, TextHelper.translatable("gui.done"), button -> onClose2());

        textFieldFloorNumber = new TextFieldWidgetExtension(0, 0, 0, SQUARE_SIZE, 8, TextCase.DEFAULT, null, "1");
        textFieldFloorDescription = new TextFieldWidgetExtension(0, 0, 0, SQUARE_SIZE, 256, TextCase.DEFAULT, null, "Concourse");
        checkboxShouldDing = new CheckboxWidgetExtension(0, 0, 0, SQUARE_SIZE, true, checked -> {
        });
        checkboxShouldDing.setMessage2(TranslationProvider.GUI_MTR_LIFT_SHOULD_DING.getText());

        final ClientWorld clientWorld = MinecraftClient.getInstance().getWorldMapped();
        if (clientWorld == null) {
            initialFloorNumber = "EZ";
            initialFloorDescription = "";
            initialShouldDing = false;
        } else {
            initialFloorNumber = blockEntity.getFloorNumber();
            initialFloorDescription = blockEntity.getFloorDescription();
            initialShouldDing = blockEntity.getShouldDing();
        }

    }

    @Override
    protected void init2() {
        super.init2();

        final int contentWidth = cardWidth() - 24;
        final int left = (width - cardWidth()) / 2 + 12;
        final int top = cardTop();
        IDrawing.setPositionAndWidth(textFieldFloorNumber, left, top + 39, contentWidth);
        IDrawing.setPositionAndWidth(textFieldFloorDescription, left, top + 77, contentWidth);
        IDrawing.setPositionAndWidth(checkboxShouldDing, left, top + 106, contentWidth);
        IDrawing.setPositionAndWidth(save, left, top + 123, contentWidth);

        if (!initialized) {
            initialized = true;
            textFieldFloorNumber.setText2(initialFloorNumber);
            textFieldFloorDescription.setText2(initialFloorDescription);
            checkboxShouldDing.setChecked(initialShouldDing);
        }

        addChild(new ClickableWidget(textFieldFloorNumber));
        addChild(new ClickableWidget(textFieldFloorDescription));
        addChild(new ClickableWidget(checkboxShouldDing));
        addChild(new ClickableWidget(save));
    }

    @Override
    public void tick2() {
        textFieldFloorNumber.tick2();
        textFieldFloorDescription.tick2();
    }

    @Override
    public void render(GraphicsHolder graphicsHolder, int mouseX, int mouseY, float delta) {
        renderBackground(graphicsHolder);
        final int left = (width - cardWidth()) / 2;
        final int top = cardTop();
        TransitUi.panel(graphicsHolder, left, top, cardWidth(), CARD_HEIGHT);
        graphicsHolder.drawText(TextHelper.translatable("gui.yte.lift_floor_editor"), left + 12, top + 11,
                TransitUi.YTE_ACCENT, false, GraphicsHolder.getDefaultLight());
        graphicsHolder.drawText(TEXT_FLOOR_NUMBER, left + 12, top + 27, TransitUi.MUTED_TEXT, false, GraphicsHolder.getDefaultLight());
        graphicsHolder.drawText(TEXT_FLOOR_DESCRIPTION, left + 12, top + 65, TransitUi.MUTED_TEXT, false, GraphicsHolder.getDefaultLight());
        super.render(graphicsHolder, mouseX, mouseY, delta);
    }

    private int cardWidth() {
        return Math.min(302, width - 24);
    }

    private int cardTop() {
        return Math.max(5, (height - CARD_HEIGHT) / 2);
    }

    @Override
    public void onClose2() {
        InitClient.REGISTRY_CLIENT.sendPacketToServer(new PacketUpdateLiftEmptyFloorConfig(blockPos, textFieldFloorNumber.getText2(), textFieldFloorDescription.getText2(), checkboxShouldDing.isChecked2()));
        super.onClose2();
    }

    @Override
    public boolean isPauseScreen2() {
        return false;
    }
}
