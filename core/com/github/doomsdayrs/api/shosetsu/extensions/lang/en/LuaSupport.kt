package com.github.doomsdayrs.api.shosetsu.extensions.lang.en

import com.github.doomsdayrs.api.shosetsu.services.core.objects.NovelChapter
import com.github.doomsdayrs.api.shosetsu.services.core.objects.NovelPage
import com.github.doomsdayrs.api.shosetsu.services.core.objects.NovelStatus

/**
 * com.github.doomsdayrs.api.shosetsu.extensions.lang.en
 * 17 / January / 2020
 *
 * @author github.com/doomsdayrs
 */
class LuaSupport {
    /**
     * type Type of NovelStatus {0:PUBLISHING,1:COMPLETED,2:PAUSED,3:UNKNOWN}
     */
    fun getStatus(type: Int): NovelStatus {
        return when (type) {
            0 -> NovelStatus.PUBLISHING
            1 -> NovelStatus.COMPLETED
            2 -> NovelStatus.PAUSED
            else -> NovelStatus.UNKNOWN
        }
    }

    val chapterArrayList: ArrayList<NovelChapter>
        get() = ArrayList()

    val novelPage: NovelPage
        get() = NovelPage()

    val stringArray: StringArray
        get() = StringArray()

    val novelChapter: NovelChapter
        get() = NovelChapter()
}