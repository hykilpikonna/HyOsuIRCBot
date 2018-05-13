package cc.moecraft.irc.osubot.achievement.achievements;

import cc.moecraft.irc.osubot.achievement.Achievement;
import cc.moecraft.irc.osubot.osu.Mods;
import static cc.moecraft.irc.osubot.osu.Mod.*;

/**
 * 此类由 Hykilpikonna 在 2018/05/132 17:38:03 用 AchievementClassGenerator 生成!
 * Created by Hykilpikonna on 2018/05/132 17:38:03!
 *
 * Github: https://github.com/hykilpikonna
 * QQ: admin@moecraft.cc -OR- 871674895
 *
 * @author Hykilpikonna
 */
public class Achievement2000Combo extends Achievement
{
    @Override
    public long getId() { return 5; }

    @Override
    public String getName() { return "2,000 Combo"; }

    @Override
    public String getGrouping() { return "Skill"; }

    @Override
    public long getOrdering() { return 0; }

    @Override
    public String getSlug() { return "osu-combo-2000"; }

    @Override
    public String getDescription() { return "Nothing can stop you now."; }

    @Override
    public int getMode() { return 3; }

    @Override
    public String getTutorial() { return "无教程信息"; }

    @Override
    public Long getRecommendedMap() { return null; }

    @Override
    public Mods getMods() { return Mods.parseFromShortString(""); }

    @Override
    public String getCompletionTimeInMinutes() { return "未知"; }

    @Override
    public String getAverageRetryCount() { return "未知"; }
}