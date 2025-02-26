package uk.udemy.recordshop.ui.home

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import kotlinx.coroutines.flow.collect

// The Home Screen that the app will open to
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    viewModel: HomeViewModel,
    onAddAlbumClick: () -> Unit,
    onAlbumClicked: (Long) -> Unit
) {

    val state = viewModel.state.collectAsStateWithLifecycle()
    val pullToRefreshState = rememberPullToRefreshState()
    val onRefresh: () -> Unit = {
        viewModel.getAlbums()
    }

    // Events Observer
    LaunchedEffect(Unit) {
        viewModel.events.collect(){ event ->
            when (event){
                HomeViewModel.Event.AddAlbumClicked -> onAddAlbumClick()
                is HomeViewModel.Event.AlbumItemClicked -> TODO()
            }
        }
    }

    HomeScreenContent(
        state = state.value ,
        onAddAlbumClick = viewModel::addAlbum,
        pullToRefreshState = pullToRefreshState,
        onRefresh = onRefresh,
        onAlbumClicked = onAlbumClicked
    )
}

