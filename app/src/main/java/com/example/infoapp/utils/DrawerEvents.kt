package com.example.infoapp.utils

import android.icu.text.CaseMap.Title

sealed class DrawerEvents {
    data class OnItemClick(val title: String, val index: Int): DrawerEvents()
}
