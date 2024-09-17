plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {
    id  = "su.pank.fleetmacs"

    metadata {
        readableName = "Fleetmacs"
        description = "🔥 Just Emacs keymap for fleet."

        icons {
            default.set(project.layout.projectDirectory.file("iconPlugin.svg"))
            dark.set(project.layout.projectDirectory.file("iconPlugin.svg"))
        }
    }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}