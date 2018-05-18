package cc.moecraft.irc.osubot.database.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jboot.db.model.JbootModel;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOsuMania<M extends BaseOsuMania<M>> extends JbootModel<M> implements IBean {

    public static final String ACTION_ADD = "OsuMania:add";
    public static final String ACTION_DELETE = "OsuMania:delete";
    public static final String ACTION_UPDATE = "OsuMania:update";


    @Override
    public String addAction() {
        return ACTION_ADD;
    }

    @Override
    public String deleteAction() {
        return ACTION_DELETE;
    }

    @Override
    public String updateAction() {
        return ACTION_UPDATE;
    }


	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}
	
	public java.lang.String getUsername() {
		return getStr("username");
	}

	public void setCount300(java.lang.Integer count300) {
		set("count300", count300);
	}
	
	public java.lang.Integer getCount300() {
		return getInt("count300");
	}

	public void setCount100(java.lang.Integer count100) {
		set("count100", count100);
	}
	
	public java.lang.Integer getCount100() {
		return getInt("count100");
	}

	public void setCount50(java.lang.Integer count50) {
		set("count50", count50);
	}
	
	public java.lang.Integer getCount50() {
		return getInt("count50");
	}

	public void setPlaycount(java.lang.Integer playcount) {
		set("playcount", playcount);
	}
	
	public java.lang.Integer getPlaycount() {
		return getInt("playcount");
	}

	public void setRankedScore(java.lang.Long rankedScore) {
		set("ranked_score", rankedScore);
	}
	
	public java.lang.Long getRankedScore() {
		return getLong("ranked_score");
	}

	public void setTotalScore(java.lang.Long totalScore) {
		set("total_score", totalScore);
	}
	
	public java.lang.Long getTotalScore() {
		return getLong("total_score");
	}

	public void setPpRank(java.lang.Integer ppRank) {
		set("pp_rank", ppRank);
	}
	
	public java.lang.Integer getPpRank() {
		return getInt("pp_rank");
	}

	public void setLevel(java.lang.Double level) {
		set("level", level);
	}
	
	public java.lang.Double getLevel() {
		return getDouble("level");
	}

	public void setPpRaw(java.lang.Double ppRaw) {
		set("pp_raw", ppRaw);
	}
	
	public java.lang.Double getPpRaw() {
		return getDouble("pp_raw");
	}

	public void setAccuracy(java.lang.Double accuracy) {
		set("accuracy", accuracy);
	}
	
	public java.lang.Double getAccuracy() {
		return getDouble("accuracy");
	}

	public void setCountRankSs(java.lang.Integer countRankSs) {
		set("count_rank_ss", countRankSs);
	}
	
	public java.lang.Integer getCountRankSs() {
		return getInt("count_rank_ss");
	}

	public void setCountRankSsh(java.lang.Integer countRankSsh) {
		set("count_rank_ssh", countRankSsh);
	}
	
	public java.lang.Integer getCountRankSsh() {
		return getInt("count_rank_ssh");
	}

	public void setCountRankS(java.lang.Integer countRankS) {
		set("count_rank_s", countRankS);
	}
	
	public java.lang.Integer getCountRankS() {
		return getInt("count_rank_s");
	}

	public void setCountRankSh(java.lang.Integer countRankSh) {
		set("count_rank_sh", countRankSh);
	}
	
	public java.lang.Integer getCountRankSh() {
		return getInt("count_rank_sh");
	}

	public void setCountRankA(java.lang.Integer countRankA) {
		set("count_rank_a", countRankA);
	}
	
	public java.lang.Integer getCountRankA() {
		return getInt("count_rank_a");
	}

	public void setCountry(java.lang.String country) {
		set("country", country);
	}
	
	public java.lang.String getCountry() {
		return getStr("country");
	}

	public void setPpCountryRank(java.lang.Integer ppCountryRank) {
		set("pp_country_rank", ppCountryRank);
	}
	
	public java.lang.Integer getPpCountryRank() {
		return getInt("pp_country_rank");
	}

}
