plugins {
	alias(libs.plugins.runique.android.feature.ui)
}

android {
	namespace = "br.android.cericatto.run.presentation"
}

dependencies {
	implementation(libs.coil.compose)
	implementation(libs.google.maps.android.compose)
	implementation(libs.androidx.activity.compose)
	implementation(libs.timber)

	implementation(projects.core.domain)
	implementation(projects.run.domain)
}