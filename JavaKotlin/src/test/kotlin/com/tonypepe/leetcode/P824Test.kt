package com.tonypepe.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

internal class P824Test {
    @Test
    fun toGoatLatinTest() {
        val p824 = P824()
        assertEquals(p824.toGoatLatin("I speak Goat Latin"), "Imaa peaksmaaa oatGmaaaa atinLmaaaaa")
        assertEquals(
            p824.toGoatLatin("The quick brown fox jumped over the lazy dog"),
            "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
        )
    }
}
