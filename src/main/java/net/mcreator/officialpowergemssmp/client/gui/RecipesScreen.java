package net.mcreator.officialpowergemssmp.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.officialpowergemssmp.world.inventory.RecipesMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RecipesScreen extends AbstractContainerScreen<RecipesMenu> {
	private final static HashMap<String, Object> guistate = RecipesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RecipesScreen(RecipesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 350;
		this.imageHeight = 218;
	}

	private static final ResourceLocation texture = new ResourceLocation("officialpowergemssmp:textures/screens/recipes.png");

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

		guiGraphics.blit(new ResourceLocation("officialpowergemssmp:textures/screens/t1.png"), this.leftPos + 1, this.topPos + 1, 0, 0, 150, 70, 150, 70);

		guiGraphics.blit(new ResourceLocation("officialpowergemssmp:textures/screens/t2.png"), this.leftPos + 196, this.topPos + 1, 0, 0, 150, 70, 150, 70);

		guiGraphics.blit(new ResourceLocation("officialpowergemssmp:textures/screens/t3.png"), this.leftPos + 1, this.topPos + 146, 0, 0, 150, 70, 150, 70);

		guiGraphics.blit(new ResourceLocation("officialpowergemssmp:textures/screens/t4.png"), this.leftPos + 197, this.topPos + 146, 0, 0, 150, 70, 150, 70);

		guiGraphics.blit(new ResourceLocation("officialpowergemssmp:textures/screens/t5.png"), this.leftPos + 99, this.topPos + 71, 0, 0, 150, 70, 150, 70);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.officialpowergemssmp.recipes.label_recipes"), 154, 5, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
