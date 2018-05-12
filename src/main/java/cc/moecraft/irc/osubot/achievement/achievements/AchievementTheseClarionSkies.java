package cc.moecraft.irc.osubot.achievement.achievements;

import cc.moecraft.irc.osubot.achievement.Achievement;
import cc.moecraft.irc.osubot.osu.Mods;
import static cc.moecraft.irc.osubot.osu.Mod.*;

/**
 * 此类由 Hykilpikonna 在 2018/05/132 17:31:21 用 AchievementClassGenerator 生成!
 * Created by Hykilpikonna on 2018/05/132 17:31:21!
 *
 * Github: https://github.com/hykilpikonna
 * QQ: admin@moecraft.cc -OR- 871674895
 *
 * @author Hykilpikonna
 */
public class AchievementTheseClarionSkies extends Achievement
{
    @Override
    public long getId() { return 59; }

    @Override
    public String getName() { return "These Clarion Skies"; }

    @Override
    public String getGrouping() { return "Skill"; }

    @Override
    public long getOrdering() { return 2; }

    @Override
    public String getSlug() { return "osu-skill-pass-5"; }

    @Override
    public String getDescription() { return "Everything seems so clear now."; }

    @Override
    public int getMode() { return 3; }

    @Override
    public String getTutorial() { return " Pass a 5 star map without using EZ/NF/HT mods. <a href=\"https://osu.ppy.sh/b/95733\">07th Expansion - rog-unlimitation [Insane]</a> (taiko)"; }

    @Override
    public Long getRecommendedMap() { return null; }

    @Override
    public Mods getMods() { return Mods.parseFromShortString(""); }

    @Override
    public String getCompletionTimeInMinutes() { return "未知"; }

    @Override
    public String getAverageRetryCount() { return "未知"; }
}
