package com.ejs.xpsaver.registry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class XpSaverBlock extends Block {

	public XpSaverBlock(Settings settings) {
		super(settings);
	}

	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
			BlockHitResult hit) {
		if (!world.isClient && player.isHolding(Items.GLASS_BOTTLE)) {
			player.getStackInHand(hand).decrement(1);
			player.giveItemStack(new ItemStack(Items.EXPERIENCE_BOTTLE, 1));
			player.addExperience(-7);
			world.playSound((PlayerEntity)null, pos, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.BLOCKS, 1.0F, 1.0F);
			return ActionResult.CONSUME;
		} else {
			return ActionResult.SUCCESS;
		}
	}
}
