package com.google.samples.apps.nowinandroid.ui.lesson15
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

object StartScreen : ComposeScreen<StartScreen>() {

    val titleToolbar = child<KNode> {
        hasTestTag("toolbarTitle")
    }

    val searchButton = child<KNode> {
        hasTestTag("searchButton")
    }

    val settingsButton = child<KNode> {
        hasTestTag("settingsButton")
    }

    val title = child<KNode> {
        hasTestTag("title")
    }

    val subTitle = child<KNode> {
        hasTestTag("subtitle")
    }

    val doneButton = child<KNode> {
        hasTestTag("doneButton")
    }
}