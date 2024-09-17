package su.pank.frontendImpl

import fleet.frontend.keymap.KeymapId
import fleet.frontend.keymap.registerKeymap
import fleet.kernel.plugins.ContributionScope
import fleet.kernel.plugins.Plugin
import fleet.kernel.plugins.PluginScope

class FleetmacsPlugin: Plugin<Unit> {
    companion object : Plugin.Key<Unit>

    override val key: Plugin.Key<Unit> = FleetmacsPlugin

    override fun ContributionScope.load(pluginScope: PluginScope) {
        registerKeymap(id = KeymapId("fleetmacs"), presentableName = "emacs")
    }

}