package foundation.omni.test.consensus.chest.msc

import foundation.omni.consensus.ExplorerConsensusTool
import foundation.omni.test.consensus.BaseConsensusSpec
import spock.lang.Title

import static foundation.omni.CurrencyID.OMNI

/**
 */
@Title("Compare Omni Core vs. Omnichest API for OMNI currency")
class CompareCoreChestSpec extends BaseConsensusSpec {

    void setupSpec() {
        setupComparisonForCurrency(new ExplorerConsensusTool(ExplorerConsensusTool.ExplorerHost_Live),
                OMNI)
    }
}
