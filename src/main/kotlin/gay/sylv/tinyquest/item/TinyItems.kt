package gay.sylv.tinyquest.item

import gay.sylv.tinyquest.Initializable
import gay.sylv.tinyquest.block.TinyBlocks
import gay.sylv.tinyquest.id
import net.minecraft.item.BlockItem
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings

object TinyItems : Initializable {
	val RICH_DIRT: BlockItem = Registry.register(Registries.ITEM, id("rich_dirt"), BlockItem(TinyBlocks.RICH_DIRT, QuiltItemSettings()))
	val VIBRANT_GRASS: BlockItem = Registry.register(Registries.ITEM, id("vibrant_grass"), BlockItem(TinyBlocks.VIBRANT_GRASS, QuiltItemSettings()))
	val CORRUPT_GRASS: BlockItem = Registry.register(Registries.ITEM, id("corrupt_grass"), BlockItem(TinyBlocks.CORRUPT_GRASS, QuiltItemSettings()))
	val FROZEN_GRASS: BlockItem = Registry.register(Registries.ITEM, id("frozen_grass"), BlockItem(TinyBlocks.FROZEN_GRASS, QuiltItemSettings()))
	val SEA_SURVIN: BlockItem = Registry.register(Registries.ITEM, id("sea_survin"), BlockItem(TinyBlocks.SURVIN, QuiltItemSettings()))
	val VIBRANT_FLOWERS: BlockItem = Registry.register(Registries.ITEM, id("vibrant_flowers"), BlockItem(TinyBlocks.VIBRANT_FLOWERS, QuiltItemSettings()))
	
	override fun initialize() {
	}
}