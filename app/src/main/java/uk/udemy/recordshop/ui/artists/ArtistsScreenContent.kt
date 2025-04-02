@file:OptIn(ExperimentalMaterial3Api::class)

package uk.udemy.recordshop.ui.artists

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshState
import androidx.compose.material3.pulltorefresh.pullToRefresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import uk.udemy.recordshop.ui.common.DefaultErrorScreen
import uk.udemy.recordshop.ui.common.DefaultNetworkErrorScreen
import uk.udemy.recordshop.ui.common.DefaultProgressIndicator

@Composable
fun ArtistsScreenContent(
    state: ArtistsViewModel.State,
    pullToRefreshState: PullToRefreshState,
    onRefresh: () -> Unit,
    onArtistItemClick: (Long) -> Unit
) {
    when(state) {
        is ArtistsViewModel.State.Error -> {
            DefaultErrorScreen(
                responseCode = state.responseCode ?: 0,
                errorMessage = state.errorMessage
            )
        }
        is ArtistsViewModel.State.Loaded -> {
            ArtistsScreenLoaded(
                state = state,
                pullToRefreshState = pullToRefreshState,
                onRefresh = onRefresh,
                onArtistItemClick = onArtistItemClick
            )
        }
        ArtistsViewModel.State.Loading -> {
            DefaultProgressIndicator()
        }
        is ArtistsViewModel.State.NetworkError -> {
            DefaultNetworkErrorScreen(
                errorMessage = state.errorMessage
            )
        }
    }
}

@Composable
fun ArtistsScreenLoaded(
    state: ArtistsViewModel.State.Loaded,
    pullToRefreshState: PullToRefreshState,
    onRefresh: () -> Unit,
    onArtistItemClick: (Long) -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .pullToRefresh(
                isRefreshing = state.isLoading,
                state = pullToRefreshState,
                onRefresh = onRefresh
            ),
    ){
        Text("Artist Screen using ViewModel")
    }
}