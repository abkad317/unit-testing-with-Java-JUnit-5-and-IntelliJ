package com.assetco.hotspots.optimization;

import com.assetco.search.results.Asset;
import com.assetco.search.results.AssetVendor;
import com.assetco.search.results.AssetVendorRelationshipLevel;
import com.assetco.search.results.HotspotKey;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BugsTest {

    @Test
    void precedingPartnerWithLongTrailingAssetsDoesNotWin(){
        AssetVendor partnerVendor = makeVendor(AssetVendorRelationshipLevel.Partner);
        Asset missing = givenAssetInResultsWithVendor(partnerVendor);

        Asset partnerVendorAsset1 = givenAssetInResultsWithVendor(partnerVendor);
        Asset partnerVendorAsset2 = givenAssetInResultsWithVendor(partnerVendor);
        Asset partnerVendorAsset3 = givenAssetInResultsWithVendor(partnerVendor);
        Asset partnerVendorAsset4 = givenAssetInResultsWithVendor(partnerVendor);
        List<Asset> expected = List.of(partnerVendorAsset1, partnerVendorAsset2, partnerVendorAsset3, partnerVendorAsset4);

        whenOptimize();

        thenHotspotDoesNotHave(HotspotKey.Showcase, missing);
        thenHotspotHasExactly(HotspotKey.Showcase, expected);

    }

    void thenHotspotDoesNotHave(HotspotKey hotspotKey, Asset... assets) {

    }
    void thenHotspotHasExactly(HotspotKey hotspotKey, List<Asset> assets){

    }

    private void whenOptimize() {
    }

    private Asset givenAssetInResultsWithVendor(AssetVendor partnerVendor) {
        return null;
    }

    private AssetVendor makeVendor(AssetVendorRelationshipLevel basic) {
        return null;
    }

}
