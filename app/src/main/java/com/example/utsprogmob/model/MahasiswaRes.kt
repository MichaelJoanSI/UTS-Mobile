package com.example.utsprogmob.model

import com.google.gson.annotations.SerializedName

data class MahasiswaRes(

    @field:SerializedName("MahasiswaRes")
    val responseMahasiswa: List<MahasiswaResI?>? = null
)

data class MahasiswaResI(

    @field:SerializedName("nim")
    val nim: String? = null,

    @field:SerializedName("nama")
    val nama: String? = null,

    @field:SerializedName("foto")
    val foto: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("email")
    val email: String? = null,

    @field:SerializedName("alamat")
    val alamat: String? = null
)
