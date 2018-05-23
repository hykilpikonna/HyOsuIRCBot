package cc.moecraft.irc.osubot.command.commands.fun.minigames.fingers;

import cc.moecraft.irc.osubot.command.commands.fun.minigames.fingers.exceptions.GameEndedException;
import cc.moecraft.irc.osubot.command.commands.fun.minigames.fingers.exceptions.InputNumberNotFoundException;
import cc.moecraft.irc.osubot.command.commands.fun.minigames.fingers.exceptions.NotYourTurnException;
import cc.moecraft.irc.osubot.command.commands.fun.minigames.fingers.exceptions.PlayerInputInvalidException;
import lombok.Data;

import java.util.ArrayList;

import static cc.moecraft.irc.osubot.command.commands.fun.minigames.fingers.FingersPlayerType.Bot;
import static cc.moecraft.irc.osubot.command.commands.fun.minigames.fingers.FingersPlayerType.Player;

/**
 * 此类由 Hykilpikonna 在 2018/05/23 创建!
 * Created by Hykilpikonna on 2018/05/23!
 * Github: https://github.com/hykilpikonna
 * QQ: admin@moecraft.cc -OR- 871674895
 *
 * @author Hykilpikonna
 */
@Data
public class MLFingersGame
{
    public ArrayList<MLFingersMove> moves;
    public MLFingersMove lastMove;
    public boolean ended = false;
    public MLFingersDatabase database;

    /**
     * 移动一步
     * @param moveFrom 移动者手上的数
     * @param moveTo 对面手上的数
     * @param player 移动者是玩家还是机器人
     * @return 这步
     * @throws InputNumberNotFoundException 输入错误
     * @throws NotYourTurnException 不该你走
     */
    public MLFingersMove move(int moveFrom, int moveTo, FingersPlayerType player) throws InputNumberNotFoundException, NotYourTurnException, PlayerInputInvalidException, GameEndedException
    {
        if (lastMove.playerType == player) throw new NotYourTurnException(player, player.getTheOther());
        if (!FingersSituation.isValidNumber(moveFrom) || moveFrom == 0) throw new PlayerInputInvalidException(moveFrom);
        if (!FingersSituation.isValidNumber(moveTo) || moveTo == 0) throw new PlayerInputInvalidException(moveTo);

        MLFingersMove move = MLFingersMove.nextMove(player, lastMove.getCurrentSituation(), moveFrom, moveTo);

        moves.add(move);
        lastMove = move;

        if (lastMove.currentSituation.getPlayerHand()[0] == 0 && lastMove.currentSituation.getPlayerHand()[1] == 0) throw new GameEndedException(Player, this);
        if (lastMove.currentSituation.getBotHand()   [0] == 0 && lastMove.currentSituation.getBotHand()   [1] == 0) throw new GameEndedException(Bot, this);
        return move;
    }
}
