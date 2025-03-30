plugins {
	alias(libs.plugins.runique.android.feature.ui)
}

android {
	namespace = "br.android.cericatto.auth.presentation"
}

dependencies {
	implementation(projects.core.domain)
	implementation(projects.auth.domain)
}