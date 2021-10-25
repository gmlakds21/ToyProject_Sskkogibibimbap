package kr.co.bibimbab.vo;

public class BoardVO {
	private String SEQNO;			// 글 번호
	private String TITLE;			// 제목
	private String CONTENTS;		// 내용
	private String REG_ID;			// 작성자
	private String REG_DATE;		// 작성일
	private String VISIT;			// 방문수
	private String DEL_YN;			// 삭제여부
	private String SECRET_NO;		// 등록 비밀번호

	////////////////////////////////////////////////////////////////////////////////////////
	
	public BoardVO() { }
	public BoardVO(String sEQNO, String tITLE, String cONTENTS, String rEG_ID, String rEG_DATE, String vISIT, String dEL_YN, String sECRET_NO) {
		SEQNO = sEQNO;
		TITLE = tITLE;
		CONTENTS = cONTENTS;
		REG_ID = rEG_ID;
		REG_DATE = rEG_DATE;
		VISIT = vISIT;
		DEL_YN = dEL_YN;
		SECRET_NO = sECRET_NO;
	}
	
	public String getSECRET_NO() {
		return SECRET_NO;
	}
	public void setSECRET_NO(String sECRET_NO) {
		SECRET_NO = sECRET_NO;
	}
	public String getDEL_YN() {
		return DEL_YN;
	}
	public void setDEL_YN(String dEL_YN) {
		DEL_YN = dEL_YN;
	}
	public String getSEQNO() {
		return SEQNO;
	}
	public void setSEQNO(String sEQNO) {
		SEQNO = sEQNO;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getCONTENTS() {
		return CONTENTS;
	}
	public void setCONTENTS(String cONTENTS) {
		CONTENTS = cONTENTS;
	}
	public String getREG_ID() {
		return REG_ID;
	}
	public void setREG_ID(String rEG_ID) {
		REG_ID = rEG_ID;
	}
	public String getREG_DATE() {
		return REG_DATE;
	}
	public void setREG_DATE(String rEG_DATE) {
		REG_DATE = rEG_DATE;
	}
	public String getVISIT() {
		return VISIT;
	}
	public void setVISIT(String vISIT) {
		VISIT = vISIT;
	}
}
