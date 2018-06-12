package alisonjc.com.tic_tac_toe.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayMap;
import android.util.Log;
import android.widget.TextView;

import alisonjc.com.tic_tac_toe.R;
import alisonjc.com.tic_tac_toe.model.Cell;
import alisonjc.com.tic_tac_toe.model.Game;
import alisonjc.com.tic_tac_toe.model.Player;

import static alisonjc.com.tic_tac_toe.util.StringUtil.stringFromNumbers;

public class GameViewModel extends ViewModel {

    public ObservableArrayMap<String, String> cells;
    private Game game;

    public void init(String player1, String player2) {
        game = new Game(player1, player2);
        cells = new ObservableArrayMap<>();
    }

    public void onClickedCellAt(TextView text, int row, int column) {
        if (game.cells[row][column] == null) {
            game.cells[row][column] = new Cell(game.currentPlayer);
            cells.put(stringFromNumbers(row, column), game.currentPlayer.value);
            if(game.currentPlayer.value.equalsIgnoreCase("x")){
                text.setTextColor(text.getResources().getColor(R.color.green));
            }
            if (game.hasGameEnded())
                game.reset();
            else
                game.switchPlayer();
        }
    }

    public LiveData<Player> getWinner() {
        return game.winner;
    }
}
