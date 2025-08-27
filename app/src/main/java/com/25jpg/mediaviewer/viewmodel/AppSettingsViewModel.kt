package com.25jpg.mediaviewer.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import android.content.Context
import kotlinx.coroutines.launch

import com.25jpg.mediaviewer.data.MediaItem
import com.25jpg.mediaviewer.data.getMediaItemsForFolder


class AppSettingsViewModel : ViewModel() {
	var keepScreenOn by mutableStateOf(false)
        private set

    fun toggleKeepScreenOn(newValue: Boolean) {
        keepScreenOn = newValue
    }
}
