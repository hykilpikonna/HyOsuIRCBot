package cc.moecraft.irc.osubot.command.commands.management.power;

import cc.moecraft.irc.osubot.Main;
import cc.moecraft.irc.osubot.command.Command;
import org.pircbotx.Channel;
import org.pircbotx.User;
import org.pircbotx.hooks.types.GenericMessageEvent;

import java.util.ArrayList;

/**
 * 此类由 Hykilpikonna 在 2018/05/02 创建!
 * Created by Hykilpikonna on 2018/05/02!
 * Github: https://github.com/hykilpikonna
 * QQ: admin@moecraft.cc -OR- 871674895
 *
 * @author Hykilpikonna
 */
public class CommandEnable extends Command
{
    public CommandEnable()
    {
        super("enable", "start");
    }

    @Override
    public void run(GenericMessageEvent event, User sender, Channel channel, String command, ArrayList<String> args)
    {
        Main.setEnableListening(true);
        Main.getMessenger().respond(event, "监听已启用!");
    }

    @Override
    public String permissionRequired()
    {
        return "irc.admin.managing.enable";
    }
}