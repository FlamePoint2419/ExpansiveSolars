package com.flamepoint.expansivesolars;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExpansiveSolars implements ModInitializer {
	
	public static final Block ENERGYCELL_TIER1 = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));	
	public static final Block ENERGYCELL_TIER2 = new Block(FabricBlockSettings.of(Material.METAL).strength(6.0f));	
	public static final Block ENERGYCELL_TIER3 = new Block(FabricBlockSettings.of(Material.METAL).strength(8.0f));	

	public static final Block ENERGYREACTOR_TIER1 = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));	
	public static final Block ENERGYREACTOR_TIER2 = new Block(FabricBlockSettings.of(Material.METAL).strength(6.0f));	
	public static final Block ENERGYREACTOR_TIER3 = new Block(FabricBlockSettings.of(Material.METAL).strength(8.0f));
	
	public static final Block SUBLIGHTENGINE = new Block(FabricBlockSettings.of(Material.METAL).strength(10.0f));	
	public static final Block FTLENGINE = new Block(FabricBlockSettings.of(Material.METAL).strength(10.0f));	
	
	public static final Block ENERGYCONDUIT = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));	
	
	public static final Block BEAMINGPLATFORM = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));	

	public static final Block LIFESUPPORT_TIER1 = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));	
	public static final Block LIFESUPPORT_TIER2 = new Block(FabricBlockSettings.of(Material.METAL).strength(6.0f));	
	public static final Block LIFESUPPORT_TIER3 = new Block(FabricBlockSettings.of(Material.METAL).strength(8.0f));

	public static final Block LOCALSENSOR = new Block(FabricBlockSettings.of(Material.METAL).strength(8.0f));	
	public static final Block DEEPSPACESENSOR = new Block(FabricBlockSettings.of(Material.METAL).strength(8.0f));	
	
	public static final ItemGroup ITEMGROUP_ESMAIN = FabricItemGroupBuilder.create(
			new Identifier("expansivesolars", "expansivesolarsmain"))
			.icon(() -> new ItemStack(ExpansiveSolars.ENERGYCELL_TIER2))
			.build();
	
	@Override
	public void onInitialize() {
		
		// Block Registry
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "energycell_tier1"), ENERGYCELL_TIER1);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "energycell_tier1"), new BlockItem(ENERGYCELL_TIER1, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "energycell_tier2"), ENERGYCELL_TIER2);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "energycell_tier2"), new BlockItem(ENERGYCELL_TIER2, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "energycell_tier3"), ENERGYCELL_TIER3);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "energycell_tier3"), new BlockItem(ENERGYCELL_TIER3, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));

        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "energyreactor_tier1"), ENERGYREACTOR_TIER1);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "energyreactor_tier1"), new BlockItem(ENERGYREACTOR_TIER1, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "energyreactor_tier2"), ENERGYREACTOR_TIER2);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "energyreactor_tier2"), new BlockItem(ENERGYREACTOR_TIER2, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "energyreactor_tier3"), ENERGYREACTOR_TIER3);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "energyreactor_tier3"), new BlockItem(ENERGYREACTOR_TIER3, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "energyconduit"), ENERGYCONDUIT);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "energyconduit"), new BlockItem(ENERGYCONDUIT, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "lifesupport_tier1"), LIFESUPPORT_TIER1);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "lifesupport_tier1"), new BlockItem(LIFESUPPORT_TIER1, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "lifesupport_tier2"), LIFESUPPORT_TIER2);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "lifesupport_tier2"), new BlockItem(LIFESUPPORT_TIER2, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "lifesupport_tier3"), LIFESUPPORT_TIER3);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "lifesupport_tier3"), new BlockItem(LIFESUPPORT_TIER3, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));

        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "engine_sublight"), SUBLIGHTENGINE);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "engine_sublight"), new BlockItem(SUBLIGHTENGINE, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "engine_ftl"), FTLENGINE);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "engine_ftl"), new BlockItem(FTLENGINE, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "beamingplatform"), BEAMINGPLATFORM);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "beamingplatform"), new BlockItem(BEAMINGPLATFORM, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "sensor_local"), LOCALSENSOR);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "sensor_local"), new BlockItem(LOCALSENSOR, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        Registry.register(Registry.BLOCK, new Identifier("expansivesolars", "sensor_space"), DEEPSPACESENSOR);
        Registry.register(Registry.ITEM, new Identifier("expansivesolars", "sensor_space"), new BlockItem(DEEPSPACESENSOR, new FabricItemSettings().group(ExpansiveSolars.ITEMGROUP_ESMAIN)));
        
	}
}
