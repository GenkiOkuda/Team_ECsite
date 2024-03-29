package jp.co.internous.colors.model.form;

import java.io.Serializable;

/**
 * ユーザーフォーム
 * @author インターノウス
 *
 */
public class UserForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
    private String userName;
	
	private String password;
	
	private String familyName;
	
	private String firstName;
	
	private String familyNameKana;
	
	private String firstNameKana;
	
	private byte gender;
	
	private String newPassword;
	
	/**
	 * ユーザー名を取得する
	 * @return ユーザー名
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * ユーザー名を設定する
	 * @param userName ユーザー名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * パスワードを取得する
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * パスワードを設定する
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 姓を取得する
	 * @return 姓
	 */
	public String getFamilyName() {
		return familyName;
	}
	
	/**
	 * 姓を設定する
	 * @param familyName 姓
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	/**
	 * 名を取得する
	 * @return 名
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 名を設定する
	 * @param firstName 名
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * 姓ふりがなを取得する
	 * @return 姓ふりがな
	 */
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	
	/**
	 * 姓ふりがなを設定する
	 * @param familyNameKana 姓ふりがな
	 */
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	
	/**
	 * 名ふりがなを取得する
	 * @return 名ふりがな
	 */
	public String getFirstNameKana() {
		return firstNameKana;
	}
	
	/**
	 * 名ふりがなを設定する
	 * @param firstNameKana 名ふりがな
	 */
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}
	
	/**
	 * 性別を取得する
	 * @return 性別
	 */
	public byte getGender() {
		return gender;
	}
	
	/**
	 * 性別を設定する
	 * @param gender 性別
	 */
	public void setGender(byte gender) {
		this.gender = gender;
	}
	
	/**
	 * 新しいパスワードを取得する
	 * @return 新しいパスワード
	 */
	public String getNewPassword() {
		return newPassword;
	}
	
	/**
	 * 新しいパスワードを設定する
	 * @param newPassword 新しいパスワード
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
}
