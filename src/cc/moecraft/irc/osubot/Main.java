package cc.moecraft.irc.osubot;

import org.jibble.pircbot.IrcException;

import java.io.IOException;

/**
 * 此类由 Hykilpikonna 在 2018/04/20 创建!
 * Created by Hykilpikonna on 2018/04/20!
 * Github: https://github.com/hykilpikonna
 * QQ: admin@moecraft.cc -OR- 871674895
 */
public class Main
{
    public static final String VERSION = "0.0.1";

    // 配置文件 ( 用来存用于IRC登陆的账号密码 )
    private static BotConfig config;

    private static OsuBot osuBot;

    // 是否开启测试
    private static boolean debug = true;

    public static void main(String[] args) throws IOException, IrcException
    {
        config = new BotConfig();

        BotProperties properties = new BotProperties()
                .setUsername(config.getUsername())
                .setIrcServerAddress("irc.ppy.sh")
                .setIrcServerPort(6667)
                .setIrcServerPassword(config.getPassword());

        // 创建机器人对象
        osuBot = new OsuBot(properties);

        // 用来测试
        osuBot.setVerbose(debug);

        // 连接服务器
        osuBot.connect();

        // 想创建机器人的频道但是发现osu的irc服务器禁用了创建...
        // osuBot.joinChannel("#bots");
    }

    public static BotConfig getConfig()
    {
        return config;
    }

    public static OsuBot getOsuBot()
    {
        return osuBot;
    }
}
