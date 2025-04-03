package com.example.multilangapp.langmanag

import android.content.Context
import android.os.Build
import android.os.LocaleList
import java.util.Locale

fun isLocaleSetSystemWide(context: Context, localeToCheck: Locale): Boolean {
	val localeList: LocaleList = context.resources.configuration.locales
	for (i in 0 until localeList.size()) {
		if (localeList.get(i) == localeToCheck) {
			return true
		}
	}
	return false
}

//Example: check if spanish is a locale in the list
//val isSpanishInList = isLocaleSetSystemWide(this, Locale("es"))