package com.glasses_se_note.my_java_snipet.utils;

/**
 * 文字列関連のUtilクラス
 * 
 * @author glasses-se-hub
 *
 */
public class MyStringUtil {

  /**
   * 引数の文字列が半角スペースのみで構成されているかを検証する.
   * 引数の文字列がnullや空文字の場合はfalseを返す
   * 
   * @param str 検証対象文字列
   * @return true:半角スペースのみで構成されている or false:半角スペース以外が含まれている
   */
  public static boolean hasOnlyHankakuSpace(String str) {
    
    if (str == null || str.equals("")) {
      // 検証対象文字列がnullや空文字の場合はfalseで返す
      return false;
    }
    
    // 半角スペースをブランクに置換して最終的に空文字であれば半角スペースのみと判定する
    str = str.replace(" ", "");
    if (str.equals("")) {
      return true;
    } else {
      return false;
    }
  }
}
