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

import androidx.compose.ui.semantics.SemanticsNode
import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags.CHECKED_ICON
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags.DYNAMIC_IMAGE
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags.ITEM_TEXT
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags.PLUS_ICON
import io.github.kakaocup.compose.node.element.KNode
import io.github.kakaocup.compose.node.element.lazylist.KLazyListItemNode

class TopicItems(
    semanticNode: SemanticsNode,
    semanticsProvider: SemanticsNodeInteractionsProvider? = null,
) : KLazyListItemNode<TopicItems>(semanticNode, semanticsProvider) {

    val dynamicImage = child<KNode> {
        hasTestTag(DYNAMIC_IMAGE)
    }

    val itemText = child<KNode> {
        hasTestTag(ITEM_TEXT)
    }

    val plusIcon = child<KNode> {
        hasTestTag(PLUS_ICON)
    }

    val checkedIcon = child<KNode> {
        hasTestTag(CHECKED_ICON)
    }
}