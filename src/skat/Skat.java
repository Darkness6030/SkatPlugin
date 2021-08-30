package skat;

import arc.util.*;
import arc.Events;

import mindustry.mod.*;
import mindustry.ui.*;
import mindustry.game.EventType.*;
import mindustry.gen.Call;

public class Skat extends Plugin {

    @Override
    public void init() {
        Events.on(PlayerJoin.class, event -> {
            String[][] options = {
                {"[lime]Join скат cult"},
                {"[lime]Join скат cult"}
            };
            Call.menu(event.player.con, 1, "[accent]СКАТ IS OUR GOD", "[accent]Make your choice...", options);
        });
    }
}
