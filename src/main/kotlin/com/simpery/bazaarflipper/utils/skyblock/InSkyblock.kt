package com.simpery.bazaarflipper.utils.skyblock


import gg.essential.api.EssentialAPI
import net.minecraftforge.event.world.WorldEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

class InSkyblock interface IEventListener{

    @SubscribeEvent
    fun checkSkyblock(event: WorldEvent.Load?) {
        val isSkyblock = false
        val isHypixel = EssentialAPI.getMinecraftUtil().isHypixel()
        val inventory = player.inventory
        val menuslot = inventory.getInventoryStackList().get(8)

        if (isHypixel){
            if (menuslot != null){

            }
        }
    }
}