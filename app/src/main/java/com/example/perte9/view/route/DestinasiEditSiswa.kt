package com.example.perte9.view.route
import com.example.perte9.R

object DestinasiEditSiswa : DestinasiNavigasi {
    override val route = "edit"
    override val titleRes = R.string.edit_siswa
    const val itemId = "itemId"
    val routeWithArgs = "$route/{$itemId}"
}