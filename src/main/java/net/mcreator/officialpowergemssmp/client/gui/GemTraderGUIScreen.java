package net.mcreator.officialpowergemssmp.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.officialpowergemssmp.world.inventory.GemTraderGUIMenu;
import net.mcreator.officialpowergemssmp.network.GemTraderGUIButtonMessage;
import net.mcreator.officialpowergemssmp.OfficialpowergemssmpMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GemTraderGUIScreen extends AbstractContainerScreen<GemTraderGUIMenu> {
	private final static HashMap<String, Object> guistate = GemTraderGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_random_gem;

	public GemTraderGUIScreen(GemTraderGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 147;
		this.imageHeight = 78;
	}

	private static final ResourceLocation texture = new ResourceLocation("officialpowergemssmp:textures/screens/gem_trader_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_random_gem = Button.builder(Component.translatable("gui.officialpowergemssmp.gem_trader_gui.button_random_gem"), e -> {
			if (true) {
				OfficialpowergemssmpMod.PACKET_HANDLER.sendToServer(new GemTraderGUIButtonMessage(0, x, y, z));
				GemTraderGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 34, this.topPos + 28, 77, 20).build();
		guistate.put("button:button_random_gem", button_random_gem);
		this.addRenderableWidget(button_random_gem);
	}
}
