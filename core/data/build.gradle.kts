plugins {
	alias(libs.plugins.runique.android.library)
	alias(libs.plugins.runique.jvm.ktor)
}

android {
	namespace = "br.android.cericatto.core.data"
}

dependencies {
	implementation(libs.timber)

	implementation(projects.core.domain)
	implementation(projects.core.database)
}