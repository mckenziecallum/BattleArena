package com.pixelyeti.Arena.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

import java.util.ArrayList;

public class ExplodeEvent implements Listener {

    @EventHandler
    public void onBlockExplode(BlockExplodeEvent e) {
        e.blockList().clear();
    }

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent e) {
        e.blockList().clear();
    }
}
