package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomBlock;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomDoor;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomDoubleSlab;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomHalfSlab;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomStairs;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomTrapDoor;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomWall;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomArmor;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomAxe;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomBow;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomHoe;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomPickaxe;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomSpade;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemEmeraldBow;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemGoldBow;


@Mod(modid = ModEmeraldMaterial.MODID, useMetadata = true, acceptedMinecraftVersions="[1.10,1.11)", acceptableRemoteVersions="1.10,1.11)")
public class ModEmeraldMaterial {

	public static final String MODID = "mod_emeraldmaterial";
	
	@SidedProxy(clientSide="net.unladenswallow.minecraft.emeraldmaterial.ClientProxy", serverSide="net.unladenswallow.minecraft.emeraldmaterial.ServerProxy")
	public static CommonProxy proxy;
	
	public static Item emeraldHelmet;
	public static Item emeraldChest;
	public static Item emeraldPants;
	public static Item emeraldBoots;
	
	public static Item emeraldSword;
	public static Item emeraldBroadsword;
	public static Item emeraldBow;

	public static Item emeraldAxe;
	public static Item emeraldHoe;
	public static Item emeraldPickaxe;
	public static Item emeraldSpade;
	
	public static BlockCustomStairs emeraldStairs;
	public static BlockCustomWall emeraldWall;
	public static BlockCustomHalfSlab emeraldHalfSlab;
	public static BlockCustomDoubleSlab emeraldDoubleSlab;

	public static Item emeraldDoor;
	public static BlockCustomDoor emeraldDoorBlock;
	public static BlockCustomTrapDoor emeraldTrapdoor;
	

	public static Item obsidianIngot;
	public static Item obsidianHelmet;
	public static Item obsidianChest;
	public static Item obsidianPants;
	public static Item obsidianBoots;

	public static Item obsidianSword;
	public static Item obsidianBroadsword;
	public static Item obsidianBow;

	public static Item obsidianAxe;
	public static Item obsidianHoe;
	public static Item obsidianPickaxe;
	public static Item obsidianSpade;

	public static BlockCustomStairs obsidianStairs;
	public static BlockCustomHalfSlab obsidianHalfSlab;
	public static BlockCustomDoubleSlab obsidianDoubleSlab;
	public static BlockCustomWall obsidianWall;

	public static BlockCustomDoor obsidianDoorBlock;
	public static Item obsidianDoor;
	public static BlockCustomTrapDoor obsidianTrapdoor;

	public static Block polishedObsidian;
	
	public static Item lapisHelmet;
	public static Item lapisChest;
	public static Item lapisPants;
	public static Item lapisBoots;
	
	public static Item lapisSword;
	public static Item lapisBroadsword;
	public static Item lapisBow;

	public static Item lapisAxe;
	public static Item lapisHoe;
	public static Item lapisPickaxe;
	public static Item lapisSpade;

	public static BlockCustomStairs lapisStairs;
	public static BlockCustomHalfSlab lapisHalfSlab;
	public static BlockCustomDoubleSlab lapisDoubleSlab;
	public static BlockCustomWall lapisWall;

	public static BlockCustomDoor lapisDoorBlock;
	public static Item lapisDoor;
	public static BlockCustomTrapDoor lapisTrapdoor;

	public static Item redstoneHelmet;
	public static Item redstoneChest;
	public static Item redstonePants;
	public static Item redstoneBoots;
	
	public static Item redstoneSword;
	public static Item redstoneBroadsword;
	public static Item redstoneBow;

	public static Item redstoneAxe;
	public static Item redstoneHoe;
	public static Item redstonePickaxe;
	public static Item redstoneSpade;

	public static BlockCustomStairs redstoneStairs;
	public static BlockCustomHalfSlab redstoneHalfSlab;
	public static BlockCustomDoubleSlab redstoneDoubleSlab;
	public static BlockCustomWall redstoneWall;

	public static BlockCustomDoor redstoneDoorBlock;
	public static Item redstoneDoor;
	public static BlockCustomTrapDoor redstoneTrapdoor;

	
	public static Item goldBroadsword;
	public static Item goldBow;
	
	public static BlockCustomStairs goldStairs;
	public static BlockCustomHalfSlab goldHalfSlab;
	public static BlockCustomDoubleSlab goldDoubleSlab;
	public static BlockCustomWall goldWall;

	public static BlockCustomDoor goldDoorBlock;
	public static Item goldDoor;
	public static BlockCustomTrapDoor goldTrapdoor;


	public static Item ironBroadsword;
	public static Item ironBow;

	public static BlockCustomStairs ironStairs;
	public static BlockCustomWall ironWall;
	public static BlockCustomHalfSlab ironHalfSlab;
	public static BlockCustomDoubleSlab ironDoubleSlab;

	
	public static Item diamondBroadsword;
	public static Item diamondBow;

	public static BlockCustomStairs diamondStairs;
	public static BlockCustomWall diamondWall;
	public static BlockCustomHalfSlab diamondHalfSlab;
	public static BlockCustomDoubleSlab diamondDoubleSlab;

	public static Item diamondDoor;
	public static BlockCustomDoor diamondDoorBlock;
	public static BlockCustomTrapDoor diamondTrapdoor;

	
	public static BlockCustomBlock diamondObsidianBlock;
	public static Item diamondObsidianIngot;
	public static Item diamondObsidianHelmet;
	public static Item diamondObsidianChest;
	public static Item diamondObsidianPants;
	public static Item diamondObsidianBoots;

	public static Item diamondObsidianSword;
	public static Item diamondObsidianBroadsword;
	public static Item diamondObsidianBow;

	public static Item diamondObsidianAxe;
	public static Item diamondObsidianHoe;
	public static Item diamondObsidianPickaxe;
	public static Item diamondObsidianSpade;

    public static BlockCustomStairs diamondObsidianStairs;
    public static BlockCustomWall diamondObsidianWall;
    public static BlockCustomHalfSlab diamondObsidianHalfSlab;
    public static BlockCustomDoubleSlab diamondObsidianDoubleSlab;

    public static Item diamondObsidianDoor;
    public static BlockCustomDoor diamondObsidianDoorBlock;
    public static BlockCustomTrapDoor diamondObsidianTrapdoor;

    
	public static ModEmeraldMaterial instance = new ModEmeraldMaterial();

	public static EMEventHandler eventHandler = new EMEventHandler();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preInitEvent) {
		ModEmeraldMaterial.proxy.preInit(preInitEvent);

		/* Items that are referenced by ItemMaterials must be defined before we use ItemMaterials */
		obsidianIngot = (new Item())
		        .setUnlocalizedName("obsidian_ingot")
		        .setRegistryName("obsidian_ingot")
		        .setCreativeTab(CreativeTabs.MATERIALS);
		diamondObsidianIngot = (new Item())
		        .setUnlocalizedName("diamond-obsidian_ingot")
		        .setRegistryName("diamond-obsidian_ingot")
		        .setCreativeTab(CreativeTabs.MATERIALS);

		/* **************    Emerald Items and Blocks   ********************* */
		emeraldHelmet = new ItemCustomArmor("emerald_helmet", 1, EntityEquipmentSlot.HEAD, ItemMaterials.emeraldArmorMaterial, MobEffects.SPEED);
		emeraldChest = new ItemCustomArmor("emerald_chest", 1, EntityEquipmentSlot.CHEST, ItemMaterials.emeraldArmorMaterial, MobEffects.SPEED);
		emeraldPants = new ItemCustomArmor("emerald_pants", 2, EntityEquipmentSlot.LEGS, ItemMaterials.emeraldArmorMaterial, MobEffects.SPEED);
		emeraldBoots = new ItemCustomArmor("emerald_boots", 1, EntityEquipmentSlot.FEET, ItemMaterials.emeraldArmorMaterial, MobEffects.SPEED);

		emeraldSword = (new ItemSword(ItemMaterials.emeraldToolMaterial))
		        .setUnlocalizedName("emerald_sword")
		        .setRegistryName("emerald_sword");
		emeraldBroadsword = (new ItemSword(ItemMaterials.emeraldBroadswordMaterial))
		        .setUnlocalizedName("emerald_broadsword")
		        .setRegistryName("emerald_broadsword");
		emeraldBow = new ItemEmeraldBow();

		emeraldAxe = new ItemCustomAxe(ItemMaterials.emeraldToolMaterial, "emerald_axe");
		emeraldHoe = new ItemCustomHoe(ItemMaterials.emeraldToolMaterial, "emerald_hoe");
		emeraldPickaxe = new ItemCustomPickaxe(ItemMaterials.emeraldToolMaterial, "emerald_pickaxe");
		emeraldSpade = new ItemCustomSpade(ItemMaterials.emeraldToolMaterial, "emerald_spade");
		
		emeraldStairs = new BlockCustomStairs(Blocks.EMERALD_BLOCK, "emerald_stairs");
		emeraldWall = new BlockCustomWall(Blocks.EMERALD_BLOCK, "emerald_wall");
		emeraldHalfSlab = new BlockCustomHalfSlab(Blocks.EMERALD_BLOCK, "emerald_half_slab");
		emeraldDoubleSlab = new BlockCustomDoubleSlab(Blocks.EMERALD_BLOCK, emeraldHalfSlab, "emerald_double_slab");

		emeraldDoorBlock = new BlockCustomDoor(Blocks.EMERALD_BLOCK, "emerald_door");
		(emeraldDoor = new ItemDoor(emeraldDoorBlock))
		    .setUnlocalizedName("emerald_door")
		    .setRegistryName("emerald_door");
		emeraldDoorBlock.setDropItem(emeraldDoor);
		emeraldTrapdoor = new BlockCustomTrapDoor(Blocks.EMERALD_BLOCK, "emerald_trapdoor");

		GameRegistry.register(emeraldHelmet);
		GameRegistry.register(emeraldChest);
		GameRegistry.register(emeraldPants);
		GameRegistry.register(emeraldBoots);
		
		GameRegistry.register(emeraldSword);
		GameRegistry.register(emeraldBroadsword);
		GameRegistry.register(emeraldBow);
		
		GameRegistry.register(emeraldAxe);
		GameRegistry.register(emeraldHoe);
		GameRegistry.register(emeraldPickaxe);
		GameRegistry.register(emeraldSpade);
		
		GameRegistry.register(emeraldStairs);
        GameRegistry.register(emeraldStairs.getItemBlock());
		GameRegistry.register(emeraldWall);
        GameRegistry.register(emeraldWall.getItemBlock());
        GameRegistry.register(emeraldHalfSlab);
        GameRegistry.register(new ItemSlab(emeraldHalfSlab, emeraldHalfSlab, emeraldDoubleSlab).setRegistryName("emerald_half_slab"));
        GameRegistry.register(emeraldDoubleSlab);

		GameRegistry.register(emeraldDoor);
		GameRegistry.register(emeraldDoorBlock);
		GameRegistry.register(emeraldTrapdoor);
        GameRegistry.register(emeraldTrapdoor.getItemBlock());
		

		//		GameRegistry.register(emeraldHorseArmor, "emerald_horse_armor");

		/* **************    Obsidian Items and Blocks   ********************* */
		obsidianHelmet = new ItemCustomArmor("obsidian_helmet", 1, EntityEquipmentSlot.HEAD, ItemMaterials.obsidianArmorMaterial, null);
		obsidianChest = new ItemCustomArmor("obsidian_chest", 1, EntityEquipmentSlot.CHEST, ItemMaterials.obsidianArmorMaterial, null);
		obsidianPants = new ItemCustomArmor("obsidian_pants", 2, EntityEquipmentSlot.LEGS, ItemMaterials.obsidianArmorMaterial, null);
		obsidianBoots = new ItemCustomArmor("obsidian_boots", 1, EntityEquipmentSlot.FEET, ItemMaterials.obsidianArmorMaterial, null);

		obsidianAxe = new ItemCustomAxe(ItemMaterials.obsidianToolMaterial, "obsidian_axe");
		obsidianHoe = new ItemCustomHoe(ItemMaterials.obsidianToolMaterial, "obsidian_hoe");
		obsidianPickaxe = new ItemCustomPickaxe(ItemMaterials.obsidianToolMaterial, "obsidian_pickaxe");
		obsidianSpade = new ItemCustomSpade(ItemMaterials.obsidianToolMaterial, "obsidian_spade");

		obsidianSword = (new ItemSword(ItemMaterials.obsidianToolMaterial))
		    .setUnlocalizedName("obsidian_sword")
		    .setRegistryName("obsidian_sword");
		obsidianBroadsword = (new ItemSword(ItemMaterials.obsidianBroadswordMaterial))
		    .setUnlocalizedName("obsidian_broadsword")
		    .setRegistryName("obsidian_broadsword");
		(obsidianBow = new ItemCustomBow("obsidian_bow")).setMaxDamage(600);
		
		obsidianStairs = new BlockCustomStairs(Blocks.OBSIDIAN, "obsidian_stairs");
		obsidianWall = new BlockCustomWall(Blocks.OBSIDIAN, "obsidian_wall");
		obsidianHalfSlab = new BlockCustomHalfSlab(Blocks.OBSIDIAN, "obsidian_half_slab");
		obsidianDoubleSlab = new BlockCustomDoubleSlab(Blocks.OBSIDIAN, obsidianHalfSlab, "obsidian_double_slab");

		obsidianDoorBlock = new BlockCustomDoor(Blocks.OBSIDIAN, "obsidian_door").setInteractive(true);
		(obsidianDoor = new ItemDoor(obsidianDoorBlock))
		    .setUnlocalizedName("obsidian_door")
		    .setRegistryName("obsidian_door");
		obsidianDoorBlock.setDropItem(obsidianDoor);
		obsidianTrapdoor = new BlockCustomTrapDoor(Blocks.OBSIDIAN, "obsidian_trapdoor");

		(polishedObsidian = new Block(Blocks.OBSIDIAN.getDefaultState().getMaterial()))
		    .setUnlocalizedName("polished_obsidian")
		    .setRegistryName("polished_obsidian")
		    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
		    .setHardness(ItemMaterials.getBlockHardness(Blocks.OBSIDIAN));
		
		GameRegistry.register(obsidianIngot);
		GameRegistry.register(obsidianHelmet);
		GameRegistry.register(obsidianChest);
		GameRegistry.register(obsidianPants);
		GameRegistry.register(obsidianBoots);
		
		GameRegistry.register(obsidianSword);
		GameRegistry.register(obsidianBroadsword);
		GameRegistry.register(obsidianBow);

		GameRegistry.register(obsidianAxe);
		GameRegistry.register(obsidianHoe);
		GameRegistry.register(obsidianPickaxe);
		GameRegistry.register(obsidianSpade);

		GameRegistry.register(obsidianStairs);
        GameRegistry.register(obsidianStairs.getItemBlock());
		GameRegistry.register(obsidianWall);
        GameRegistry.register(obsidianWall.getItemBlock());
        GameRegistry.register(obsidianHalfSlab);
        GameRegistry.register(new ItemSlab(obsidianHalfSlab, obsidianHalfSlab, obsidianDoubleSlab).setRegistryName("obsidian_half_slab"));
        GameRegistry.register(obsidianDoubleSlab);

		GameRegistry.register(obsidianDoor);
		GameRegistry.register(obsidianDoorBlock);
		GameRegistry.register(obsidianTrapdoor);
        GameRegistry.register(obsidianTrapdoor.getItemBlock());
		
		GameRegistry.register(polishedObsidian);

		
		/* **************    Lapis Items and Blocks   ********************* */
		lapisHelmet = new ItemCustomArmor("lapis_helmet", 1, EntityEquipmentSlot.HEAD, ItemMaterials.lapisArmorMaterial, MobEffects.WATER_BREATHING);
		lapisChest = new ItemCustomArmor("lapis_chest", 1, EntityEquipmentSlot.CHEST, ItemMaterials.lapisArmorMaterial, null);
		lapisPants = new ItemCustomArmor("lapis_pants", 2, EntityEquipmentSlot.LEGS, ItemMaterials.lapisArmorMaterial, null);
		lapisBoots = new ItemCustomArmor("lapis_boots", 1, EntityEquipmentSlot.FEET, ItemMaterials.lapisArmorMaterial, null);

		lapisAxe = new ItemCustomAxe(ItemMaterials.lapisToolMaterial, "lapis_axe");
		lapisHoe = new ItemCustomHoe(ItemMaterials.lapisToolMaterial, "lapis_hoe");
		lapisPickaxe = new ItemCustomPickaxe(ItemMaterials.lapisToolMaterial, "lapis_pickaxe");
		lapisSpade = new ItemCustomSpade(ItemMaterials.lapisToolMaterial, "lapis_spade");

		lapisSword = (new ItemSword(ItemMaterials.lapisToolMaterial))
		        .setUnlocalizedName("lapis_sword")
		        .setRegistryName("lapis_sword");
		lapisBroadsword = (new ItemSword(ItemMaterials.lapisBroadswordMaterial))
		        .setUnlocalizedName("lapis_broadsword")
		        .setRegistryName("lapis_broadsword");
		(lapisBow = new ItemCustomBow("lapis_bow")).setMaxDamage(200);
		
		lapisStairs = new BlockCustomStairs(Blocks.LAPIS_BLOCK, "lapis_stairs");
		lapisWall = new BlockCustomWall(Blocks.LAPIS_BLOCK, "lapis_wall");
		lapisHalfSlab = new BlockCustomHalfSlab(Blocks.LAPIS_BLOCK, "lapis_half_slab");
		lapisDoubleSlab = new BlockCustomDoubleSlab(Blocks.LAPIS_BLOCK, lapisHalfSlab, "lapis_double_slab");

		lapisDoorBlock = new BlockCustomDoor(Blocks.LAPIS_BLOCK, "lapis_door").setInteractive(true);
		(lapisDoor = new ItemDoor(lapisDoorBlock))
		    .setUnlocalizedName("lapis_door")
		    .setRegistryName("lapis_door");
		lapisDoorBlock.setDropItem(lapisDoor);
		lapisTrapdoor = new BlockCustomTrapDoor(Blocks.LAPIS_BLOCK, "lapis_trapdoor");

		GameRegistry.register(lapisHelmet);
		GameRegistry.register(lapisChest);
		GameRegistry.register(lapisPants);
		GameRegistry.register(lapisBoots);
		
		GameRegistry.register(lapisSword);
		GameRegistry.register(lapisBroadsword);
		GameRegistry.register(lapisBow);

		GameRegistry.register(lapisAxe);
		GameRegistry.register(lapisHoe);
		GameRegistry.register(lapisPickaxe);
		GameRegistry.register(lapisSpade);

		GameRegistry.register(lapisStairs);
        GameRegistry.register(lapisStairs.getItemBlock());
		GameRegistry.register(lapisWall);
        GameRegistry.register(lapisWall.getItemBlock());
        GameRegistry.register(lapisHalfSlab);
        GameRegistry.register(new ItemSlab(lapisHalfSlab, lapisHalfSlab, lapisDoubleSlab).setRegistryName("lapis_half_slab"));
        GameRegistry.register(lapisDoubleSlab);

		GameRegistry.register(lapisDoor);
		GameRegistry.register(lapisDoorBlock);
		GameRegistry.register(lapisTrapdoor);
        GameRegistry.register(lapisTrapdoor.getItemBlock());
		
		
		/* **************    Redstone Items and Blocks   ********************* */
		redstoneHelmet = new ItemCustomArmor("redstone_helmet", 1, EntityEquipmentSlot.HEAD, ItemMaterials.redstoneArmorMaterial, MobEffects.NIGHT_VISION);
		redstoneChest = new ItemCustomArmor("redstone_chest", 1, EntityEquipmentSlot.CHEST, ItemMaterials.redstoneArmorMaterial, null);
		redstonePants = new ItemCustomArmor("redstone_pants", 2, EntityEquipmentSlot.LEGS, ItemMaterials.redstoneArmorMaterial, null);
		redstoneBoots = new ItemCustomArmor("redstone_boots", 1, EntityEquipmentSlot.FEET, ItemMaterials.redstoneArmorMaterial, null);

		redstoneAxe = new ItemCustomAxe(ItemMaterials.redstoneToolMaterial, "redstone_axe");
		redstoneHoe = new ItemCustomHoe(ItemMaterials.redstoneToolMaterial, "redstone_hoe");
		redstonePickaxe = new ItemCustomPickaxe(ItemMaterials.redstoneToolMaterial, "redstone_pickaxe");
		redstoneSpade = new ItemCustomSpade(ItemMaterials.redstoneToolMaterial, "redstone_spade");

		redstoneSword = (new ItemSword(ItemMaterials.redstoneToolMaterial))
		        .setUnlocalizedName("redstone_sword")
		        .setRegistryName("redstone_sword");
		redstoneBroadsword = (new ItemSword(ItemMaterials.redstoneBroadswordMaterial))
		        .setUnlocalizedName("redstone_broadsword")
		        .setRegistryName("redstone_broadsword");
		(redstoneBow = new ItemCustomBow("redstone_bow")).setMaxDamage(200);
		
		redstoneStairs = new BlockCustomStairs(Blocks.REDSTONE_BLOCK, "redstone_stairs");
		redstoneWall = new BlockCustomWall(Blocks.REDSTONE_BLOCK, "redstone_wall");
		redstoneHalfSlab = new BlockCustomHalfSlab(Blocks.REDSTONE_BLOCK, "redstone_half_slab");
		redstoneDoubleSlab = new BlockCustomDoubleSlab(Blocks.REDSTONE_BLOCK, redstoneHalfSlab, "redstone_double_slab");

		redstoneDoorBlock = new BlockCustomDoor(Blocks.REDSTONE_BLOCK, "redstone_door").setInteractive(true);
		(redstoneDoor = new ItemDoor(redstoneDoorBlock))
		    .setUnlocalizedName("redstone_door")
		    .setRegistryName("redstone_door");
		redstoneDoorBlock.setDropItem(redstoneDoor);
		redstoneTrapdoor = new BlockCustomTrapDoor(Blocks.REDSTONE_BLOCK, "redstone_trapdoor");

		GameRegistry.register(redstoneHelmet);
		GameRegistry.register(redstoneChest);
		GameRegistry.register(redstonePants);
		GameRegistry.register(redstoneBoots);
		
		GameRegistry.register(redstoneSword);
		GameRegistry.register(redstoneBroadsword);
		GameRegistry.register(redstoneBow);

		GameRegistry.register(redstoneAxe);
		GameRegistry.register(redstoneHoe);
		GameRegistry.register(redstonePickaxe);
		GameRegistry.register(redstoneSpade);

		GameRegistry.register(redstoneStairs);
        GameRegistry.register(redstoneStairs.getItemBlock());
		GameRegistry.register(redstoneWall);
        GameRegistry.register(redstoneWall.getItemBlock());
        GameRegistry.register(redstoneHalfSlab);
        GameRegistry.register(new ItemSlab(redstoneHalfSlab, redstoneHalfSlab, redstoneDoubleSlab).setRegistryName("redstone_half_slab"));
        GameRegistry.register(redstoneDoubleSlab);

		GameRegistry.register(redstoneDoor);
		GameRegistry.register(redstoneDoorBlock);
		GameRegistry.register(redstoneTrapdoor);
        GameRegistry.register(redstoneTrapdoor.getItemBlock());
		
		
		/* **************    Gold Blocks   ********************* */
		goldBroadsword = (new ItemSword(ItemMaterials.goldBroadswordMaterial))
		        .setUnlocalizedName("gold_broadsword")
		        .setRegistryName("gold_broadsword");
		goldBow = new ItemGoldBow();

		goldStairs = new BlockCustomStairs(Blocks.GOLD_BLOCK, "gold_stairs");
		goldWall = new BlockCustomWall(Blocks.GOLD_BLOCK, "gold_wall");
		goldHalfSlab = new BlockCustomHalfSlab(Blocks.GOLD_BLOCK, "gold_half_slab");
		goldDoubleSlab = new BlockCustomDoubleSlab(Blocks.GOLD_BLOCK, goldHalfSlab, "gold_double_slab");

		goldDoorBlock = new BlockCustomDoor(Blocks.GOLD_BLOCK, "gold_door").setInteractive(true);
		(goldDoor = new ItemDoor(goldDoorBlock))
		    .setUnlocalizedName("gold_door")
		    .setRegistryName("gold_door");
		goldDoorBlock.setDropItem(goldDoor);
		goldTrapdoor = new BlockCustomTrapDoor(Blocks.GOLD_BLOCK, "gold_trapdoor");

		GameRegistry.register(goldBroadsword);
		GameRegistry.register(goldBow);

		GameRegistry.register(goldStairs);
        GameRegistry.register(goldStairs.getItemBlock());
		GameRegistry.register(goldWall);
        GameRegistry.register(goldWall.getItemBlock());
        GameRegistry.register(goldHalfSlab);
        GameRegistry.register(new ItemSlab(goldHalfSlab, goldHalfSlab, goldDoubleSlab).setRegistryName("gold_half_slab"));
        GameRegistry.register(goldDoubleSlab);

		GameRegistry.register(goldDoor);
		GameRegistry.register(goldDoorBlock);
		GameRegistry.register(goldTrapdoor);
        GameRegistry.register(goldTrapdoor.getItemBlock());
		
		
		
		/* **************    Iron Blocks   ********************* */
		ironBroadsword = (new ItemSword(ItemMaterials.ironBroadswordMaterial))
		        .setUnlocalizedName("iron_broadsword")
		        .setRegistryName("iron_broadsword");
		(ironBow = new ItemCustomBow("iron_bow")).setMaxDamage(430);

		ironStairs = new BlockCustomStairs(Blocks.IRON_BLOCK, "iron_stairs");
		ironWall = new BlockCustomWall(Blocks.IRON_BLOCK, "iron_wall");
		ironHalfSlab = new BlockCustomHalfSlab(Blocks.IRON_BLOCK, "iron_half_slab");
		ironDoubleSlab = new BlockCustomDoubleSlab(Blocks.IRON_BLOCK, ironHalfSlab, "iron_double_slab");

		GameRegistry.register(ironBroadsword);
		GameRegistry.register(ironBow);

		GameRegistry.register(ironStairs);
        GameRegistry.register(ironStairs.getItemBlock());
		GameRegistry.register(ironWall);
        GameRegistry.register(ironWall.getItemBlock());
        GameRegistry.register(ironHalfSlab);
        GameRegistry.register(new ItemSlab(ironHalfSlab, ironHalfSlab, ironDoubleSlab).setRegistryName("iron_half_slab"));
        GameRegistry.register(ironDoubleSlab);

		
		/* **************    Diamond Blocks   ********************* */
		diamondBroadsword = (new ItemSword(ItemMaterials.diamondBroadswordMaterial))
		        .setUnlocalizedName("diamond_broadsword")
		        .setRegistryName("diamond_broadsword");
		(diamondBow = new ItemCustomBow("diamond_bow")).setMaxDamage(480);

		diamondStairs = new BlockCustomStairs(Blocks.DIAMOND_BLOCK, "diamond_stairs");
		diamondWall = new BlockCustomWall(Blocks.DIAMOND_BLOCK, "diamond_wall");
		diamondHalfSlab = new BlockCustomHalfSlab(Blocks.DIAMOND_BLOCK, "diamond_half_slab");
		diamondDoubleSlab = new BlockCustomDoubleSlab(Blocks.DIAMOND_BLOCK, diamondHalfSlab, "diamond_double_slab");

		diamondDoorBlock = new BlockCustomDoor(Blocks.DIAMOND_BLOCK, "diamond_door");
		(diamondDoor = new ItemDoor(diamondDoorBlock))
		    .setUnlocalizedName("diamond_door")
		    .setRegistryName("diamond_door");
		diamondDoorBlock.setDropItem(diamondDoor);
		diamondTrapdoor = new BlockCustomTrapDoor(Blocks.DIAMOND_BLOCK, "diamond_trapdoor");

		GameRegistry.register(diamondBroadsword);
		GameRegistry.register(diamondBow);

		GameRegistry.register(diamondStairs);
		GameRegistry.register(diamondStairs.getItemBlock());
        GameRegistry.register(diamondWall);
		GameRegistry.register(diamondWall.getItemBlock());
		GameRegistry.register(diamondHalfSlab);
        GameRegistry.register(diamondDoubleSlab);
        GameRegistry.register(new ItemSlab(diamondHalfSlab, diamondHalfSlab, diamondDoubleSlab).setRegistryName("diamond_half_slab"));

		GameRegistry.register(diamondDoor);
		GameRegistry.register(diamondDoorBlock);
		GameRegistry.register(diamondTrapdoor);
        GameRegistry.register(diamondTrapdoor.getItemBlock());

		
		/* **************    Diamond-Infused Obsidian Items and Blocks   ********************* */
		diamondObsidianBlock = new BlockCustomBlock(Blocks.OBSIDIAN.getDefaultState().getMaterial(), 
		                                            "diamond-obsidian_block", 
		                                            ItemMaterials.getBlockHardness(Blocks.OBSIDIAN), 
		                                            ItemMaterials.guessResistance(Blocks.OBSIDIAN));
		diamondObsidianHelmet = new ItemCustomArmor("diamond-obsidian_helmet", 1, EntityEquipmentSlot.HEAD, ItemMaterials.diamondObsidianArmorMaterial, null);
		diamondObsidianChest = new ItemCustomArmor("diamond-obsidian_chest", 1, EntityEquipmentSlot.CHEST, ItemMaterials.diamondObsidianArmorMaterial, null);
		diamondObsidianPants = new ItemCustomArmor("diamond-obsidian_pants", 2, EntityEquipmentSlot.LEGS, ItemMaterials.diamondObsidianArmorMaterial, null);
		diamondObsidianBoots = new ItemCustomArmor("diamond-obsidian_boots", 1, EntityEquipmentSlot.FEET, ItemMaterials.diamondObsidianArmorMaterial, null);

		diamondObsidianAxe = new ItemCustomAxe(ItemMaterials.diamondObsidianToolMaterial, "diamond-obsidian_axe");
		diamondObsidianHoe = new ItemCustomHoe(ItemMaterials.diamondObsidianToolMaterial, "diamond-obsidian_hoe");
		diamondObsidianPickaxe = new ItemCustomPickaxe(ItemMaterials.diamondObsidianToolMaterial, "diamond-obsidian_pickaxe") {
			@Override
		    public float getStrVsBlock(ItemStack stack, IBlockState blockstate)
		    {
		        return blockstate.getBlock() == Blocks.OBSIDIAN ? 16.0f : super.getStrVsBlock(stack, blockstate);
		    }
		};
		diamondObsidianSpade = new ItemCustomSpade(ItemMaterials.diamondObsidianToolMaterial, "diamond-obsidian_spade");

		diamondObsidianSword = (new ItemSword(ItemMaterials.diamondObsidianToolMaterial))
		        .setUnlocalizedName("diamond-obsidian_sword")
		        .setRegistryName("diamond-obsidian_sword");
		diamondObsidianBroadsword = (new ItemSword(ItemMaterials.diamondObsidianBroadswordMaterial))
		        .setUnlocalizedName("diamond-obsidian_broadsword")
		        .setRegistryName("diamond-obsidian_broadsword");
		(diamondObsidianBow = new ItemCustomBow("diamond-obsidian_bow")).setMaxDamage(600);

        diamondObsidianStairs = new BlockCustomStairs(diamondObsidianBlock, "diamond-obsidian_stairs");
        diamondObsidianWall = new BlockCustomWall(diamondObsidianBlock, "diamond-obsidian_wall");
        diamondObsidianHalfSlab = new BlockCustomHalfSlab(diamondObsidianBlock, "diamond-obsidian_half_slab");
        diamondObsidianDoubleSlab = new BlockCustomDoubleSlab(diamondObsidianBlock, diamondObsidianHalfSlab, "diamond-obsidian_double_slab");

        diamondObsidianDoorBlock = new BlockCustomDoor(diamondObsidianBlock, "diamond-obsidian_door");
        (diamondObsidianDoor = new ItemDoor(diamondObsidianDoorBlock))
            .setUnlocalizedName("diamond-obsidian_door")
            .setRegistryName("diamond-obsidian_door");
        diamondObsidianDoorBlock.setDropItem(diamondObsidianDoor);
        diamondObsidianTrapdoor = new BlockCustomTrapDoor(diamondObsidianBlock, "diamond-obsidian_trapdoor");

		GameRegistry.register(diamondObsidianBlock);
        GameRegistry.register(diamondObsidianBlock.getItemBlock());
		GameRegistry.register(diamondObsidianIngot);
		GameRegistry.register(diamondObsidianHelmet);
		GameRegistry.register(diamondObsidianChest);
		GameRegistry.register(diamondObsidianPants);
		GameRegistry.register(diamondObsidianBoots);
		
		GameRegistry.register(diamondObsidianSword);
		GameRegistry.register(diamondObsidianBroadsword);
		GameRegistry.register(diamondObsidianBow);

		GameRegistry.register(diamondObsidianAxe);
		GameRegistry.register(diamondObsidianHoe);
		GameRegistry.register(diamondObsidianPickaxe);
		GameRegistry.register(diamondObsidianSpade);

        GameRegistry.register(diamondObsidianStairs);
        GameRegistry.register(diamondObsidianStairs.getItemBlock());
        GameRegistry.register(diamondObsidianWall);
        GameRegistry.register(diamondObsidianWall.getItemBlock());
        GameRegistry.register(diamondObsidianHalfSlab);
        GameRegistry.register(new ItemSlab(diamondObsidianHalfSlab, diamondObsidianHalfSlab, diamondObsidianDoubleSlab).setRegistryName("diamond-obsidian_half_slab"));
        GameRegistry.register(diamondObsidianDoubleSlab);

        GameRegistry.register(diamondObsidianDoor);
        GameRegistry.register(diamondObsidianDoorBlock);
        GameRegistry.register(diamondObsidianTrapdoor);
        GameRegistry.register(diamondObsidianTrapdoor.getItemBlock());

		MinecraftForge.EVENT_BUS.register(eventHandler);
	}
	
	@EventHandler
	public void init (FMLInitializationEvent event) {
		ModEmeraldMaterial.proxy.init(event);
		EMLogger.info("Initializing " + ModEmeraldMaterial.MODID);
		addRecipes();
		addSmelting();
	}
	
	private void addRecipes() {
		addArmorRecipes(Items.EMERALD, emeraldHelmet, emeraldChest, emeraldPants, emeraldBoots);
		addToolRecipes(Items.EMERALD, emeraldAxe, emeraldHoe, emeraldPickaxe, emeraldSpade);
		addWeaponRecipes(Items.EMERALD, emeraldSword, emeraldBroadsword, emeraldBow);
		addBlockRecipes(Blocks.EMERALD_BLOCK, emeraldStairs, emeraldWall, emeraldHalfSlab);
		addMiscRecipes(Items.EMERALD, emeraldDoor);
		
		addArmorRecipes(obsidianIngot, obsidianHelmet, obsidianChest, obsidianPants, obsidianBoots);
		addToolRecipes(obsidianIngot, obsidianAxe, obsidianHoe, obsidianPickaxe, obsidianSpade);
		addWeaponRecipes(obsidianIngot, obsidianSword, obsidianBroadsword, obsidianBow);
		addBlockRecipes(Blocks.OBSIDIAN, obsidianStairs, obsidianWall, obsidianHalfSlab);
		addMiscRecipes(obsidianIngot, obsidianDoor);
		
		ItemStack lapis = new ItemStack(Items.DYE, 1, 4);
		addArmorRecipes(lapis, lapisHelmet, lapisChest, lapisPants, lapisBoots);
		addToolRecipes(lapis, lapisAxe, lapisHoe, lapisPickaxe, lapisSpade);
		addWeaponRecipes(lapis, lapisSword, lapisBroadsword, lapisBow);
		addBlockRecipes(Blocks.LAPIS_BLOCK, lapisStairs, lapisWall, lapisHalfSlab);
		addMiscRecipes(lapis, lapisDoor);

		addArmorRecipes(Items.REDSTONE, redstoneHelmet, redstoneChest, redstonePants, redstoneBoots);
		addToolRecipes(Items.REDSTONE, redstoneAxe, redstoneHoe, redstonePickaxe, redstoneSpade);
		addWeaponRecipes(Items.REDSTONE, redstoneSword, redstoneBroadsword, redstoneBow);
		addBlockRecipes(Blocks.REDSTONE_BLOCK, redstoneStairs, redstoneWall, redstoneHalfSlab);
		addMiscRecipes(Items.REDSTONE, redstoneDoor);

		addWeaponRecipes(Items.IRON_INGOT, null, ironBroadsword, ironBow);
        addBlockRecipes(Blocks.IRON_BLOCK, ironStairs, ironWall, ironHalfSlab);

        addWeaponRecipes(Items.GOLD_INGOT, null, goldBroadsword, goldBow);
        addBlockRecipes(Blocks.GOLD_BLOCK, goldStairs, goldWall, goldHalfSlab);
        addMiscRecipes(Items.GOLD_INGOT, goldDoor);

		addWeaponRecipes(Items.DIAMOND, null, diamondBroadsword, diamondBow);
        addBlockRecipes(Blocks.DIAMOND_BLOCK, diamondStairs, diamondWall, diamondHalfSlab);
        addMiscRecipes(Items.DIAMOND, diamondDoor);

		addArmorRecipes(diamondObsidianIngot, diamondObsidianHelmet, diamondObsidianChest, diamondObsidianPants, diamondObsidianBoots);
		addToolRecipes(diamondObsidianIngot, diamondObsidianAxe, diamondObsidianHoe, diamondObsidianPickaxe, diamondObsidianSpade);
		addWeaponRecipes(diamondObsidianIngot, diamondObsidianSword, diamondObsidianBroadsword, diamondObsidianBow);
        addBlockRecipes(diamondObsidianBlock, diamondObsidianStairs, diamondObsidianWall, diamondObsidianHalfSlab);
        addMiscRecipes(diamondObsidianIngot, diamondObsidianDoor);
		
		GameRegistry.addShapelessRecipe(new ItemStack(diamondObsidianBlock), Blocks.OBSIDIAN, Items.DIAMOND, Items.QUARTZ);
		
	}
	
	private void addMiscRecipes(Item recipeItem, Item door) {
		addMiscRecipes(new ItemStack(recipeItem), door);
	}
	@SuppressWarnings("unused") // Possible future use
    private void addMiscRecipes(Block recipeBlock, Item door) {
		addMiscRecipes(new ItemStack(recipeBlock), door);
	}
	private void addMiscRecipes(ItemStack recipeItemStack, Item door) {
		if (door != null) {
			GameRegistry.addRecipe(new ItemStack(door, 3),
					" AA",
					" AA",
					" AA",
					'A', recipeItemStack);
			GameRegistry.addRecipe(new ItemStack(door, 3),
					"AA ",
					"AA ",
					"AA ",
					'A', recipeItemStack);
		}
	}

    @SuppressWarnings("unused") // Possible future use
	private void addBlockRecipes(Item recipeItem, Block stairs, Block wall, Block halfSlab) {
		addBlockRecipes(new ItemStack(recipeItem), stairs, wall, halfSlab);
	}
	private void addBlockRecipes(Block recipeBlock, Block stairs, Block wall, Block halfSlab) {
		addBlockRecipes(new ItemStack(recipeBlock), stairs, wall, halfSlab);
	}
	private void addBlockRecipes(ItemStack recipeItemStack, Block stairs, Block wall, Block halfSlab) {
		if (halfSlab != null) {
			GameRegistry.addRecipe(new ItemStack(halfSlab, 6),
					"AAA",
					"   ",
					"   ",
					'A', recipeItemStack);
			GameRegistry.addRecipe(new ItemStack(halfSlab, 6),
					"   ",
					"AAA",
					"   ",
					'A', recipeItemStack);
			GameRegistry.addRecipe(new ItemStack(halfSlab, 6),
					"   ",
					"   ",
					"AAA",
					'A', recipeItemStack);
		}
		if (stairs != null) {
			GameRegistry.addRecipe(new ItemStack(stairs, 4),
					"A  ",
					"AA ",
					"AAA",
					'A', recipeItemStack);
			GameRegistry.addRecipe(new ItemStack(stairs, 4),
					"  A",
					" AA",
					"AAA",
					'A', recipeItemStack);
		}
		if (wall != null) {
			GameRegistry.addRecipe(new ItemStack(wall, 6),
					"   ",
					"AAA",
					"AAA",
					'A', recipeItemStack);
			GameRegistry.addRecipe(new ItemStack(wall, 6),
					"AAA",
					"AAA",
					"   ",
					'A', recipeItemStack);
		}
	}

	private void addWeaponRecipes(Item recipeItem, Item sword, Item broadsword, Item bow) {
		addWeaponRecipes(new ItemStack(recipeItem), sword, broadsword, bow);
	}
    @SuppressWarnings("unused") // Possible future use
	private void addWeaponRecipes(Block recipeBlock, Item sword, Item broadsword, Item bow) {
		addWeaponRecipes(new ItemStack(recipeBlock), sword, broadsword, bow);
	}
	private void addWeaponRecipes(ItemStack recipeItemStack, Item sword, Item broadsword, Item bow) {
		if (sword != null) {
			GameRegistry.addRecipe(new ItemStack(sword),
					" A ",
					" A ",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
		}
		if (broadsword != null) {
			GameRegistry.addRecipe(new ItemStack(broadsword),
					"AAA",
					"AAA",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
		}
		if (bow != null) {
			GameRegistry.addRecipe(new ItemStack(bow),
					"IS ",
					"I A",
					"IS ",
					'A', recipeItemStack,
					'S', Items.STICK,
					'I', Items.STRING);
			GameRegistry.addRecipe(new ItemStack(bow),
					" SI",
					"A I",
					" SI",
					'A', recipeItemStack,
					'S', Items.STICK,
					'I', Items.STRING);
		}
	}

	private void addToolRecipes(Item recipeItem, Item axe, Item hoe, Item pickaxe, Item spade) {
		addToolRecipes(new ItemStack(recipeItem), axe, hoe, pickaxe, spade);
	}
    @SuppressWarnings("unused") // Possible future use
	private void addToolRecipes(Block recipeBlock, Item axe, Item hoe, Item pickaxe, Item spade) {
		addToolRecipes(new ItemStack(recipeBlock), axe, hoe, pickaxe, spade);
	}
	private void addToolRecipes(ItemStack recipeItemStack, Item axe, Item hoe, Item pickaxe, Item spade) {
		if (axe != null) {
			GameRegistry.addRecipe(new ItemStack(axe),
					"AA ",
					"AS ",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(axe),
					" AA",
					" SA",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
		}
		if (hoe != null) {
			GameRegistry.addRecipe(new ItemStack(hoe),
					"AA ",
					" S ",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
			GameRegistry.addRecipe(new ItemStack(hoe),
					" AA",
					" S ",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
		}
		if (pickaxe != null) {
			GameRegistry.addRecipe(new ItemStack(pickaxe),
					"AAA",
					" S ",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
		}
		if (spade != null) {
			GameRegistry.addRecipe(new ItemStack(spade),
					" A ",
					" S ",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
		}
	}

	private void addArmorRecipes(Item recipeItem, Item helmet, Item chest, Item pants, Item boots) {
		addArmorRecipes(new ItemStack(recipeItem), helmet, chest, pants, boots);
	}
    @SuppressWarnings("unused") // Possible future use
	private void addArmorRecipes(Block recipeBlock, Item helmet, Item chest, Item pants, Item boots) {
		addArmorRecipes(new ItemStack(recipeBlock), helmet, chest, pants, boots);
	}
	private void addArmorRecipes(ItemStack recipeItemStack, Item helmet, Item chest, Item pants, Item boots) {
		if (helmet != null) {
			GameRegistry.addRecipe(new ItemStack(helmet),
					"AAA",
					"A A",
					"   ",
					'A', recipeItemStack);
		}
		if (chest != null) {
			GameRegistry.addRecipe(new ItemStack(chest),
					"A A",
					"AAA",
					"AAA",
					'A', recipeItemStack);
		}
		if (pants != null) {
			GameRegistry.addRecipe(new ItemStack(pants),
					"AAA",
					"A A",
					"A A",
					'A', recipeItemStack);
		}
		if (boots != null) {
			GameRegistry.addRecipe(new ItemStack(boots),
					"   ",
					"A A",
					"A A",
					'A', recipeItemStack);
		}
	}

	private void addSmelting() {
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(obsidianIngot), 1.2f);
		GameRegistry.addSmelting(diamondObsidianBlock, new ItemStack(diamondObsidianIngot), 1.5f);
	}

}
