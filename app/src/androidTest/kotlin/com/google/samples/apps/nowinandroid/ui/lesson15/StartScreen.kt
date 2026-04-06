package com.google.samples.apps.nowinandroid.ui.lesson15

import androidx.compose.ui.test.SemanticsMatcher
import com.google.samples.apps.nowinandroid.core.designsystem.component.LazyListItemPositionSemantics
import com.google.samples.apps.nowinandroid.core.designsystem.component.LazyListSizeSemantics
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags.DONE_BUTTON
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags.FEED_TAG
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags.SEARCH_BUTTON
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags.SETTINGS_BUTTON
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags.SUBTITLE
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags.TITLE
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags.TOOLBAR_TITLE
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags.TOPIC_TEST_TAG
import com.google.samples.apps.nowinandroid.ui.lesson16.NewsItem
import com.google.samples.apps.nowinandroid.ui.lesson16.TopicItems
import io.github.kakaocup.compose.node.builder.ViewBuilder
import io.github.kakaocup.compose.node.core.BaseNode
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode
import io.github.kakaocup.compose.node.element.lazylist.KLazyListItemBuilder
import io.github.kakaocup.compose.node.element.lazylist.KLazyListNode

object StartScreen : ComposeScreen<StartScreen>() {

    val titleToolbar = child<KNode> {
        hasTestTag(TOOLBAR_TITLE)
    }

    val searchButton = child<KNode> {
        hasTestTag(SEARCH_BUTTON)
    }

    val settingsButton = child<KNode> {
        hasTestTag(SETTINGS_BUTTON)
    }

    val title = child<KNode> {
        hasTestTag(TITLE)
    }

    val subTitle = child<KNode> {
        hasTestTag(SUBTITLE)
    }

    val doneButton = child<KNode> {
        hasTestTag(DONE_BUTTON)
    }

    val items = createLazyList(
        viewBuilderAction = {
            hasTestTag(TOPIC_TEST_TAG)
        },
        itemTypeBuilder = {
            itemType(::TopicItems)
        },
    )

    val newsItem = createLazyList(
        viewBuilderAction = {
            hasTestTag(FEED_TAG)
        },
        itemTypeBuilder = {
            itemType(::NewsItem)
        },
    )

    fun BaseNode<*>.createLazyList(
        viewBuilderAction: ViewBuilder.() -> Unit,
        itemTypeBuilder: KLazyListItemBuilder.() -> Unit,
    ) = KLazyListNode(
        viewBuilderAction = viewBuilderAction,
        itemTypeBuilder = itemTypeBuilder,
        positionMatcher = {
            SemanticsMatcher.expectValue(LazyListItemPositionSemantics, it)
        },
        lengthSemanticsPropertyKey = LazyListSizeSemantics,
    )
}