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

  @Test
  public void stringSplitWithLFandCRLF_LFのみ() {
    String testStr = "aaaa\nbbbb\ncccc";
    String[] result = MyStringUtil.stringSplitWithLFandCRLF(testStr);
    String[] expected = new String [3];
    expected[0] = "aaaa";
    expected[1] = "bbbb";
    expected[2] = "cccc";
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void stringSplitWithLFandCRLF_CRLFのみ() {
    String testStr = "aaaa\r\nbbbb\r\ncccc";
    String[] result = MyStringUtil.stringSplitWithLFandCRLF(testStr);
    String[] expected = new String [3];
    expected[0] = "aaaa";
    expected[1] = "bbbb";
    expected[2] = "cccc";
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void stringSplitWithLFandCRLF_LFとCRLF混在() {
    String testStr = "aaaa\nbbbb\r\ncccc\ndddd\r\n\neeee\n\r\nffff";
    String[] result = MyStringUtil.stringSplitWithLFandCRLF(testStr);
    String[] expected = new String [8];
    expected[0] = "aaaa";
    expected[1] = "bbbb";
    expected[2] = "cccc";
    expected[3] = "dddd";
    expected[4] = "";
    expected[5] = "eeee";
    expected[6] = "";
    expected[7] = "ffff";
    assertArrayEquals(expected, result);
  }
}
