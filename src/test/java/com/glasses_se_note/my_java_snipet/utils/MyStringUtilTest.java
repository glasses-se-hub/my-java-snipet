package com.glasses_se_note.my_java_snipet.utils;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 文字列関連のUtilクラスのTESTクラス
 * 
 * @author glasses-se-hub
 *
 */
public class MyStringUtilTest {

  @Test
  public void hasOnlyHankakuSpace_引数null() {
    boolean result = MyStringUtil.hasOnlyHankakuSpace(null);
    assertEquals(false, result);
  }

  @Test
  public void hasOnlyHankakuSpace_引数ブランク() {
    boolean result = MyStringUtil.hasOnlyHankakuSpace("");
    assertEquals(false, result);
  }

  @Test
  public void hasOnlyHankakuSpace_半角スペースのみ() {
    boolean result = MyStringUtil.hasOnlyHankakuSpace("         ");
    assertEquals(true, result);
  }

  @Test
  public void hasOnlyHankakuSpace_半角スペースと全角スペース() {
    boolean result = MyStringUtil.hasOnlyHankakuSpace("  　　 　　 ");
    assertEquals(false, result);
  }

}
