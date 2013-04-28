package net.bot2k3.siebe.Mineplayers;

import java.util.*;

import net.bot2k3.siebe.*;

import org.bukkit.*;
import org.bukkit.plugin.java.*;

/**
 * Provides an idle timer.
 */
public class MineplayersIdleTimer implements Runnable
{
    private MineplayersPlugin plugin;
    
    /**
     * Initializes a new instance of the idle timer.
     */
    public MineplayersIdleTimer(MineplayersPlugin plugin)
    {
        this.plugin = plugin;
    }
    
    /**
     *  Runs the idle timer.
     */
    public void run()
    {
        this.plugin.onIdleTimerTick();
    }
}




























