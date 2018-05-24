package com.zac.springboot.util;

public class Constants {

//	public static void main(String args[]) {
//		System.out.println(Constants.Money.MARK_YEN);
//		System.out.println(Constants.Character.DOUBLE_QUOTATION);
//		System.out.println(Constants.Character.BACK_SLASH);
//	}

	private Constants() {
	}

	public static class Character {
		/**
		 * パイプライン
		 */
		public static final String VERTICAL_BAR = "|";
		/**
		 * アステリスク
		 */
		public static final String ASTERISK = "*";
		/**
		 * アンダーバー
		 */
		public static final String UNDERSCORE = "_";
		/**
		 * エクスクラメーションマーク
		 */
		public static final String EXCLAMATION = "!";
		/**
		 * アポストロフィー
		 */
		public static final String APOSTROPHE = "'";
		/**
		 * ダブルクォーテーション
		 */
		public static final String DOUBLE_QUOTATION = "\"";
		/**
		 * コロン
		 */
		public static final String COLON = ":";
		/**
		 * セミコロン
		 */
		public static final String SEMICOLON = ";";
		/**
		 * カンマ
		 */
		public static final String COMMA = ",";
		/**
		 * ドット
		 */
		public static final String DOT = ".";
		/**
		 * スラッシュ
		 */
		public static final String SLASH = "/";
		/**
		 * バックスラッシュ
		 */
		public static final String BACK_SLASH = "\\";
		/**
		 * 空白
		 */
		public static final String BLANK = " ";
		/**
		 * 改行コード ¥r¥n
		 */
		public static final String CRLF = "¥r¥n";
		/**
		 * 改行コード ¥r
		 */
		public static final String CR = "¥r";
		/**
		 * 改行コード ¥n
		 */
		public static final String LF = "¥n";
	}

	public static class Money {
		/**
		 * 符号：￥
		 */
		public static final String MARK_YEN = "￥";
		/**
		 * 漢字：円
		 */
		public static final String LITERAL_YEN = "円";
		/**
		 * 漢字：ドル
		 */
		public static final String LITERAL_DOLLER = "ドル";

		/**
		 * 金額フォーマット:###,###
		 */
		public static final String MONEY_FORMAT = "###,###";
	}

}
