package alisonjc.com.tic_tac_toe.model;

import alisonjc.com.tic_tac_toe.util.StringUtil;

/**
 * Created by acaldwell on 6/11/18.
 */

public class Cell {
    public Player player;


    public Cell(Player player) {
        this.player = player;
    }

    public boolean isEmpty() {
        return player == null || StringUtil.isNullOrEmpty(player.value);
    }
}
