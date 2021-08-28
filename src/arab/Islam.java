package mindurka;

import arc.util.*;

import mindustry.mod.*;
import mindustry.ui.*;
import mindustry.game.EventType.*;

public class Islam extends Plugin {

    @Override
    public void init() {
        Events.on(PlayerJoin.class, event -> {
            String[][] options = {
                {"[lime]Принять"},
                {"[lime]Принять"}
            };
            Call.menu(event.player.con, 1, "[accent]ИСЛАМ", "[accent]Сделай свой выбор...", options);
        });
    }
}
