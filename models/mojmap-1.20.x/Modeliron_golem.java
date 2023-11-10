// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeliron_golem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "iron_golem"), "main");
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;
	private final ModelPart mid;
	private final ModelPart bb_main;

	public Modeliron_golem(ModelPart root) {
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
		this.mid = root.getChild("mid");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(60, 24)
						.addBox(6.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 60)
						.addBox(4.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 20)
						.addBox(6.0F, -4.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(6.0F, -6.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 58)
						.addBox(6.0F, -8.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 58)
						.addBox(6.0F, -8.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 58)
						.addBox(4.0F, -8.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 56)
						.addBox(4.0F, -8.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 56)
						.addBox(4.0F, -10.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 56)
						.addBox(6.0F, -10.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 56)
						.addBox(6.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(4.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(6.0F, -6.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 58)
						.addBox(4.0F, -6.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 58)
						.addBox(4.0F, -6.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 16)
						.addBox(4.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 12)
						.addBox(6.0F, -4.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 60)
						.addBox(4.0F, -4.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 4)
						.addBox(4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 8)
						.addBox(6.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 48)
						.addBox(6.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 12)
						.addBox(4.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 16)
						.addBox(6.0F, -14.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 20)
						.addBox(6.0F, -16.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 48)
						.addBox(6.0F, -18.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 24)
						.addBox(6.0F, -18.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 28)
						.addBox(4.0F, -18.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 32)
						.addBox(4.0F, -18.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 48)
						.addBox(4.0F, -20.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 36)
						.addBox(6.0F, -20.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 40)
						.addBox(6.0F, -20.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 44)
						.addBox(4.0F, -20.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(6.0F, -16.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 50)
						.addBox(4.0F, -16.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 50)
						.addBox(4.0F, -16.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 50)
						.addBox(4.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 50)
						.addBox(6.0F, -14.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(4.0F, -14.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 52)
						.addBox(4.0F, -14.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 52)
						.addBox(6.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(36, 52)
						.addBox(-6.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 52)
						.addBox(-8.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 2)
						.addBox(-6.0F, -4.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 54)
						.addBox(-6.0F, -6.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 6)
						.addBox(-6.0F, -8.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 10)
						.addBox(-6.0F, -8.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 14)
						.addBox(-8.0F, -8.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 54)
						.addBox(-8.0F, -8.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 18)
						.addBox(-8.0F, -10.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 22)
						.addBox(-6.0F, -10.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 26)
						.addBox(-6.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 54)
						.addBox(-8.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 30)
						.addBox(-6.0F, -6.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 34)
						.addBox(-8.0F, -6.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 38)
						.addBox(-8.0F, -6.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 54)
						.addBox(-8.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 42)
						.addBox(-6.0F, -4.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 46)
						.addBox(-8.0F, -4.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 50)
						.addBox(-8.0F, -4.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 54)
						.addBox(-6.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 18)
						.addBox(-6.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 22)
						.addBox(-8.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 26)
						.addBox(-6.0F, -14.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 42)
						.addBox(-6.0F, -16.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 30)
						.addBox(-6.0F, -18.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 34)
						.addBox(-6.0F, -18.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 38)
						.addBox(-8.0F, -18.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 42)
						.addBox(-8.0F, -18.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(-8.0F, -20.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 44)
						.addBox(-6.0F, -20.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 44)
						.addBox(-6.0F, -20.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 44)
						.addBox(-8.0F, -20.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 46)
						.addBox(-6.0F, -16.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 46)
						.addBox(-8.0F, -16.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 46)
						.addBox(-8.0F, -16.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 46)
						.addBox(-8.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-6.0F, -14.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-8.0F, -14.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 4)
						.addBox(-8.0F, -14.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 8)
						.addBox(-6.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3",
				CubeListBuilder.create().texOffs(18, 42)
						.addBox(6.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 14)
						.addBox(4.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 10)
						.addBox(6.0F, -4.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 6)
						.addBox(6.0F, -6.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 42)
						.addBox(6.0F, -8.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 2)
						.addBox(6.0F, -8.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 40)
						.addBox(4.0F, -8.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 40)
						.addBox(4.0F, -8.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 40)
						.addBox(4.0F, -10.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(6.0F, -10.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 38)
						.addBox(6.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 38)
						.addBox(4.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 38)
						.addBox(6.0F, -6.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 36)
						.addBox(4.0F, -6.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 32)
						.addBox(4.0F, -6.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 28)
						.addBox(4.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 24)
						.addBox(6.0F, -4.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 36)
						.addBox(4.0F, -4.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 20)
						.addBox(4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 16)
						.addBox(6.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 12)
						.addBox(6.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 36)
						.addBox(4.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 8)
						.addBox(6.0F, -14.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 4)
						.addBox(6.0F, -16.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(6.0F, -18.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(6.0F, -18.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 34)
						.addBox(4.0F, -18.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 34)
						.addBox(4.0F, -18.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 34)
						.addBox(4.0F, -20.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 32)
						.addBox(6.0F, -20.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 32)
						.addBox(6.0F, -20.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(4.0F, -20.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 30)
						.addBox(6.0F, -16.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 26)
						.addBox(4.0F, -16.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 22)
						.addBox(4.0F, -16.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 18)
						.addBox(4.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 30)
						.addBox(6.0F, -14.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 14)
						.addBox(4.0F, -14.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 10)
						.addBox(4.0F, -14.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(6.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -12.0F));

		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(6, 30)
						.addBox(6.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 2)
						.addBox(4.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 28)
						.addBox(6.0F, -4.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 28)
						.addBox(6.0F, -6.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(6.0F, -8.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 26)
						.addBox(6.0F, -8.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 26)
						.addBox(4.0F, -8.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
						.addBox(4.0F, -8.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 20)
						.addBox(4.0F, -10.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
						.addBox(6.0F, -10.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 12)
						.addBox(6.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 24)
						.addBox(4.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 8)
						.addBox(6.0F, -6.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 4)
						.addBox(4.0F, -6.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(4.0F, -6.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(4.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 22)
						.addBox(6.0F, -4.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 22)
						.addBox(4.0F, -4.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 20)
						.addBox(4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(6.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(6.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 14)
						.addBox(4.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 10)
						.addBox(6.0F, -14.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 6)
						.addBox(6.0F, -16.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 18)
						.addBox(6.0F, -18.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 2)
						.addBox(6.0F, -18.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 16)
						.addBox(4.0F, -18.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(4.0F, -18.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 14)
						.addBox(4.0F, -20.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 12)
						.addBox(6.0F, -20.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 8)
						.addBox(6.0F, -20.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 4)
						.addBox(4.0F, -20.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(6.0F, -16.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(4.0F, -16.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(4.0F, -16.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(4.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
						.addBox(6.0F, -14.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 2)
						.addBox(4.0F, -14.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(4.0F, -14.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-12.0F, 24.0F, -12.0F));

		PartDefinition mid = partdefinition.addOrReplaceChild("mid",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -22.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -22.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -22.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -22.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -22.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -22.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -22.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -22.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -22.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -22.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -22.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -22.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -22.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -22.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -22.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -22.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -22.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -22.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -22.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -22.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -22.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-10, -10)
						.addBox(-6.0F, -22.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -22.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -22.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -22.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -22.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -22.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -22.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -22.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -22.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(-14, -14)
				.addBox(-8.0F, -34.0F, -8.0F, 16.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mid.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}