package www.jcoding.kr;


import org.json.JSONObject;

public class MovieInfo {
	private String boxofiiceType; 	//박스오피스 종류를 출력
	private String showRange; 		// 박스오피스 조회 일자를 출력
	private String rnum; 			// 순번을 출력
	private String rank; 			// 해당일자의 박스오피스 순위를 출력
	private String rankInten; 		// 전일대비 순위의 증감분을 출력
	private String rankOldAndNew; 	// 랭킹에 신규진입여부출력
	private String movieNm; 		// 영화명을 출력
	private String openDt; 			// 영화의 개봉일을 출력
	private String audiCnt; 		// 해당일의 관객수를 출력
	private String audiChange;  	// 전일 대비 관객수 증감 비율을 출력
	public String getBoxofiiceType() {
		return boxofiiceType;
	}
	public void setBoxofiiceType(String boxofiiceType) {
		this.boxofiiceType = boxofiiceType;
	}
	public String getShowRange() {
		return showRange;
	}
	public void setShowRange(String showRange) {
		this.showRange = showRange;
	}
	public String getRnum() {
		return rnum;
	}
	public void setRnum(String rnum) {
		this.rnum = rnum;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getRankInten() {
		return rankInten;
	}
	public void setRankInten(String rankInten) {
		this.rankInten = rankInten;
	}
	public String getRankOldAndNew() {
		return rankOldAndNew;
	}
	public void setRankOldAndNew(String rankOldAndNew) {
		this.rankOldAndNew = rankOldAndNew;
	}
	public String getMovieNm() {
		return movieNm;
	}
	public void setMovieNm(String movieNm) {
		this.movieNm = movieNm;
	}
	public String getOpenDt() {
		return openDt;
	}
	public void setOpenDt(String openDt) {
		this.openDt = openDt;
	}
	public String getAudiCnt() {
		return audiCnt;
	}
	public void setAudiCnt(String audiCnt) {
		this.audiCnt = audiCnt;
	}
	public String getAudiChange() {
		return audiChange;
	}
	public void setAudiChange(String audiChange) {
		this.audiChange = audiChange;
	}
	public static MovieInfo parse(JSONObject item) {
		MovieInfo info = new MovieInfo();
		
		if(item.has("boxofiiceType")) {
			info.setBoxofiiceType(item.getString("boxofiiceType"));
		}
		if(item.has("showRange")) {
			info.setShowRange(item.getString("showRange"));
		}
		if(item.has("rnum")) {
			info.setRnum(item.getString("rnum"));
		}
		if(item.has("rank")) {
			info.setRank(item.getString("rank"));
		}
		if(item.has("rankInten")) {
			info.setRankInten(item.getString("rankInten"));
		}
		if(item.has("rankOldAndNew")) {
			info.setRankOldAndNew(item.getString("rankOldAndNew"));
		}
		if(item.has("movieNm")) {
			info.setMovieNm(item.getString("movieNm"));
		}
		if(item.has("openDt")) {
			info.setOpenDt(item.getString("openDt"));
		}
		if(item.has("audiCnt")) {
			info.setAudiCnt(item.getString("audiCnt"));
		}
		if(item.has("audiChange")) {
			info.setAudiChange(item.getString("audiChange"));
		}
		
		return info;
	}
	
	

	

}
