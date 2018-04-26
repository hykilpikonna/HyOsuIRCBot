package com.dullwolf;

import cc.moecraft.irc.osubot.DebugLogger;
import cc.moecraft.irc.osubot.osu.OsuAPIUtils;
import cc.moecraft.irc.osubot.osu.parameters.OsuTrackParameters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/**
 * 此类由 Hykilpikonna 在 2018/04/25 创建!
 * Created by Hykilpikonna on 2018/04/25!
 * Github: https://github.com/hykilpikonna
 * QQ: admin@moecraft.cc -OR- 871674895
 */
public class OsuDataTest
{
    private static DebugLogger logger = new DebugLogger("OsuDataTest", true);

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        logger.log("输入APIKey: ");

        String apiKey = reader.readLine();

        logger.log("当前测试OsuTrack的API");
        logger.log("输入用户名: ");

        String username = reader.readLine();

        logger.log("输入模式: ");

        int mode = reader.read();

        logger.log("当前信息: ");
        logger.log("- 用户名 = " + username);
        logger.log("- 模式   = " + mode);

        OsuAPIUtils utils = new OsuAPIUtils(apiKey);

        utils.get(new OsuTrackParameters(username, mode));
    }
}