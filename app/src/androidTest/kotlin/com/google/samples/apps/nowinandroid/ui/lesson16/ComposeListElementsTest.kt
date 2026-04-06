/*
 * Copyright 2026 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.ui.lesson16

import androidx.compose.ui.test.ExperimentalTestApi
import com.google.samples.apps.nowinandroid.ui.lesson15.ConfiguredTest
import com.google.samples.apps.nowinandroid.ui.lesson15.StartScreen
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

@HiltAndroidTest
class ComposeListElementsTest : ConfiguredTest() {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun verifyItem() {
        run {

            StartScreen {
                items.childAt<TopicItems>(1) {
                    dynamicImage.assertIsDisplayed()
                    itemText.assertIsDisplayed()
                    plusIcon {
                        assertIsDisplayed()
                        performClick()
                    }
                    checkedIcon.assertIsDisplayed()
                }

                newsItem.childAt<NewsItem>(0) {
                    newsText.assertIsDisplayed()
                    newsImage.assertIsDisplayed()
                    rowTestTag.assertIsDisplayed()
                    metadataText.assertIsDisplayed()
                }
            }
        }
    }
}