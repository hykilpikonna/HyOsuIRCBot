package cc.moecraft.irc.osubot.achievement.achievements;

import cc.moecraft.irc.osubot.achievement.Achievement;
import cc.moecraft.irc.osubot.osu.Mods;
import static cc.moecraft.irc.osubot.osu.Mod.*;

/**
 * 此类由 Hykilpikonna 在 2018/05/132 17:38:07 用 AchievementClassGenerator 生成!
 * Created by Hykilpikonna on 2018/05/132 17:38:07!
 *
 * Github: https://github.com/hykilpikonna
 * QQ: admin@moecraft.cc -OR- 871674895
 *
 * @author Hykilpikonna
 */
public class AchievementAbsolution extends Achievement
{
    @Override
    public long getId() { return 62; }

    @Override
    public String getName() { return "Absolution"; }

    @Override
    public String getGrouping() { return "Skill"; }

    @Override
    public long getOrdering() { return 2; }

    @Override
    public String getSlug() { return "osu-skill-pass-8"; }

    @Override
    public String getDescription() { return "My god, you're full of stars!"; }

    @Override
    public int getMode() { return 3; }

    @Override
    public String getTutorial() { return " [https://osu.ppy.sh/b/111680 xi - Ascension to Heaven] +DT [https://osu.ppy.sh/b/39825 IOSYS - Marisa wa Taihen na Kanbu de Tomatte Ikimashita] +DT [https://osu.ppy.sh/s/418826 DystopiaGround - AugoEidEs] +HR (osu!catch) [https://osu.ppy.sh/b/553820 MiddleIsland - Achromat] +DT (osu!mania)"; }

    @Override
    public Long getRecommendedMap() { return null; }

    @Override
    public Mods getMods() { return Mods.parseFromShortString(""); }

    @Override
    public String getCompletionTimeInMinutes() { return "未知"; }

    @Override
    public String getAverageRetryCount() { return "未知"; }
}