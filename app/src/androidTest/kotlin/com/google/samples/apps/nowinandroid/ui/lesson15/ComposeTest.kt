package com.google.samples.apps.nowinandroid.ui.lesson15

import androidx.compose.ui.test.hasText
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

@HiltAndroidTest
class ComposeTest : ConfiguredTest() {
    private  val titleText = "What are you interested in?"
    private  val subTitleText = "Updates from topics you follow will appear here. Follow some things to get started."
    private  val recentSearchesTitle = "Recent searches"

    @Test
    fun verifyToolbarText() {
        run {
            StartScreen {
                titleToolbar.assertTextEquals("Now in Android")
                settingsButton.assertIsDisplayed()
                title{
                    assertIsDisplayed()
                    assertTextEquals(titleText)
                }
                subTitle{
                    assertIsDisplayed()
                    assertTextEquals(subTitleText)
                }
                doneButton.assertIsDisplayed()
                searchButton{
                    assertIsDisplayed()
                    performClick()
                }
            }
            SearchScreen{
                searchTextField.assertIsDisplayed()
                searchTextIcon.assertIsDisplayed()
                backButton.assertIsDisplayed()
                recentSearches{
                    assertIsDisplayed()
                    assertTextEquals(recentSearchesTitle)
                }
            }
        }
    }
}