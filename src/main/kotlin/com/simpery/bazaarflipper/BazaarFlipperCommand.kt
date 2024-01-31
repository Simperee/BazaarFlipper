package com.simpery.bazaarflipper

import com.simpery.bazaarflipper.utils.ModUtils.sendMsg
import gg.essential.api.commands.Command
import gg.essential.api.commands.DefaultHandler
import gg.essential.api.commands.SubCommand

object BazaarFlipperCommand : Command("bazaarflip") {
    override val commandAliases = setOf(Alias("bf"))

    @DefaultHandler
    fun handle() {
        sendMsg("&4Default Handle")
    }

    @SubCommand("sub")
    fun sub() {
        sendMsg("&aSub command")
    }
}