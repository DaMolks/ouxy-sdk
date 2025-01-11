package com.damolks.ouxy.module

import android.view.View

/**
 * Interface que chaque module Ouxy doit implémenter.
 */
interface OuxyModule {
    /**
     * Appelé lors de l'initialisation du module.
     */
    fun initialize(context: ModuleContext)

    /**
     * Retourne la vue principale du module.
     */
    fun getMainView(): View

    /**
     * Appelé lors de la désinstallation.
     */
    fun cleanup()
}