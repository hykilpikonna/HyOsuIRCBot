package cc.moecraft.irc.osubot.achievement.achievements;

import cc.moecraft.irc.osubot.achievement.Achievement;
import cc.moecraft.irc.osubot.osu.Mods;
import static cc.moecraft.irc.osubot.osu.Mod.*;

/**
 * 此类由 Hykilpikonna 在 2018/05/132 17:38:13 用 AchievementClassGenerator 生成!
 * Created by Hykilpikonna on 2018/05/132 17:38:13!
 *
 * Github: https://github.com/hykilpikonna
 * QQ: admin@moecraft.cc -OR- 871674895
 *
 * @author Hykilpikonna
 */
public class AchievementDrumbreaker extends Achievement
{
    @Override
    public long getId() { return 76; }

    @Override
    public String getName() { return "Drumbreaker"; }

    @Override
    public String getGrouping() { return "Skill"; }

    @Override
    public long getOrdering() { return 4; }

    @Override
    public String getSlug() { return "taiko-skill-pass-6"; }

    @Override
    public String getDescription() { return "Too strong."; }

    @Override
    public int getMode() { return 3; }

    @Override
    public String getTutorial() { return " Pass a 6 star map without using EZ/NF/HT mods. [https://osu.ppy.sh/b/315 FAIRY FORE - Vivid [Insane]] +DT  [https://osu.ppy.sh/b/19990 Silver Forest - Tsurupettan] +DT  [https://osu.ppy.sh/b/296 Wizards In Winter [Impossible]] +DT (taiko) "; }

    @Override
    public Long getRecommendedMap() { return null; }

    @Override
    public Mods getMods() { return Mods.parseFromShortString(""); }

    @Override
    public String getCompletionTimeInMinutes() { return "未知"; }

    @Override
    public String getAverageRetryCount() { return "未知"; }
}