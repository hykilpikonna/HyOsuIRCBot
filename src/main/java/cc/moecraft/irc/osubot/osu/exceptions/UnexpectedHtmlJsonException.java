package cc.moecraft.irc.osubot.osu.exceptions;

/**
 * 此类由 Hykilpikonna 在 2018/05/08 创建!
 * Created by Hykilpikonna on 2018/05/08!
 * Github: https://github.com/hykilpikonna
 * QQ: admin@moecraft.cc -OR- 871674895
 *
 * @author Hykilpikonna
 */
public class UnexpectedHtmlJsonException extends UnexpectedException {
    public UnexpectedHtmlJsonException(String description, Object html, Object json)
    {
        super(description);

        additionalObjects.put("HTML", html);
        additionalObjects.put("JSON", json);
    }
}