module fleet.sample.frontendImpl {
    requires fleet.frontend;
    requires fleet.kernel;
    requires fleet.util.logging.api;
    requires fleet.rhizomedb;
    requires fleet.frontend.ui;

    exports su.pank.frontendImpl;
    provides fleet.kernel.plugins.Plugin with su.pank.frontendImpl.FleetmacsPlugin;
}