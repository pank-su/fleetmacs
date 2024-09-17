plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {

    id = "su.pank.fleetmacs"

    metadata {
        readableName = "Fleetmacs (Emacs keymap for Jetbrains Fleet)"
        description = "Many people love Emacs and its keymap, but Emacs lacks proper support for Kotlin. Therefore, we use Jetbrains Fleet as an alternative. For those who prefer the Emacs keymap, I have recreated it for Fleet."
    }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}