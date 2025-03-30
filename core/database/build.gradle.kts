plugins {
	alias(libs.plugins.runique.android.library)
}

android {
	namespace = "br.android.cericatto.core.database"
}

dependencies {
	implementation(libs.org.mongodb.bson)

	implementation(projects.core.domain)
}