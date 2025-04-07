import androidx.room.gradle.RoomExtension
import com.cericatto.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidRoomConventionPlugin: Plugin<Project> {

	override fun apply(target: Project) {
		target.run {
			pluginManager.run {
				apply("androidx.room")
				apply("com.google.devtools.ksp")
			}

			extensions.configure<RoomExtension>() {
//				schemaDirectory(project.layout.projectDirectory.dir("schemas").asFile.absolutePath)
				schemaDirectory("$projectDir/schemas")
			}

			dependencies {
				"implementation"(libs.findLibrary("room.runtime").get())
				"implementation"(libs.findLibrary("room.ktx").get())
				"ksp"(libs.findLibrary("room.compiler").get())
//				"ksp"(libs.findLibrary("room.ktx").get())
			}
		}
	}
}