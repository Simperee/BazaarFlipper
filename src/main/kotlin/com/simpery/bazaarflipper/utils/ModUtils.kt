package com.simpery.bazaarflipper.utils

import net.minecraft.util.ChatComponentText

object ModUtils {
    fun sendMsg(text: String) = mc.ingameGUI?.chatGUI?.printChatMessage(ChatComponentText(text.replace("&", "§"))) ?: Unit
    fun sendModMsg(text: String) = sendMsg("§3[BazaarFlipper] $text")
}