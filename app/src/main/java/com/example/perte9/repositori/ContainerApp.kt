package com.example.perte9.repositori

import android.content.Context
import com.example.perte9.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa: RepositoriSiswa
}

class ContainerDataApp(private val context: Context) : ContainerApp {
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(siswaDao = DatabaseSiswa.getDatabase(context).siswaDao())
    }
}