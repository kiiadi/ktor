import org.jetbrains.kotlin.gradle.plugin.*
import org.jetbrains.kotlin.gradle.plugin.mpp.*

description = "Ktor network utilities"

val nativeCompilations: List<KotlinNativeCompilation> by project.extra

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(project(":ktor-utils"))
            }
        }
    }
}
