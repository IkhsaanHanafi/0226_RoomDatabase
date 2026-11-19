package com.example.perte9.view.route

import com.example.perte9.R

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail"
    override val titleRes = R.string.detail_siswa
    const val siswaId = "itemId"
    val routeWithArgs = "$route/{$siswaId}"
}