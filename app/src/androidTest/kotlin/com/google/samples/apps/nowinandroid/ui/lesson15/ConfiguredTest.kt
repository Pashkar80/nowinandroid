package com.google.samples.apps.nowinandroid.ui.lesson15

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.google.samples.apps.nowinandroid.MainActivity
import com.kaspersky.components.composesupport.config.withComposeSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import dagger.hilt.android.testing.HiltAndroidRule
import io.github.kakaocup.compose.rule.KakaoComposeTestRule
import org.junit.Rule

abstract class ConfiguredTest : TestCase(
    Kaspresso.Builder.withComposeSupport(),
) {
    @get:Rule(0)
    val hiltRule = HiltAndroidRule(this)
    @get:Rule(1)
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    @get:Rule(2)
    val kakaoRule = KakaoComposeTestRule(composeTestRule, true)

}