package net.mcreator.test.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ChunMingShengChengProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Villager) {
			if (!(entity.getDisplayName().getString()).equals("\uFFFD\uFFFD\uFFFD\uFFFD\u02A6") && entity.getPersistentData().getBoolean("\uFFFD\uFFFD\uFFFD\uFFFD2") == false) {
				entity.getPersistentData().putBoolean("\uFFFD\uFFFD\uFFFD\uFFFD2", (true));
				if (Math.random() < 0.2) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon minecraft:villager ~ ~1 ~ {CustomName:\"\uFFFD\uFFFD\uFFFD\uFFFD\u02A6\",Health:17210,Attributes:[{Name:\"generic.maxHealth\",Base:17210}],Offers:{Recipes:[{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ "" + new java.text.DecimalFormat("0").format(+15) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cai_liao_02\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+7) + "b,Damage:0s},sell:{id:\"fabaokuozhan:po_shan\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+13) + "b,Damage:0s},sell:{id:\"fabaokuozhan:cailiao13\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+37) + "b,Damage:0s},sell:{id:\"fabaokuozhan:cailiao15\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:"
										+ new java.text.DecimalFormat("0").format(+1) + "b,Damage:0s},sell:{id:\"yvanchuxiuzhen:ming_fu_ling_fang\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:"
										+ new java.text.DecimalFormat("0").format(+3) + "b,Damage:0s},sell:{id:\"fabaokuozhan:cailiao19\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:"
										+ new java.text.DecimalFormat("0").format(+3) + "b,Damage:0s},sell:{id:\"fabaokuozhan:cailiao18\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:"
										+ new java.text.DecimalFormat("0").format(+2) + "b,Damage:0s},sell:{id:\"yvanchuxiuzhen:tian_gong_ling_fang\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+5) + "b,Damage:0s},sell:{id:\"flyinginstrument:gold_sword\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+5) + "b,Damage:0s},sell:{id:\"flyinginstrument:wood_sword\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+5) + "b,Damage:0s},sell:{id:\"flyinginstrument:water_sword\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+5) + "b,Damage:0s},sell:{id:\"flyinginstrument:fire_sword\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+5) + "b,Damage:0s},sell:{id:\"flyinginstrument:soil_sword\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+5) + "b,Damage:0s},sell:{id:\"flyinginstrument:leaf\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+5) + "b,Damage:0s},sell:{id:\"flyinginstrument:gourd\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+5) + "b,Damage:0s},sell:{id:\"flyinginstrument:boat\",Count:1b,Damage:0s}}]}}"));
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
				}
			}
			if (!(entity.getDisplayName().getString()).equals("\uFFFD\uFFFD\uFFFD\uFFFD\u02A6") && entity.getPersistentData().getBoolean("\uFFFD\uFFFD\uFFFD\uFFFD3") == false) {
				entity.getPersistentData().putBoolean("\uFFFD\uFFFD\uFFFD\uFFFD3", (true));
				if (Math.random() < 0.2) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("summon minecraft:villager ~ ~1 ~ {CustomName:\"\uFFFD\uFFFD\uFFFD\uFFFD\u02A6\",Health:17210,Attributes:[{Name:\"generic.maxHealth\",Base:17210}],Offers:{Recipes:[{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ "" + new java.text.DecimalFormat("0").format(+1) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cao_yao_32\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+4) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cao_yao_33\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+21) + "b,Damage:0s},sell:{id:\"yvanchuliandan:cai_liao_05\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:"
										+ new java.text.DecimalFormat("0").format(+40) + "b,Damage:0s},buyB:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new java.text.DecimalFormat("0").format(+1)
										+ "b,Damage:0s},sell:{id:\"yvanchuliandan:cai_liao_08\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new java.text.DecimalFormat("0").format(+3)
										+ "b,Damage:0s},sell:{id:\"yvanchuliandan:cai_liao_11\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new java.text.DecimalFormat("0").format(+1)
										+ "b,Damage:0s},sell:{id:\"yvanchuliandan:caoyao18\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new java.text.DecimalFormat("0").format(+4)
										+ "b,Damage:0s},sell:{id:\"yvanchuliandan:caoyao_1801\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new java.text.DecimalFormat("0").format(+4)
										+ "b,Damage:0s},sell:{id:\"yvanchuliandan:caoyao_1802\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new java.text.DecimalFormat("0").format(+1)
										+ "b,Damage:0s},sell:{id:\"yvanchuliandan:caoyao3\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new java.text.DecimalFormat("0").format(+7)
										+ "b,Damage:0s},sell:{id:\"yvanchuliandan:cao_yao_201\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi05\",Count:" + new java.text.DecimalFormat("0").format(+1)
										+ "b,Damage:0s},sell:{id:\"yvanchuliandan:cao_yao_202\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new java.text.DecimalFormat("0").format(+2)
										+ "b,Damage:0s},sell:{id:\"yvanchuliandan:caoyao25\",Count:1b,Damage:0s}},{uses:0,buy:{id:\"yvanchuxiuzhen:cailiaolingshi03\",Count:" + new java.text.DecimalFormat("0").format(+17)
										+ "b,Damage:0s},sell:{id:\"yvanchuliandan:cao_yao_601\",Count:1b,Damage:0s}}]}}"));
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
				}
			}
		}
	}
}
