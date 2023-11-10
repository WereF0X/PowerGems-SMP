package net.mcreator.officialpowergemssmp.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.officialpowergemssmp.world.inventory.ReviveGUIMenu;
import net.mcreator.officialpowergemssmp.network.ReviveGUIButtonMessage;
import net.mcreator.officialpowergemssmp.OfficialpowergemssmpMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ReviveGUIScreen extends AbstractContainerScreen<ReviveGUIMenu> {
	private final static HashMap<String, Object> guistate = ReviveGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_random_revive;
	Button button_revive_all;

	public ReviveGUIScreen(ReviveGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 224;
		this.imageHeight = 70;
	}

	private static final ResourceLocation texture = new ResourceLocation("officialpowergemssmp:textures/screens/revive_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.officialpowergemssmp.revive_gui.label_revive_a_player"), 70, 7, -16711936, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.officialpowergemssmp.revive_gui.label_cost_5_netherite_ingots"), 123, 46, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.officialpowergemssmp.revive_gui.label_1_gem_crystal"), 139, 55, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_random_revive = Button.builder(Component.translatable("gui.officialpowergemssmp.revive_gui.button_random_revive"), e -> {
			if (true) {
				OfficialpowergemssmpMod.PACKET_HANDLER.sendToServer(new ReviveGUIButtonMessage(0, x, y, z));
				ReviveGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 26, 93, 20).build();
		guistate.put("button:button_random_revive", button_random_revive);
		this.addRenderableWidget(button_random_revive);
		button_revive_all = Button.builder(Component.translatable("gui.officialpowergemssmp.revive_gui.button_revive_all"), e -> {
			if (true) {
				OfficialpowergemssmpMod.PACKET_HANDLER.sendToServer(new ReviveGUIButtonMessage(1, x, y, z));
				ReviveGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 123, this.topPos + 26, 77, 20).build();
		guistate.put("button:button_revive_all", button_revive_all);
		this.addRenderableWidget(button_revive_all);
	}
}
