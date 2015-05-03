package com.trunkshell.voj.model;

import java.io.Serializable;

/**
 * 编程语言的Model.
 * 对应数据库中的voj_languages数据表.
 * 
 * @author Xie Haozhe
 */
public class Language implements Serializable {
	/**
	 * 编程语言的默认构造函数.
	 */
	public Language() { }
	
	/**
	 * 编程语言的构造函数.
	 * @param languageId - 编程语言的唯一标识符
	 * @param languageSlug - 编程语言的英文缩写
	 * @param languageName - 编程语言的名称
	 */
	public Language(int languageId, String languageSlug, String languageName) {
		this.languageId = languageId;
		this.languageSlug = languageSlug;
		this.languageName = languageName;
	}
	
	/**
	 * 获取编程语言的唯一标识符.
	 * @return 编程语言的唯一标识符
	 */
	public int getLanguageID() {
		return languageId;
	}
	
	/**
	 * 设置编程语言的唯一标识符.
	 * @param languageId - 编程语言的唯一标识符
	 */
	public void setLanguageID(int languageId) {
		this.languageId = languageId;
	}
	
	/**
	 * 获取编程语言的英文缩写
	 * @return 编程语言的英文缩写
	 */
	public String getLanguageSlug() {
		return languageSlug;
	}
	
	/**
	 * 设置编程语言的英文缩写.
	 * @param languageSlug - 编程语言的英文缩写
	 */
	public void setLanguageSlug(String languageSlug) {
		this.languageSlug = languageSlug;
	}
	
	/**
	 * 获取编程语言的名称.
	 * @return 编程语言的名称
	 */
	public String getLanguageName() {
		return languageName;
	}
	
	/**
	 * 设置编程语言的名称.
	 * @param languageName - 编程语言的名称
	 */
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Language [ID=%d, Slug=%s, Name=%s]",
				new Object[] { languageId, languageSlug, languageName });
	}
	
	/**
	 * 编程语言的唯一标识符. 
	 */
	private int languageId;
	
	/**
	 * 编程语言的唯一英文简称.
	 */
	private String languageSlug;
	
	/**
	 * 编程语言的名称.
	 */
	private String languageName;
	
	/**
	 * 唯一的序列化标识符
	 */
	private static final long serialVersionUID = -7310526886823356436L;
}
