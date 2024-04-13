package com.gyasilarbi.adapter

import android.os.Parcel
import android.os.Parcelable

data class ProgrammingLanguage(
    val name: String?,
) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object  CREATOR : Parcelable.Creator<ProgrammingLanguage> {
        override fun createFromParcel(parcel: Parcel): ProgrammingLanguage {
            return ProgrammingLanguage(parcel)
        }

        override fun newArray(size: Int): Array<ProgrammingLanguage?> {
            return arrayOfNulls(size)
        }
    }
}

val getLanguages = listOf(
    ProgrammingLanguage("Java"),
    ProgrammingLanguage("Python"),
    ProgrammingLanguage("C"),
    ProgrammingLanguage("C++"),
    ProgrammingLanguage("Kotlin"),
    ProgrammingLanguage("Java"),
    ProgrammingLanguage("Python"),
    ProgrammingLanguage("C"),
    ProgrammingLanguage("C++"),
    ProgrammingLanguage("Kotlin"),
    ProgrammingLanguage("Java"),
    ProgrammingLanguage("Python"),
    ProgrammingLanguage("C"),
    ProgrammingLanguage("C++"),
    ProgrammingLanguage("Kotlin"),
    ProgrammingLanguage("Java"),
    ProgrammingLanguage("Python"),
    ProgrammingLanguage("C"),
    ProgrammingLanguage("C++"),
    ProgrammingLanguage("Kotlin"),
    ProgrammingLanguage("Java"),
    ProgrammingLanguage("Python"),
    ProgrammingLanguage("C"),
    ProgrammingLanguage("C++"),
    ProgrammingLanguage("Kotlin"),
    ProgrammingLanguage("Java"),
    ProgrammingLanguage("Python"),
    ProgrammingLanguage("C"),
    ProgrammingLanguage("C++"),
    ProgrammingLanguage("Kotlin"),
    ProgrammingLanguage("Java"),
    ProgrammingLanguage("Python"),
    ProgrammingLanguage("C"),
    ProgrammingLanguage("C++"),
    ProgrammingLanguage("Kotlin"),
)