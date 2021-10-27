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
  
  /**
   * 文字列を改行コードで分割して文字列配列を返す.
   * 改行コードにCRLF、LFが混在していても処理できるように
   * 一旦CR(\r)をブランクに置換したあと、LFで分割する
   * 
   * @param str 処理対象文字列
   * @return 処理済み文字列配列
   */
  public static String[] stringSplitWithLFandCRLF(String str) {
    
    // CRをブランクに置換する
    str = str.replace("\r", "");
    
    String[] splitedStr = str.split("\n");
    
    return splitedStr;
  }
  
}
