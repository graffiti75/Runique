plugins {
	alias(libs.plugins.runique.android.library)
}

android {
	namespace = "br.android.cericatto.run.network"
}

dependencies {
	implementation(projects.core.domain)
	implementation(projects.core.data)
}