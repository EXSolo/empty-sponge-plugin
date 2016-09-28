package com.example.emptyspigotplugin;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id="empty-sponge-plugin", name = "EmptySpongePlugin", version = "1.0.0", description = "An empty sponge plugin")
public class EmptySpongePlugin {

    @Inject
    private Logger logger;

    @Listener
    public void onGameStarted(GameStartedServerEvent event) {
        this.logger.info("Loading empty plugin.");
    }

}
